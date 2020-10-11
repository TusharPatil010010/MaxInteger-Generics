package com.capg.maxInteger;

import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {

	public T[] args;

	/**
	 * UC4 for inputs more than 3, took string of arguments
	 * 
	 * @param args
	 */
	public FindMax(T... args) {
		super();
		this.args = args;
	}

	/**
	 * @return
	 */
	public T testMaximum() {
		T testMaximum = testMaximum(args);
		printMax(testMaximum);
		return testMaximum;
	}

	/**
	 * UC4 using string of arguments
	 * 
	 * @param <E>
	 * @param vars
	 * @return
	 */
	@SafeVarargs
	private static <E extends Comparable<E>> E testMaximum(E... vars) {
		Arrays.sort(vars);
		return vars[vars.length - 1];
	}

	/**
	 * UC5 print the maximum value
	 * 
	 * @param <A>
	 * @param value
	 */
	private static <A> void printMax(A value) {
		System.out.println("Maximum : " + value);
	}
}
