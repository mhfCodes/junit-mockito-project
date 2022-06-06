package com.hossein.JUnitSample.tests;

import org.junit.jupiter.api.Test;

import com.hossein.JUnitSample.Calculator;

import junit.framework.Assert;

class CalcTest {
	
	private Calculator calc = new Calculator();

	@Test
	public void test() {
		Assert.assertEquals(8, calc.sum(5, 3));
		Assert.assertFalse(15 < calc.sub(0, 0));
		Assert.assertNotNull(calc.div(5, 4));
		Assert.assertTrue(36 == calc.multi(4, 9));
	}

}
