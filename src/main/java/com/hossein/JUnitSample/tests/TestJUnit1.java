package com.hossein.JUnitSample.tests;

import org.junit.Assert;
import org.junit.Test;

import com.hossein.JUnitSample.Calculator;

public class TestJUnit1 {
	
	private Calculator calc = new Calculator();
	
	@Test
	public void testSum() {
		Assert.assertNotEquals(10, calc.sum(5, 2));
	}

}
