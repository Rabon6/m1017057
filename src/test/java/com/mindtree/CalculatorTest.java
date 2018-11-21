package com.mindtree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		
		Calculator calculator = new Calculator();
		int result = calculator.sum(2, 2);
		assertEquals(4, result);
	}
	
	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		assertEquals(0, calculator.minus(2, 2));
	}
	
	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.divide(6, 3));
	}
	
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(18, calculator.multiply(6, 3));
	}
}
