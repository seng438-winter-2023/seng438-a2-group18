package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.*;

public class CombineTest{
	@BeforeClass public static void setUpBeforeClass() throws Exception {
    }
	@Before
    public void setUp() throws Exception {		
	}
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
	@After
	public void tearDown() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
