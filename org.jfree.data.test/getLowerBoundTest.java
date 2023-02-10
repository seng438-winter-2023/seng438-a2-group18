package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

public class getLowerBoundTest {
	
	private Range rangeN;
	private Range rangeZ;
	private Range rangeP;
	private Range rangeDoub;
	private Range rangeDiff;
	private Range rangeDiff2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		rangeN = new Range(-10, 1);   // range for negative lower bound
		rangeZ = new Range(0, 0);      // range for lower and upper bound being 0
		rangeP = new Range(1, 10);     // range for positive lower bound
		rangeDoub = new Range(2.5, 5.0);     // range for double values
		rangeDiff = new Range(4.2, 6);   // range for a double and an integer 
		rangeDiff2 = new Range(1, 2.8);   // range for a double and an integer 
	}
	
	@Test
	public void testNegativeNumberForLowerBound() { // Lower bound being a negative number  
		assertEquals("Expecting it to return -10",-10, rangeN.getLowerBound(), .000000001d);
	}
     
	@Test
	public void testZeroForLowerBound() { // Lower bound being at 0         
		assertEquals("Expecting it to return 0", 0, rangeZ.getLowerBound(), .000000001d);
	}
     
        @Test
        public void testPositiveNumberForLowerBound() { // Lower bound being a positive number   
		assertEquals("Expecting it to return 1", 1, rangeP.getLowerBound(), .000000001d);
        }
    
        @Test
        public void testDoubleForLowerBound() { // Lower bound being a double
		assertEquals("Expecting it to return 2.5", 2.5, rangeDoub.getLowerBound(), .000000001d);
        }
    
        @Test
        public void testMixedForLowerBound() { // Lower bound being a double, Upper bound being an integer
		assertEquals("Expecting it to return 4.2", 4.2, rangeDiff.getLowerBound(), .000000001d);
        }
    
        @Test
        public void testMixed2ForLowerBound() { // Lower bound being an integer, Upper bound being a double
		assertEquals("Expecting it to return 1", 1, rangeDiff2.getLowerBound(), .000000001d);
        }
    
        @After
        public void tearDown() throws Exception {
    	
        }
    
        @AfterClass
        public static void tearDownAfterClass() throws Exception {
        }
}
