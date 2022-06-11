package com.hossein.JUnitSample.tests;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hossein.JUnitSample.CalculatorService;
import com.hossein.JUnitSample.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	@Mock
	CalculatorService calcService;
	
	@Test
	public void testSum() {
		
		when(calcService.add(20.0, 30.0)).thenReturn(50.0);
		when(calcService.subtract(15.0, 10.0)).thenReturn(5.0);
		
		Assert.assertEquals(mathApplication.add(20.0, 30.0), 50.0, 0);
		Assert.assertEquals(calcService.subtract(15.0, 10.0), 5.0, 0);
		
		verify(calcService, never()).multiply(15.0, 10.0);
	}
	
	
}
