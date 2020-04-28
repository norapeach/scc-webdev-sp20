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
		// assertFalse(strs.isEmpty()); // checks that there are values
		UniqueMethods.removeEvenLength(strs);
		assertFalse(strs.isEmpty());
		assertEquals(expected, strs);
		expected.add("now");
		assertNotEquals(expected, strs);
		
	}

	/**
	 * Test method for {@link assignment3_ArrayList.UniqueMethods#doubleList(java.util.ArrayList)}.
	 */
	@Test
	public void testDoubleList() {
		strs = new ArrayList<>(Arrays.asList( "how", "are", "you"));
		ArrayList<String> expected = new ArrayList<>(Arrays.asList("how", "how", "are", "are", "you", "you"));
		UniqueMethods.doubleList(strs);
		assertFalse(strs.isEmpty());
		assertEquals(expected, strs);
		expected.add("now");
		assertNotEquals(expected, strs);
	}

}
