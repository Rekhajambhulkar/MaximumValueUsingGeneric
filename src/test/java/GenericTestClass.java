package com.generictest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenericTestClass {

	//Test case for greatest Integer FirstValue True
	@Test
	public void FirstMaximumIntegerValue_FirstPositionTrue() {
		Integer firstValue = 40, secondValue = 30, thirdValue = 25;
		FindMax main = new FindMax();
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	 //Test case for greatest Integer FirstValue False
        @Test
        public void FirstMaximumIntegerValue_FirstPositionFalse() {
                Integer firstValue = 20, secondValue = 30, thirdValue = 25;
                FindMax main = new FindMax();
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(firstValue, max);
        }

	//Test case for greatest Integer SecondValue True
	@Test
	public void secondMaximumIntegerValue_SecondPositionTrue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 25;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);
	}

	 //Test case for greatest Integer SecondValue False
        @Test
        public void secondMaximumIntegerValue_SecondPositionTrue() {
                FindMax main = new FindMax();
                Integer firstValue = 20, secondValue = 10, thirdValue = 25;
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(secondValue, max);
        }

	//Test case for greatest Integer ThirdValue True
	@Test
	public void thirdMaximumIntegerValue_ThirdsPositionTrue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 35;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);
	}

	//Test case for greatest Integer ThirdValue False
        @Test
        public void thirdMaximumIntegerValue_ThirdPositionFalse() {
                FindMax main = new FindMax();
                Integer firstValue = 20, secondValue = 30, thirdValue = 25;
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(thirdValue, max);
        }

	// Test case for greatest Float FirstValue True
	@Test
	public void FirstMaximumFloatValue_FirstPositionTrue() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 2.5f, thirdValue = 3.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	
        // Test case for greatest Float FirstValue False
        @Test
        public void FirstMaximumFloatValue_FirstPositionFalse() {
                FindMax main = new FindMax();
                Float firstValue = 1.6f, secondValue = 2.5f, thirdValue = 3.5f;
                Float max = main.checkFloatmax(firstValue, secondValue, thirdVa>
                Assert.assertNotEquals(firstValue, max);
        }


	// Test case for greatest Float Second True
	@Test
	public void secondMaximumFloatValue_SecondtPositionTrue() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 6.5f, thirdValue = 3.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);
	}

	 // Test case for greatest Float Second False
        @Test
        public void secondMaximumFloatValue_SecondtPositionFalse() {
                FindMax main = new FindMax();
                Float firstValue = 5.6f, secondValue = 2.5f, thirdValue = 3.5f;
                Float max = main.checkFloatmax(firstValue, secondValue, thirdVa>
                Assert.assertNotEquals(secondValue, max);
        }


	// Test case for greatest Float ThirdValue True
	@Test
	public void thirdMaximumFloatValue_ThirdPositionTrue() {
		FindMax main = new FindMax();
		Float firstValue = 5.6f, secondValue = 6.5f, thirdValue = 7.5f;
		Float max = main.checkFloatmax(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);
	}

        // Test case for greatest Float ThirdValue False
        @Test
        public void thirdMaximumFloatValue_ThirdPositionFalse() {
                FindMax main = new FindMax();
                Float firstValue = 5.6f, secondValue = 6.5f, thirdValue = 3.5f;
                Float max = main.checkFloatmax(firstValue, secondValue, thirdVa>
                Assert.assertNotEquals(thirdValue, max);
        }

	// Test case for greatest String FirstValue True
	@Test
	public void FirstMaximumStringValue_FirstPositionTrue() {
		String firstValue = "Peach", secondValue = "Apple", thirdValue = "Banana";
		FindMax main = new FindMax<String>(firstValue, secondValue, thirdValue);
		String max = (String) main.checkMaxValue();
		Assert.assertEquals(firstValue, max);
	}

	// Test case for greatest String FirstValue False
	@Test
	public void FirstMaximumStringValue_FirstPositionFalse() {
		String firstValue = "Apple", secondValue = "Peach", thirdValue = "Banana";
		FindMax main = new FindMax(firstValue, secondValue, thirdValue);
		String max = (String) main.checkMaxValue();
		Assert.assertNotEquals(firstValue, max);
	}

	// Test case for greatest String Second True
	@Test
	public void secondMaximumStringValue_SecondtPositionTrue() {
		String firstValue = "Banana", secondValue = "Peach", thirdValue = "Apple";
		FindMax<String> main = new FindMax<String>(firstValue, secondValue, thirdValue);
		Comparable max = main.checkMaxValue();
		Assert.assertEquals(secondValue, max);
	}

	// Test case for greatest String Second False
	@Test
	public void secondMaximumStringValue_SecondtPositionFalse() {
		String firstValue = "Banana", secondValue = "Apple", thirdValue = "Peach";
		FindMax main = new FindMax(firstValue, secondValue, thirdValue);
		Comparable max = main.checkMaxValue();
		Assert.assertNotEquals(secondValue, max);
	}

	// Test case for greatest String ThirdValue True
	@Test
	public void thirdMaximumStringValue_ThirdPositionTrue() {
		String firstValue = "Banana", secondValue = "Apple", thirdValue = "Peach";
		FindMax main = new FindMax(firstValue, secondValue, thirdValue);
		String max = (String) main.checkMaxValue();
		Assert.assertEquals(thirdValue, max);
	}

	// Test case for greatest String ThirdValue False
	@Test
	public void thirdMaximumStringValue_ThirdPositionFalse() {
		String firstValue = "Banana", secondValue = "Peach", thirdValue = "Apple";
		FindMax main = new FindMax(firstValue, secondValue, thirdValue);
		String max = (String) main.checkMaxValue();
		Assert.assertNotEquals(thirdValue, max);
	}
	
}
