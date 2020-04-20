package assignment0_Octagon;

/**
 * @author Nora P.
 * @version 17.04.20
 * ITC 155 Data Systems
 * Description: Building Java Programs, 5th ed. Pg 664 Ex. 15
 * Test code for the Octagon class (objects represent regular octagons - 8-sided
 * polygons). Octagon implements the BasicShape interface. Client code also includes tests for Triangle Class.
 * TODO: add Junit tests
 */

public class ShapeClient {

	public static void main(String[] args) 
			throws CloneNotSupportedException 
	{
		
		
		// polymorphic array of BasicShape objects
		BasicShape[] shapes = new BasicShape[3];
		shapes[0] = new Octagon(8); // area should be 309.01934
		shapes[1] = new Octagon(3); // 43.45584
		shapes[2] = new Triangle(30, 10, 30);
		
		
		// test Triangle.clone() 
		Triangle t = (Triangle) ((Triangle) shapes[2]).clone(); // has to be cast to Triangle type;
		Triangle t1 = new Triangle(30, 10, 30);
		
		// loop through shapes array and output toString()
				for (int i = 0; i < shapes.length; i++) {
					System.out.println(shapes[i]);
				}
				System.out.println();
				
		//// TESTS for Octogon equals(), hashCode()
		System.out.println("Are the first two shapes equal?: " + shapes[0].equals(shapes[1]));
		System.out.println("Hashcode shapes[0]: " + shapes[0].hashCode() + "\t" + "Hashcode shapes[1]: " 
							+ shapes[1].hashCode() + "\n");
		
		
		
		//// TESTS for Triangle toString(), equals(), hashCode()
		System.out.println("1st triangle: \n" + shapes[1] + "\n");
		// toString() test
		System.out.println("2nd triangle: \n" + t + "\n"); // TODO: outputting NaN for area - debug
		// equals test
		System.out.println("Does Triangle t1 equal Triangle t: " + t1.equals(t));
		// sample output of overrode hashCode() in Triangle class
		System.out.println("T1 code: " + t1.hashCode() + "\t" + "T code: " + t.hashCode());
	}

}
