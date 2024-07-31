package com.udemy.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.udemy.junittrial.SomeRandomProgram;

class sumForArrayTest {

	@Test
	void testWithValue() {
		SomeRandomProgram srp = new SomeRandomProgram();
				
		int result = srp.sumFromArray(new int[]{1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, result);
	}
	
	@Test
	void testEmptyArray() {
		
		SomeRandomProgram srp = new SomeRandomProgram();
		int result = srp.sumFromArray(new int[]{});
		int expectedResult = 0;
		assertEquals(expectedResult, result);
	}

}
