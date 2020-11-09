package com.generictest;

public class FindMax<T extends Comparable<T>> {
	FindMax main;
	T[] value;

	public public FindMax(T... value) {
		this.value = value;
	}

	// Function for check Maximum value and sort it
	public static <T extends Comparable> T checkMax(T[] value) {
		Arrays.sort(value);
		int size = value.length;
		T max = value[size - 1];
		checkMaxValue(value, max);
		return max;
	}

	private static <T extends Comparable> T checkMaxValue(T[] value, T max) {		
		System.out.println("Max of");
		for (T values : value) {
			System.out.println(values + " ");
		}
		System.out.println("is" + max);
		return max;
	}

	// Function for check internally max value
	public Comparable checkMax() {
		return main.checkMax(value, max);
	}
}
