package com.generictest;

public class FindMax<T extends Comparable<T>> {
	FindMax main;
	T firstValue, secondValue, thirdValue;

	public FindMax(T firstValue, T secondValue, T thirdValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
		this.thirdValue = thirdValue;
	}

	// Function for check All type of Maximum values
	public static <T extends Comparable> T checkMax(T firstValue, T secondValue, T thirdValue) {
		T max = firstValue;
		if (secondValue.compareTo(max) > 0) {
			max = secondValue;
		}
		if (thirdValue.compareTo(max) > 0) {
			max = thirdValue;
		}
		return max;
	}

	// Function for check internally max value
	public Comparable checkMaxValue() {
		return main.checkMax(firstValue, secondValue, thirdValue);
	}
}
