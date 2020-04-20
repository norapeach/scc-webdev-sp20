/**
 * 
 */
package assignment0_Octagon;

import java.lang.Cloneable; 
//Implementing Cloneable interface 
//ensures that instances of class Triangle 
//can be cloned. 
/**
 * @author Nora P.
 * TODO: test clone(), equals() hashCode()
 *
 */
public class Triangle implements BasicShape, Cloneable {
	//Represents triangle shapes.
	private double a;
	private double b;
	private double c;


 
 	// Constructs a new Triangle given side lengths.
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
 
	/**
	 * @return the a
	 */
	public double getA() {
		return a;
	}


	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}


	/**
	 * @return the c
	 */
	public double getC() {
		return c;
	}

	/**
	 * @param a the side to set
	 */
	public void setA(double a) {
		this.a = a;
	}

	/**
	 * @param b the side to set
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @param c the side to set
	 */
	public void setC(double c) {
		this.c = c;
	}

	@Override
	public boolean equals(Object obj) {
		// obj compared with itself returns true
		if (this == obj) {
			return true;
		}
		/* using getClass() instead of instanceof in case
		 * triangle is later extended with subclass 
		 * http://www.technofundo.com/tech/java/equalhash.html
		 * */
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			return false;
		}
		  
        // typecast obj to Triangle to compare data fields
		/* if Triangle state included object reference e.g. String type
		 * object references can be compared by invoking their equals method recursively. 
		 * You also need to ensure that invoking equals method on these object references 
		 * does not result in a NullPointerException
		 * e.g. in condition: (data == test.data || (data != null && data.equals(test.data)));
		 */
		Triangle t = (Triangle) obj;
		return a == t.a && b == t.b && c == t.c; 
	}
	
	

	@Override
	public int hashCode() {
		// Implement hashcode using all 3 variables from equals()
		// taken from http://www.technofundo.com/tech/java/equalhash.html
		int hash = 7; // arbitrary, non-zero constant value
		long bitsA = Double.doubleToLongBits(a);
		int var_codeA = (int)(bitsA ^ (bitsA >>> 32));
		long bitsB = Double.doubleToLongBits(b);
		int var_codeB = (int)(bitsB ^ (bitsB >>> 32));
		long bitsC = Double.doubleToLongBits(c);
		int var_codeC = (int)(bitsC ^ (bitsC >>> 32));
		hash = 31 * hash + var_codeA;
		hash = 31 * hash + var_codeB;// example adds this for String type (null == data ? 0 : data.hashCode());
		hash = 31 * hash + var_codeC;
		return hash;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// returns type Object -- when using need to down-cast
		// e.g. A b = (A)a.clone();
		// cloning 'a' and holding 
        // new cloned object reference in b 
		return super.clone();
	}

	// Returns this triangle's area using Heron's formula.
	public double calcArea() {
		double s = (a + b + c) / 2.0;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	// Returns the perimeter of this triangle.
	public double calcPerimeter() {
		return this.getA() + this.getB() + this.getC();
	}


	@Override
	public String toString() {
		return "Triangle [ Sides: a = " + this.getA() + ", b = " + this.getB() + ", c = " + 
				this.getC() + ", calcArea() = " + calcArea() + ", calcPerimeter() = "
				+ calcPerimeter() + " ]";
	}
	
	
	
}