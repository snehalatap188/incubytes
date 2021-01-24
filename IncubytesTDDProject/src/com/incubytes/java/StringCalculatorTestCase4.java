package com.incubytes.java;


//Test Case 4--Allow the Add method to handle an unknown amount of numbers
public class StringCalculatorTestCase4 {
	public static int add(final String numbers) {
	    int returnValue = 0;
	    String[] numbersArray = numbers.split(",");
	    // Removed after exception
	    // if (numbersArray.length > 2) {
	    // throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
	    // }
	    for (String number : numbersArray) {
	        if (!number.trim().isEmpty()) { // After refactoring
	            returnValue += Integer.parseInt(number);
	        }
	    }
	    return returnValue;
	}
}
