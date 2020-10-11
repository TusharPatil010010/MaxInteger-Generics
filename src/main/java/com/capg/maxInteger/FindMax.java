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

	/**
	 * UC2 Find maximum from given float inputs
	 * 
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Float findMaxFloat(Float first, Float second, Float third) {

		if (first.compareTo(second) >= 0 && first.compareTo(third) >= 0)
			return first;
		else if (second.compareTo(first) >= 0 && second.compareTo(third) >= 0)
			return second;
		else
			return third;

	}

	/**
	 * UC3 Find maximumfrom given string input
	 * 
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public Integer findMaxString(String first, String second, String third) {

		Integer a = Integer.parseInt(first);
		Integer b = Integer.parseInt(second);
		Integer c = Integer.parseInt(third);
		if (a.compareTo(b) >= 0 && a.compareTo(b) >= 0)
			return a;
		else if (b.compareTo(a) >= 0 && b.compareTo(c) >= 0)
			return b;
		else
			return c;

	}

}
