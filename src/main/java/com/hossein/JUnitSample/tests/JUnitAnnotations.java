package com.hossein.JUnitSample.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitAnnotations {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("In Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("In Before");
	}
	
	@After
	public void after() {
		System.out.println("In After");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In After Class");
	}
	
	@Test
	public void test() {
		System.out.println("In Test");
	}
	
	@Ignore
	public void ignoreTest() {
		System.out.println("In Ignore Test");
	}
	
}
