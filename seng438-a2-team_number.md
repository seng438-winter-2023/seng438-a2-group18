**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report \#2 – Requirements-Based Test Generation**

| Group \#:       | 18 |
|-----------------|---|
| Student Names:  |  Muteeba Jamal |
|                 |  Shahzill Naveed |
|                 |  Iman Niaz |
|                 |  Rumaisa Talukder |

# 1 Introduction

The purpose of this lab is to get familiar with testing services provided by java. We were supposed to use testing tools such as JUnit framework to test different algorithms for JFreeChart. To make sure our testing was thorough and efficient, for harder tests we used mock objects to simulate the condition, and for simpler tests we used unit tests. All of this was done on Eclipse as instructed by our lab document.

# 2 Detailed description of unit test strategy

// including the input partitions you have designed

# 3 Test cases developed

Range:

| Method To Test | Test Method Name | Test Type |
|-----------------|---|---|
| getLength() | getLengthValidOutput() | ECT
| constrain(double value) | numberLowerThanLowerBoundary() | ECT
| constrain(double value) | numberLowerThanLowerBoundaryWithRangeZero() | ECT
| constrain(double value) | numberHigherThanUpperBoundary() | ECT
| constrain(double value) | numberHigherThanUpperBoundaryWithRangeZero() | ECT
| constrain(double value) | numberWithinRange() | ECT
| constrain(double value) | numberIsLowerBoundary() | ECT
| constrain(double value) | numberIsUpperBoundary() | ECT
| combine(Range range1, Range range2) | firstRangeNull() | BVT
| combine(Range range1, Range range2) | secondRangeNull() | BVT
| combine(Range range1, Range range2) | bothRangeNull() | BVT
| combine(Range range1, Range range2) | identicalRanges() | ECT
| combine(Range range1, Range range2) | continuousRanges() | ECT
| combine(Range range1, Range range2) | notContinuousRanges() | ECT
| getLowerBound() | testNegativeNumberForLowerBound() | ECT
| getLowerBound() | testZeroForLowerBound() | ECT
| getLowerBound() | testPositiveNumberForLowerBound() | ECT
| getLowerBound() | testDoubleForLowerBound() | ECT
| getUpperBound() | testNegativeNumberForUpperBound() | ECT
| getUpperBound() | testZeroForUpperBound() | ECT
| getUpperBound() | testPositiveNumberForUpperBound() | ECT
| getUpperBound() | testDoubleForUpperBound() | ECT



DataUtilities:

| Method To Test | Test Method Name | Test Type |
|-----------------|---|---|
| createNumberArray(double[] data) | createNumberArrayFourDoubleElements() | ECT 
| createNumberArray(double[] data) | createNumberArrayThreeDoubleElements() | ECT 
| createNumberArray(double[] data) | createNumberArraySizeTest() | ECT 
| createNumberArray(double[] data)| createNumberArrayNullArgument() | BVT
| createNumberArray2D(double[] data) | create2DNumberArrayThreeDoubleElements() | ECT
| createNumberArray2D(double[] data) | create2DNumberArrayTwoDoubleElements() | ECT
| createNumberArray2D(double[] data) | create2DNumberArraySizeTest() | ECT
| createNumberArray2D(double[] data) | create2DNumberArrayNullArgument() | BVT
| calculateColumnTotal(Values2D data, int column) | calculateColumnTotalForThreeRows() | ECT
| calculateColumnTotal(Values2D data, int column) | calculateColumnTotalForMultipleRows() | ECT
| calculateColumnTotal(Values2D data, int column) | calculateColumnTotalForInvalidObject() | BVT
| calculateRowTotal(Values2D data, int column) | calculateRowTotalForOneRows() | ECT
| calculateRowTotal(Values2D data, int column) | calculateRowTotalForMultipleRows() | ECT
| calculateRowTotal(Values2D data, int column) | calculateRowTotalForInvalidObject() | BVT
| getCumulativePercentages() | getCumulativePercentagesValidKeyedValuesAllElements() | ECT
| getCumulativePercentages() | allZeroRows() | ECT
| getCumulativePercentages() | lastTwoRowsZero() | ECT
| getCumulativePercentages() | firstThreeRowsZero() | ECT
| getCumulativePercentages() | getCumulativePercentagesNullArgument() | ECT


# 4 How the team work/effort was divided and managed

During the lab time period we went over all the tests that were required for this lab. We discussed the tests and mutaully came up with what kind of JUnit and JMock tests will be required for specific methods in the JFreeChart system. Since we were supposed to do ten tests, Muteeba and Shahzill did 3 of the tests each whereas Rumaisa and Iman did two tests each. To make the workload more even, Iman and Rumaisa did the greater part of the report whereas Shahzill and Muteeba worked on the introduction and conclusion. 

# 5 Difficulties encountered, challenges overcome, and lessons learned

For this lab, we had to work on our test files on Eclipse. As not everyone on the team was familiar with using Eclipse, we had to take some time installing and learning how to work on this platform before starting the contents of the lab. We divided the workload amongst us for efficiency, with each of us doing 2-3 tests. Whenever a test case failed, it was difficult to confirm if there was a bug or if there was a mistake made in the code. We overcame this by having at least two people review test-cases for a method that one member was confused about.

# 6 Comments/feedback on the lab itself

Text…
