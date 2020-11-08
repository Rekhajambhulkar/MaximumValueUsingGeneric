package com.generictest;

public class FindMax {
	//Function for Integer maximum Value
	public Integer checkMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
		Integer max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}

	//Function for check Maximum float value
	public Float checkMax(Float firstValue, Float secondValue, Float thirdValue) {
		Float max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}
}
