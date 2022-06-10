package com.hossein.JUnitSample.tests;

import org.junit.Assert;
import org.junit.Test;

import com.hossein.JUnitSample.Calculator;


public class TestJUnit2 {
	
	private Calculator calc = new Calculator();

	@Test
	public void testDivision() {
		Assert.assertEquals(4, calc.div(8, 2));
	}
	
}
