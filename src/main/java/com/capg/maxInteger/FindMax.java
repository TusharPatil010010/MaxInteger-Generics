package com.capg.maxInteger;

public class FindMax {

	/**
	 * UC1 Find the maximum from given inputs
	 * 
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Integer findMaxInt(Integer first, Integer second, Integer third) {

		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
			return first;
		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
			return second;
		else
			return third;

	}
}
