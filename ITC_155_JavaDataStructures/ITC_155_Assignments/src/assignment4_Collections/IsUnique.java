/**
 * IsUnique.java
 */
package assignment4_Collections;

import java.util.*;

/**
 * @author Nora P.
 * @version 02.05.20
 * Description:
 * BJP5 p759 Exercise 11.13: 
 * Demonstrates the method isUnique that accepts a Map from Strings to Strings as a parameter 
 * and returns true if no two keys map to the same value (and false if any two or more keys 
 * do map to the same value). An empty map is considered unique, so the method will return true
 * if passed an empty map.
 * 
 * A 2nd method isUnique2 has the same functionality, but I wanted to attempt implementing the method
 * in a different way that may be more efficient as it doesn't require looping through all of the
 * original mappings before the conditional expression is run
 */
public class IsUnique {
	// constant for the max number of values a key can map to
	public static final int MAX = 2;
	
	/**
	 * @param m - the map to evaluate for unique key/value mappings
	 * @return boolean based on 
	 */
	public static boolean isUnique(Map<String, String> m) {
		if (m.isEmpty()) {
			return true;
		} else {
			ArrayList<String> original = new ArrayList<>(); // allows for duplicate values
			Set<String> uniqueVals = new HashSet<>(); // only allows for unique values
			for (String key : m.keySet()) { // loop through m keys
				original.add(m.get(key)); // add the value to the ArrayList
				uniqueVals.add(m.get(key)); // will only add unique values - no duplicates
			}
		 
			// the original values List is larger or equal in size to the unique Set
			if (!(original.size() > uniqueVals.size()) || original.size() == uniqueVals.size()) {
				return true; // --> all unique mappings
			} else {
				return false;
			}
		}	
	}
	
	/**
	 * 2nd option: same functionality as above, but with a slightly different implementation.
	 * Instead of for-each looping through the map's keys and creating two data structures storing the values in different ways,
	 * An iterator is used in this version and each value is evaluated - this version can break the loop and return false if 
	 * a 2nd key maps to a value already tracked by the HashSet.
	 * @param m - the map to evaluate for unique key/value mappings
	 * @return boolean based on if duplicates are present in value mappings
	 */
	public static boolean isUnique2(Map<String, String> m) {
		// 1. check for an empty map - considered unique
		if (m.isEmpty()) {
			return true;
		} else {
			List<String> origVals = new ArrayList<>(m.values()); // create ArrayList containing the map values
			Set<String> uniqueVals = new HashSet<>(); // only allows for unique values to be added
			Iterator<String> itr = origVals.iterator(); // iterator over the elements in this list in proper sequence
			while(itr.hasNext()) {
				String el = itr.next(); // get next value
				if (uniqueVals.contains(el)) { // if value is already present, duplicate key mapping exists
					return false; // break out of loop and method to return false at first duplicate encountereed
				} else {
					uniqueVals.add(el); // add value to Set
				}
			}
			return true; // post: loop has completed without the if structure above evaluating to true
		}
		
	}
	

}
