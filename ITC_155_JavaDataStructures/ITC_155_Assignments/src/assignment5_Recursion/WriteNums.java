/**
 * WriteNums.java 
 */
package assignment5_Recursion;

/**
 * @author Nora P.
 * @version 12-05-20 ITC 155, BJP5 Exercise 12.2 This program tests the method
 *          writeNums that accepts an integer n and prints the first n integers
 *          starting with 1 in sequential order, separated by commas.
 *          TODO: research then write Junit test
 */
public class WriteNums {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Test results
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();

	}

	public static void writeNums(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("Illegal number entered: " + n); // if passed a value less than 1
		} else if (n == 1) {
			// base case met n is 1
			System.out.print(n);
		} else {
			writeNums(n - 1); // complete recursion
			System.out.print(", " + n); // output last value in range
		}

	}

}
