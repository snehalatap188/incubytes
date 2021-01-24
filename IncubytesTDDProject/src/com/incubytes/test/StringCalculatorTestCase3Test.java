package com.incubytes.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.incubytes.java.StringCalculatorTestCase3;
import junit.framework.Assert;

//Test case 3-- Method will Test their sum of numbers
public class StringCalculatorTestCase3Test {
	//when One Number Is Used Then Return Value Is That Same Number
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    Assert.assertEquals(3, StringCalculatorTestCase3.add("3"));
	}
	//when Two Numbers Are Used Then Return Value Is Their Sum
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, StringCalculatorTestCase3.add("3,6"));
	}
}
