package com.incubytes.test;


import org.junit.Test;
import com.incubytes.java.StringCalculatorForTestCase1;

import junit.framework.Assert;

public class StringCalculatorTestCase1Test {
	
	//when More Than 2 Numbers Are Used Then Exception Is Throw
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculatorForTestCase1.add("1,2,3");
    }
    
    // when 2 Numbers Are Used Then No Exception Is Throw
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculatorForTestCase1.add("1,2");
        Assert.assertTrue(true);
    }
    
    //when NonNumber Is Used Then Exception Is Throw
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculatorForTestCase1.add("1,X");
    }
}