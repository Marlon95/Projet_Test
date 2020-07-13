package main.java.com.github.jmaillard.testsautomatises.calculator.impl;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void should_suggest_five_if_two_plus_three() {
		// GIVEN
		int a = 2;
		int b = 3;
		
		// WHEN
		int result = new Calculator().sum(a, b);
		
		// THEN
		Assert.assertEquals(5,result);
	}

	@Test
	public void should_suggest_minus_one_if_two_plus_minus_three () {
		// GIVEN
		int a = 2;
		int b = -3;
		
		// WHEN
		int result = new Calculator().sum(a, b);
		
		// THEN
		Assert.assertEquals(-1,result);
	}
	
	@Test
	public void should_suggest_minus_one_if_two_minus_three() {
		// GIVEN
		int a = 2;
		int b = 3;
		
		// WHEN
		int result = new Calculator().minus(a, b);
		
		// THEN
		Assert.assertEquals(-1,result);
	}
	
	@Test
	public void should_suggest_five_if_two_minus_minus_three () {
		// GIVEN
		int a = 2;
		int b = -3;
		
		// WHEN
		int result = new Calculator().minus(a, b);
		
		// THEN
		Assert.assertEquals(5,result);
	}

	@Test
	public void should_suggest_five_if_ten_divided_by_two () {
		// GIVEN
		int a = 10;
		int b = 2;
		
		// WHEN
		int result = new Calculator().divide(a, b);
		
		// THEN
		Assert.assertEquals(5,result);
	}

	@Test(expected = ArithmeticException.class)
	public void should_suggest_error_if_ten_divided_by_zero () {
		// GIVEN
		int a = 10;
		int b = 0;
		
		// WHEN
		int result = new Calculator().divide(a, b);
		
		// THEN
		Assert.assertEquals(0,result);
	}

	@Test
	public void should_suggest_six_if_two_times_three () {
		// GIVEN
		int a = 2;
		int b = 3;
		
		// WHEN
		int result = new Calculator().multiply(a, b);
		
		// THEN
		Assert.assertEquals(6,result);
	}

	@Test
	public void should_suggest_zero_if_two_times_zero () {
		// GIVEN
		int a = 2;
		int b = 0;
		
		// WHEN
		int result = new Calculator().multiply(a, b);
		
		// THEN
		Assert.assertEquals(0,result);
	}

}
