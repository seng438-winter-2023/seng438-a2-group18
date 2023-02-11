package org.jfree.data.test;


import static org.junit.Assert.*; import org.jfree.data.Range; import org.junit.*;

public class RangeTest{
    private Range testRange;
    
    private Range exampleRange;
	private Range exampleRange2;

	private Range rangeN;
	private Range rangeZ;
	private Range rangeP;
	private Range rangeDoub;
	
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { 
    	testRange = new Range(-4, 8);
    	
    	exampleRange = new Range(-1, 1);
		exampleRange2 = new Range(-1, -1);//size zero
		
		rangeN = new Range(-10, 1);   // range for negative lower bound
		rangeZ = new Range(0, 0);      // range for lower and upper bound being 0
		rangeP = new Range(1, 10);     // range for positive lower bound
		rangeDoub = new Range(2.5, 5.0);     // range for double values
		
    }
    
    // constrain() test cases
    /*if the input number is lower than the lower boundary of the range than the constrain should be the lower boundary*/
	@Test
	public void numberLowerThanLowerBoundary() {
		assertEquals("The constrain value of -5 in the range of -1 and 1 should be -1)",-1,exampleRange.constrain(-5), 0.000001d);
	}
	
	/*if the input number is lower than the lower boundary of a range of zero than the constrain should be the lower boundary*/
	@Test
	public void numberLowerThanLowerBoundaryWithRangeZero() {
		assertEquals("The constrain value of -5 in the range of -1 and -1 should be -1)",-1,exampleRange2.constrain(-5), 0.000001d);
	}
	
	/*if the input number is higher than the upper boundary of the range than the constrain should be the upper boundary*/
	@Test
	public void numberHigherThanUpperBoundary() {
		assertEquals("The constrain value of 5 in the range of -1 and 1 should be 1)",1,exampleRange.constrain(-5), 0.000001d);
	}
	
	/*if the input number is higher than the upper boundary of a range of zero than the constrain should be the upper boundary*/
	@Test
	public void numberHigherThanUpperBoundaryWithRangeZero() {
		assertEquals("The constrain value of 5 in the range of -1 and -1 should be -1)",-1,exampleRange2.constrain(-5), 0.000001d);
	}
	
	/*if the input number is within the range than the constrain should be the input*/
	@Test
	public void numberWithinRange() {
		assertEquals("The constrain value of 0 in the range of -1 and 1 should be 0)",0,exampleRange.constrain(-5), 0.000001d);
	}
	
	/*if the input number is equal to the lower boundary of the range than the constrain should be the input/lower boundary*/
	@Test
	public void numberIsLowerBoundary() {
		assertEquals("The constrain value of -1 in the range of -1 and 1 should be -1)",-1,exampleRange.constrain(-5), 0.000001d);
	}
	
	/*if the input number is equal to the upper boundary of the range than the constrain should be the input/upper boundary*/
	@Test
	public void numberIsUpperBoundary() {
		assertEquals("The constrain value of 1 in the range of -1 and 1 should be 1)",1,exampleRange.constrain(-5), 0.000001d);
	}
	
	// getLength() test cases
	// pass: returns the correct length
    @Test
    public void getLengthValidOutput() {
        assertEquals("The length of the range from -4 to 8 should be 12",
        12, testRange.getLength(), .000000001d);
    }
    
    // combine() test cases
    /*first range is null*/
	@Test
	public void firstRangeNull() {	
		assertEquals("The combination of null range and range[-1,1] should be [-1,1]",new Range(-1,1),Range.combine(null,(new Range(-1,1))));
	}
	
	/*second range is null*/
	@Test
	public void secondRangeNull() {	
		assertEquals("The combination of range[-1,1] and null range should be [-1,1]",new Range(-1,1),Range.combine((new Range(-1,1)),null));
	}
	
	/*both ranges are null*/
	@Test
	public void bothRangeNull() {	
		assertEquals("The combination of two null ranges should be null",null,Range.combine(null,null));
	}
	
	/*identical ranges*/
	@Test
	public void identicalRanges() {	
		assertEquals("The combination of range[-1,1] and range[-1,1] should be [-1,1]",new Range(-1,1),Range.combine((new Range(-1,1)),(new Range(-1,1))));
	}
	
	/*ranges are continuous*/
	@Test
	public void continuousRanges() {	
		try{
			assertEquals("The combination of range[-1,1] and range[1,2] should be [-1,2]",new Range(-1,2),Range.combine((new Range(-1,1)),(new Range(1,2))));
		}
		catch(Exception e) {
			fail(" continuousRanges should not have an error but we get "+ e.getClass() + e.getMessage());
		}
	}
	
	/*ranges are not continuous*/
	@Test
	public void notContinuousRanges() {	
		try {
			assertEquals("The combination of range[-1,1] and range[5,10] should be [-1,10]",new Range(-1,10),Range.combine((new Range(-1,1)),(new Range(5,10))));
		}
		catch(Exception e) {
			fail(" notContinuousRanges should not have an error but we get "+ e.getClass() + e.getMessage());
		}
	}
	
	// getLowerBound() test
	@Test
	public void testNegativeNumberForLowerBound() { // Lower bound being a negative number  
		assertEquals("The value of lower bound should return -10",-10, rangeN.getLowerBound(), .000000001d);
	}
     
	@Test
	public void testZeroForLowerBound() { // Lower bound being at 0         
		assertEquals("The value of lower bound should return 0", 0, rangeZ.getLowerBound(), .000000001d);
	}
     
    @Test
    public void testPositiveNumberForLowerBound() { // Lower bound being a positive number   
	assertEquals("The value of lower bound should return 1", 1, rangeP.getLowerBound(), .000000001d);
    }

    @Test
    public void testDoubleForLowerBound() { // Lower bound being a double
	assertEquals("The value of lower bound should return 2.5", 2.5, rangeDoub.getLowerBound(), .000000001d);
    }
	
    // getUpperBound() test cases
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
		assertEquals("The value of upper bound should return 5.0", 5.0, rangeDoub.getLowerBound(), .000000001d);
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
