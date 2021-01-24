package com.incubytes.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.incubytes.java.StringCalculatorTestCase3;
import junit.framework.Assert;

//Test case 3-- Method will Test their sum of numbers
public class StringCalculatorTestCase3Test {

	
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    Assert.assertEquals(3, StringCalculatorTestCase3.add("3"));
	}

	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    Assert.assertEquals(3+6, StringCalculatorTestCase3.add("3,6"));
	}
}
