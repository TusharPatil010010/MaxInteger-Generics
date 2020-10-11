package com.capg.maxInteger;

public class FindMax<T extends Comparable<T>> {

	T first;
	T second;
	T third;

	/**
	 * Parameterized constructor
	 * @param first
	 * @param second
	 * @param third
	 */
	public FindMax(T first, T second, T third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}

	/**
	 * UC3 Refactored #2, calls static testMaximum
	 * @return
	 */
	public T testMaximum() {
		return testMaximum(first, second, third);
	}

	/**
	 * @param <E>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	private static <E extends Comparable<E>> E testMaximum(E first, E second, E third) {

		if (first.compareTo(second) > 0 && first.compareTo(third) > 0)
			return first;
		else if (second.compareTo(first) > 0 && second.compareTo(third) > 0)
			return second;
		else
			return third;

	}
}
