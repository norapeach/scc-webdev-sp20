/**
 * ClientIsUnique.java
 */
package assignment4_Collections;

import java.util.*;
/**
 * @author Nora P.
 * @version 3.05.20
 * Description: Assignment4, BJP5 p759 Exercise 11.13
 * Client/Driver code to demonstrate the functionality of the isUnique static
 * method. Below, a Map containing mappings from String keys to String values is
 * instantiated and passed to isUnique. The method will return true if no two keys
 * map to the same value, or if the method is passed an empty Map.
 * See junit tests: JTestIsUnique.java
 * TODO: complete junit tests for isUnique2 
 */

public class ClientIsUnique {

	
	public static void main(String[] args) {
		// create and define two example maps to test to variables
		Map<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		
		// add k/v mappings 
		map1.put("Marty", "McFly");
		map1.put("Stuart", "Reges");
		map1.put("Jessica", "McFly");
		map1.put("Amanda", "Camp");
		map1.put("Hal", "Perkins");
		
		map2.put("Kendrick", "Lamar");
		map2.put("Stuart", "Reges");
		map2.put("Jessica", "Miller");
		map2.put("Bruce", "Wayne");
		map2.put("Hal", "Perkins");
		
		// run method and output results
		System.out.println("Original map1: " + map1.toString());
		System.out.println("All keys map to unique values: " + IsUnique.isUnique(map1));
		System.out.println("Test for isUnique2: " + IsUnique.isUnique2(map1) + "\n");
		System.out.println("Original map2: " + map2.toString());
		System.out.println("All keys map to unique values: " + IsUnique.isUnique(map2));
		System.out.println("Test for isUnique2: " + IsUnique.isUnique2(map2) + "\n");
	}

}
