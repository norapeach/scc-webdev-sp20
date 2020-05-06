/**
 * JTestIsUnique.java
 */
package assignment4_Collections;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;

/**
 * @author Nora P.
 * @version 04.05.20
 * Description: Assignment4, BJP5 p759 Exercise 11.13
 * Tests for class IsUnique static method isUnique
 * and 2nd version implemented in a potentially more efficient way
 */
public class JTestIsUnique {
	private Map<String, String> map1; // declare instance to be used in setUp / tearDown methods
	private Map<String, String> map2;
	private Map<String, String> map3;
	private Map<String, String> map4;

	/**
	 * TODO do I add "@throws" java.lang.Exception here and after method identifier () add "throws Exception"
	 * TODO if I add the exceptions, I need to test for the exceptions
	 */
	@Before
	public void setUp()  {
		map1 = new HashMap<>(); // create HashMap instances (no need for sorted mappings)
		map2 = new HashMap<>();
		map3 = new HashMap<>(); // will be left empty
		map4 = new HashMap<>();
		
		// add mappings
		map1.put("Marty", "Stepp");
		map1.put("Stuart", "Reges");
		map1.put("Jessica", "Miller");
		map1.put("Amanda", "Camp");
		map1.put("Hal", "Perkins");
		
		map2.put("Kendrick", "Perkins");
		map2.put("Stuart", "Reges");
		map2.put("Jessica", "Miller");
		map2.put("Bruce", "Reges");
		map2.put("Hal", "Perkins");
		
		map4.put(null, null);
		map4.put("Stuart", "Reges");
		map4.put("Esme", "Bun");
	}

	/**
	 * TODO do I add "@throws" java.lang.Exception here and after method identifier "throws Exception"
	 */
	@After
	public void tearDown() {
		map1.clear();
		map2.clear();
	}
	
	/**
	 * TODO: evaluate try/catch - how to test for exceptions
	 */
	@Test
	public void testIsUnique() {
		assertTrue(map3.isEmpty());
		assertTrue(IsUnique.isUnique(map3)); // test that method returns true if passed an empty Map
		assertTrue(IsUnique.isUnique(map1)); // test map1 containing all unique key/value mappings - true
		assertFalse(IsUnique.isUnique(map2)); // map2 contains keys that map to duplicate values - false
		try {
			assertTrue(IsUnique.isUnique(map4)); // qualifies as true as no repeat values
			map4.replace(null, "Bun"); // replace value at key null 
			assertFalse(IsUnique.isUnique(map4)); // now false as null maps to same value as "Esme"
		}
		catch (NullPointerException e) { // TODO: how do I test for this?
			System.out.println("Exception caught:" + e);
		}
	}
	
	/**
	 * TODO: tests for exceptions
	 */
	@Test 
	public void testIsUnique2() {
		assertTrue(IsUnique.isUnique2(map3)); // true - empty map is unique
		assertTrue(IsUnique.isUnique2(map1));
		assertFalse(IsUnique.isUnique2(map2));
	}

}
