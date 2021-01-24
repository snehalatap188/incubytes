package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase6;

import junit.framework.Assert;
//Test Case 6 -- Support different delimiters
public class StringCalculatorTestCase6Test {

	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	    Assert.assertEquals(3+6+15, StringCalculatorTestCase6.add("//;n3;6;15"));
	}

}
