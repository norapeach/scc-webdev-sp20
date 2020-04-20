/**
 * OctagonTest.java
 */
package assignment0_Octagon;

import static org.junit.Assert.*;

import org.junit.*; // instead of import org.junit.Test;

/**
 * @author Nora P.
 * @version 19.04.20
 * Description: Tests Octagon methods getSide(), calcArea(), testCalcPerimeter(),
 * setSide()
 * Reference for floating point assertions: https://www.guru99.com/junit-assert.html
 */
public class OctagonTest {
	Octagon o = new Octagon(3);
	
	@Test
	public void testGetSide() {
		assertEquals(3, o.getSide(), 0.001);
	}


	@Test
	public void testCalcArea() {
		assertEquals(43.45584, o.calcArea(), 0.001);
	}

	@Test
	public void testCalcPerimeter() {
		assertEquals(24, o.calcPerimeter(), 0.001);
		assertNotEquals(24.1, o.calcPerimeter(), 0.001);
	}
	
	@Test
	public void testSetSide() {
		o.setSide(4);
		assertEquals(4, o.getSide(), 0.001);
	}

}
