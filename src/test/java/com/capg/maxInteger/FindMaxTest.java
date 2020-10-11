package com.capg.maxInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxTest {
	
	@Test
	public void givenMultipleIntegers_ShouldReturnMaxValue() {
	    Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, new FindMax<Integer>(8, 2, 4, 1, 5, 2).testMaximum());	
	}
	
	@Test
	public void givenMultipleFloatsNumbers_ShouldReturnMaxValue() {
	    Float expectedVal = 8.0f;
		Assertions.assertEquals(expectedVal, new FindMax<Float>(8.0f, 2.0f, 4.0f, 1.0f, 4.0f).testMaximum());	
	}
	
	@Test
	public void givenmultipleStrings_ShouldReturnMaxValue() {
	    String expectedVal = "eden";
		Assertions.assertEquals(expectedVal, new FindMax<String>("abhi", "baburao", "cat", "dog", "eden" , "ebola").testMaximum());	
	}
}
