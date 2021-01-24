package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase5;

import junit.framework.Assert;


//Test Case 5--Allow the Add method to handle new lines between numbers (instead of commas).
public class StringCalculatorTestCase5Test {
	
	@SuppressWarnings("deprecation")
	@Test
	public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
	    Assert.assertEquals(3+6+15, StringCalculatorTestCase5.add("3,6n15"));
	}
}
