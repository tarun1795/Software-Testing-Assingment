package com.accolite.miniAU.testingAssigment;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class FizzbuzzTest extends TestCase {

	Fizzbuzz fb;

	@Before
	public void setUp() {
		fb = new Fizzbuzz();
	}

	@Test
	public void testPrint() {
		assertEquals("Fizz", fb.print(9));
		assertEquals("Buzz", fb.print(10));
		assertEquals("FizzBuzz", fb.print(30));
		assertNull(fb.print(2));
	}

}
