package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase8;

import junit.framework.Assert;
//Test Case 8 --Numbers bigger than 1000 should be ignored   
public class StringCalculatorTestCase8Test {

	 @Test
	    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
	        Assert.assertEquals(3+1000+6, StringCalculatorTestCase8.add("3,1000,1001,6,1234", ","));
	    }

}
