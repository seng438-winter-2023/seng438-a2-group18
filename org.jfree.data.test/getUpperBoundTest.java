package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

public class getUpperBoundTest {
	
	private Range rangeN;
	private Range rangeZ;
	private Range rangeP;
	private Range rangeDoub;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		rangeN = new Range(-10, -1);   // range for negative upper bound
		rangeZ = new Range(0, 0);      // range for lower and upper bound being 0
		rangeP = new Range(1, 10);     // range for positive upper bound
		rangeDoub = new Range(3.5, 6.0); // range for double values
	}
	
	@Test
	public void testNegativeNumberForUpperBound() { // Upper bound being a negative number  
		assertEquals("The value of upper bound should return -1", -1, rangeN.getUpperBound(), .000000001d);
	}
	// Test has a failure, the upper bound is not returned
	// Test passes for the value of the lower bound
     
	@Test
	public void testZeroForUpperBound() { // Upper bound being at 0         
		assertEquals("The value of upper bound should return 0", 0, rangeZ.getUpperBound(), .000000001d);
	}
	// Test passes only because lower bound == upper bound == 0
     
	@Test
	public void testPositiveNumberForUpperBound() { // Upper bound being a positive number   
		assertEquals("The value of upper bound should return 10", 10, rangeP.getUpperBound(), .000000001d);
	}
	// Test has a failure, the upper bound is not returned
	// Test passes for the value of the lower bound
    
	@Test
	public void testDoubleForUpperBound() { // Upper bound being a double   
		assertEquals("The value of upper bound should return 6.0", 6.0, rangeDoub.getLowerBound(), .000000001d);
	}
	// Test has a failure, the upper bound is not returned
	// Test passes for the value of the lower bound
    
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
