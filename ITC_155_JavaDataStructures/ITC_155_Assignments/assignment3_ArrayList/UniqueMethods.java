/**
 * UniqueArrayList.java
 */
package assignment3_ArrayList;

import java.util.ArrayList;

/**
 * @author Nora P.
 * @version 27.04.20
 * Description: BJP5 p 718 ch 10 ex 3,4
 * TODO: unsure if this is the right thing to do to get Junit test to work
 * 		 Not certain if this class should extend ArrayList or have its own constructor
 */
public class UniqueMethods {

	/**
	 * removes all even-length Strings from the given:
	 * @param ArrayList<String> list: the list from which to remove the even Strings
	 */
	public static void removeEvenLength(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i); // get each element at i
			if (str.length() % 2 == 0) { // check if length is even
				list.remove(i); // remove that element
				i--; // decrement i to account for shifted list length
			}
		}
	}
	
	/**
	 * Takes the given list and adds a duplicate of each Element:
	 * @param ArrayList<String> list: the given list to process
	 */
	public static void doubleList(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i+= 2) { // increments by 2 to account for added duplicate element
	        String str = list.get(i); // get String at index i
	        list.add(i + 1, str); // add that String at next index; e.g.: i = 0, str added at 1, i increments to 2 for next loop
	    }
	}
}
