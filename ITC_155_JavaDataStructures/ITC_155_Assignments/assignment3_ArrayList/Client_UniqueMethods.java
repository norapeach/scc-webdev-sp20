/**
 * Client_UniqueMethods.java
 */
package assignment3_ArrayList;

import java.util.*;

/**
 * @author Nora P.
 * @version 27.04.20
 * Description: BJP5 p 718 ch 10
 * ex 3 Method: removeEvenLength removes all even-length Strings from passed List
 * ex 4 Method: doubleList replaces every String with two of that same String
 */
public class Client_UniqueMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
		System.out.println("The original list: " + strs);
		UniqueMethods.removeEvenLength(strs);
		
		System.out.println("Above list with Strings of even length removed: " + strs);
		UniqueMethods.doubleList(strs); // test of ex 4 method
		System.out.println("doubleList test: " + strs);
	}

}
