/**
 * Octagon.java
 */
package assignment0_Octagon;

/**
 * @author Nora P.
 * @version 17.04.20
 * Description: Instances of this class represent regular octagons e.g. 8-sided
 * polygons. Meets requirements of overriding BasicShape interface methods.
 */
public class Octagon implements BasicShape {
	// Represents an Octagon defined by its side length
	// Assumes that all 8 sides are of equal length
	private double side;
	
	
	/**
	 * @param Constructs a new Octagon instance with the given side
	 */
	public Octagon(double side) {
		this.side = side;
	}
	

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param the given length value to assign to side
	 */
	public void setSide(double side) {
		this.side = side;
	}


	@Override
	public double calcArea() {
		// Formula for Octagon = 2a^2(1+√2)
		return 2 * (this.getSide() * this.getSide()) * (1.0 + Math.sqrt(2.0));
	}

	@Override
	public double calcPerimeter() {
		// Formula for Perimeter: 8 * side length
		return 8 * this.side;
	}


	@Override
	public int hashCode() {
		// source http://www.technofundo.com/tech/java/equalhash.html
		final int prime = 31; // Eclipse stores as variable prime
		int result = 1; // like the hash variable in Triangle
		long temp;
		temp = Double.doubleToLongBits(side);
		result = prime * result + (int) (temp ^ (temp >>> 32)); // done slightly differently in Triangle
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())){
			return false;
		}
		
		Octagon other = (Octagon) obj; // cast other to Octagon to compare state values
		if (Double.doubleToLongBits(side) != Double.doubleToLongBits(other.side)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return "Octagon [ side length = " + getSide() + ", calcArea() = " + 
				calcArea() + ", calcPerimeter() = " + calcPerimeter() + " ]";
	}
	
	

}
