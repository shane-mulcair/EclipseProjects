package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.FizzString;

public class FizzStringTest {
	FizzString fs;
	@Before
	public void setUp() throws Exception {
		fs=new FizzString();
	}

	@After
	public void tearDown() throws Exception {
		fs=null;
	}

	@Test
	public void testFizzString1() {
		assertEquals(fs.fizzString("fig"),"Fizz");
	}
	@Test
	public void testFizzString2() {
		assertEquals(fs.fizzString("dib"),"Buzz");
	}
	@Test
	public void testFizzString3() {
		assertEquals(fs.fizzString("fib"),"FizzBuzz");
	}

}
