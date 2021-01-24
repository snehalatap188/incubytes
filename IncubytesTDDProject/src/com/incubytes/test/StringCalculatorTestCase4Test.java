package com.incubytes.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.incubytes.java.StringCalculatorTestCase4;

import junit.framework.Assert;

//Test Case 4--Allow the Add method to handle an unknown amount of numbers
public class StringCalculatorTestCase4Test {

//  @Test(expected = RuntimeException.class)
//  public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//      StringCalculator.add("1,2,3");
//  }
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, StringCalculatorTestCase4.add("3,6,15,18,46,33"));
    }
}
