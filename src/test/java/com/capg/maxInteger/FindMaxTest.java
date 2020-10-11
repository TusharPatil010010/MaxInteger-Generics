package com.capg.maxInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxTest {
	
	@Test
	public void givenThreeValues_ShouldReturnMaxValue() {
		FindMax findMaxObj = new FindMax();
		Integer maxNumber = findMaxObj.findMaxValue(8, 2, 3);
		Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, maxNumber);	
	}
	
}
