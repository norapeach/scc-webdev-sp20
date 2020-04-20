/**
 * 
 */
package assignment0_Octagon;

/**
 * @author Nora P.
 * @version 17.04.20
 * example of an interface for the shape subclasses; contains
 * the required methods for all shapes
 */
public interface BasicShape {
	// these are abstract methods
	public double calcArea(); // TODO: override across all subclasses
	public double calcPerimeter(); // TODO: override across all subclasses
	public boolean equals(Object obj); // TODO: override across all subclasses
	public int hashCode(); // TODO: override across all subclasses
	public String toString(); // TODO: override across all subclasses
}
