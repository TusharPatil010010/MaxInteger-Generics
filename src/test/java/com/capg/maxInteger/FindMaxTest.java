package com.capg.maxInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMaxTest {

	@Test
	public void givenThreeIntegerValue_WhenFirstIsMax_ShouldReturnFirstValue() {
		FindMax findMaxObj = new FindMax();
		Integer maxNumber = findMaxObj.findMaxInt(8, 4, 2);
		Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, maxNumber);	
	}
	
	@Test
	public void givenThreeIntegerValue_WhenSecondIsMax_ShouldReturnSecondValue() {
		FindMax findMaxObj = new FindMax();
		Integer maxNumber = findMaxObj.findMaxInt(2, 8, 4);
		Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, maxNumber);	
	}
	
	@Test
	public void givenThreeIntegerValue_WhenThirdIsMax_ShouldReturnThirdValue() {
		FindMax findMaxObj = new FindMax();
		Integer maxNumber = findMaxObj.findMaxInt(2, 4, 8);
		Integer expectedVal = 8;
		Assertions.assertEquals(expectedVal, maxNumber);	
	}
}
