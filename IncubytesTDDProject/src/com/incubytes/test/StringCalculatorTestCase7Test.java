package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase7;

import junit.framework.Assert;
//Test Case 7 -- Negative numbers will throw an exception
public class StringCalculatorTestCase7Test {

	@Test(expected = RuntimeException.class)
	public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
	    StringCalculatorTestCase7.add("3,-6,15,18,46,33", ",");
	}
	@Test
	public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
	    RuntimeException exception = null;
	    try {
	        StringCalculatorTestCase7.add("3,-6,15,-18,46,33", ",");
	    } catch (RuntimeException e) {
	        exception = e;
	    }
	    Assert.assertNotNull(exception);
	    Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}
}
