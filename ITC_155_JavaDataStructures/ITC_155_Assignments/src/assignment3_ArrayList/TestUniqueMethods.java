/**
 * 
 */
package assignment3_ArrayList;

import static org.junit.Assert.*;

import java.util.*;
import org.junit.*;

/**
 * @author Nora P.
 * @version 27.04.20
 * Description: BJP5 p 718 ch 10 ex 3,4
 * TODO: update to handle potential exceptions that could occur
 */
public class TestUniqueMethods {
	private ArrayList<String> strs; // declare property to be used in setUp / tearDown methods
	
	@Before
	public void setUp() {
		strs = new ArrayList<>(Arrays.asList("so", "how", "are", "you", "today?"));
		
	}

	@After
	public void tearDown() {
		strs = null; // TODO: what would be the tearDown? Does this work?
		
	}

	/**
	 * Test method for {@link assignment3_ArrayList.UniqueMethods#removeEvenLength(java.util.ArrayList)}.
	 */
	@Test
	public void testRemoveEvenLength() {
		strs = new ArrayList<>(Arrays.asList("so", "how", "are", "you", "today?"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("how", "are", "you"));
		int testStr = strs.get(0).length(); // get length of a String
		String toStringExpected = "[how, are, you]";
		assertTrue(strs.size() == 5);
		assertTrue(testStr % 2 != 1); // after the method call, confirm it is odd
		
		UniqueMethods.removeEvenLength(strs); 
		
		assertTrue(strs.size() == expected.size()); // lengths match
		assertEquals(expected, strs); // Elements match
		testStr = strs.get(0).length();
		assertTrue(testStr % 2 == 1); // after the method call, confirm it is odd
		expected.add("now");
		assertNotEquals(expected, strs); // after additional element added, no longer Equal
		assertEquals(strs.toString(), toStringExpected);
		
		
		
		
	}

	/**
	 * Test method for {@link assignment3_ArrayList.UniqueMethods#doubleList(java.util.ArrayList)}.
	 */
	@Test
	public void testDoubleList() {
		strs = new ArrayList<>(Arrays.asList( "how", "are", "you"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("how", "how", "are", "are", "you", "you"));
		String str1 = strs.get(0); // two example elements stored
		String str2 = strs.get(1);
		assertTrue(strs.size() == 3);
		assertFalse(str1.equals(str2)); // not equal values before method call
		UniqueMethods.doubleList(strs);
		assertTrue(strs.size() == expected.size()); // size matches
		str1 = strs.get(0); // after method call values are equal
		str2 = strs.get(1);
		assertTrue(str1.equals(str2));
		assertEquals(expected, strs);
		assertEquals(strs.toString(), expected.toString());
		expected.add("now");
		assertNotEquals(expected, strs);
	}

}
