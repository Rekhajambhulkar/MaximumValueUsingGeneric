package com.generictest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenericTestClass {

	//Test case for greatest FirstValue True
	@Test
	public void FirstMaximumIntegerValue_FirstPositionTrue() {
		Integer firstValue = 40, secondValue = 30, thirdValue = 25;
		FindMax main = new FindMax();
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(firstValue, max);
	}

	 //Test case for greatest FirstValue False
        @Test
        public void FirstMaximumIntegerValue_FirstPositionFalse() {
                Integer firstValue = 20, secondValue = 30, thirdValue = 25;
                FindMax main = new FindMax();
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(firstValue, max);
        }

	//Test case for greatest SecondValue True
	@Test
	public void secondMaximumIntegerValue_SecondPositionTrue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 25;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(secondValue, max);
	}

	 //Test case for greatest SecondValue False
        @Test
        public void secondMaximumIntegerValue_SecondPositionTrue() {
                FindMax main = new FindMax();
                Integer firstValue = 20, secondValue = 10, thirdValue = 25;
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(secondValue, max);
        }

	//Test case for greatest ThirdValue True
	@Test
	public void thirdMaximumIntegerValue_ThirdsPositionTrue() {
		FindMax main = new FindMax();
		Integer firstValue = 20, secondValue = 30, thirdValue = 35;
		Integer max = main.checkMaximum(firstValue, secondValue, thirdValue);
		Assert.assertEquals(thirdValue, max);
	}

	//Test case for greatest ThirdValue False
        @Test
        public void thirdMaximumIntegerValue_ThirdPositionFalse() {
                FindMax main = new FindMax();
                Integer firstValue = 20, secondValue = 30, thirdValue = 25;
                Integer max = main.checkMaximum(firstValue, secondValue, thirdV>
                Assert.assertNotEquals(thirdValue, max);
        }

}
