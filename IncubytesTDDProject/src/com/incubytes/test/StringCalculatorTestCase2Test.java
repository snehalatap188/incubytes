package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase2;

import junit.framework.Assert;

//For an empty string the method will return 0
public class StringCalculatorTestCase2Test {

	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIs0() {
	    Assert.assertEquals(0, StringCalculatorTestCase2.add(""));
	}

}
