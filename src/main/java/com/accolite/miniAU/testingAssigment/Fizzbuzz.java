package com.accolite.miniAU.testingAssigment;

import java.util.logging.Logger;

public class Fizzbuzz {
	
	private Logger logger = Logger.getLogger(Fizzbuzz.class.toString());
	public String print(int number) {
		logger.info("Entering print method with "+number+" as parameter");
		if(number%3 ==0 && number%5==0) {
			logger.info("Printing FizzBuzz with "+number+" as parameter");
			return "FizzBuzz";
		}
		else if(number%3 ==0) {
			logger.info("Printing Fizz with "+number+" as parameter");
			return "Fizz";
		}
		else if(number%5==0) {
			logger.info("Printing Buzz with "+number+" as parameter");
			return "Buzz";
		}
		logger.info("Printing null with "+number+" as parameter");
		return null;
	}
}
