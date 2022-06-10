package com.hossein.JUnitSample.tests;

import org.junit.jupiter.api.Test;

import com.hossein.JUnitSample.Calculator;

import junit.framework.Assert;

class CalcTest {
	
	private Calculator calc = new Calculator();

//	@Test
//	public void test() {
//		Assert.assertEquals(8, calc.sum(5, 3));
//		Assert.assertFalse(15 < calc.sub(0, 0));
//		Assert.assertNotNull(calc.div(5, 4));
//		Assert.assertTrue(36 == calc.multi(4, 9));
//	}
	
	@Test
	public void testAssertions() {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = null;
		String str4 = "World";
		String str5 = "World";
		
		int num1 = 7;
		int num2 = 8;
		
		String[] arr1 = {"one", "two", "three"};
		String[] arr2 = {"one", "two", "three"};
		
		Assert.assertEquals(str1, str2);
		
		Assert.assertTrue(num1 < num2);
		
		Assert.assertFalse(num1 > num1);
		
		Assert.assertNotNull(str1);
		
		Assert.assertNull(str3);
		
		Assert.assertNotSame(str1, str3);
				
	}
	

}
