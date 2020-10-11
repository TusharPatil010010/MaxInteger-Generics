package com.capg.maxInteger;

public class FindMax {

	/**
	 * UC4 find maximum from given inputs of any types using generics
	 * 
	 * @param <T>
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public <T extends Comparable<T>> T findMaxValue(T first, T second, T third) {

		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
			return first;
		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
			return second;
		else
			return third;

	}
}
