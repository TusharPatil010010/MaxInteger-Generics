package com.capg.maxInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxTest {
	
	@Test
	public void givenThreeIntegers_ShouldReturnMaxValue() {
	    Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, new FindMax<Integer>(8, 2, 4).testMaximum());	
	}
	
	@Test
	public void givenThreeFloats_ShouldReturnMaxValue() {
	    Float expectedVal = 8.0f;
		Assertions.assertEquals(expectedVal, new FindMax<Float>(8.0f, 2.0f, 4.0f).testMaximum());	
	}
	
	@Test
	public void givenThreeStrings_ShouldReturnMaxValue() {
	    String expectedVal = "c";
		Assertions.assertEquals(expectedVal, new FindMax<String>("a", "b", "c").testMaximum());	
	}
}
