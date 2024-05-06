package com.promineotech;

import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		int result = 0;
		if(a > 0 && b > 0) {
			result = a + b;
			
		}else {
			System.out.println("Both parameters must be positive!");
		}
		return result;
	}
	

	public int getRandomInt() {
	    Random random = new Random();
	    return random.nextInt(10) + 1;
	}
	int randomNumber = getRandomInt();
	
	public int randomNumberSquared() {
		return randomNumber * randomNumber;
	}
	
	
	/**
	 * This is my method to to see if a summed number is even or odd
	 * 
	 */
	public int myMethod(int a, int b) {
		int myresult = a + b;
		if((myresult % 2) == 0) {
			System.out.println("Parameter sum is even!");
			
		}else {
			System.out.println("Parameter sum is odd!");
		}
		return myresult;
	}
	
	
}
