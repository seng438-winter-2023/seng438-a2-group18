package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

public class getLowerBoundTest {

	private Range rangeN;
	private Range rangeZ;
	private Range rangeP;
	private Range rangeDoub;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		rangeN = new Range(-10, -1);   // range for negative lower bound
		rangeZ = new Range(0, 0);      // range for lower and upper bound being 0
		rangeP = new Range(1, 10);     // range for positive lower bound
		rangeDoub = new Range(2.5, 5.0);     // range for double values
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
    
    @After
    public void tearDown() throws Exception {
    	
    }
    
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
