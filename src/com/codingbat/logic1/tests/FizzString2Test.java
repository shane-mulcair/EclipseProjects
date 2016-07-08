package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.FizzString2;

public class FizzString2Test {
	FizzString2 fs;
	@Before
	public void setUp() throws Exception {
		fs=new FizzString2();
	}

	@After
	public void tearDown() throws Exception {
		fs=null;
	}

	@Test
	public void testFizzString2_1() {
		assertEquals(fs.fizzString2(1),"1!");
	}
	@Test
	public void testFizzString2_2() {
		assertEquals(fs.fizzString2(2),"2!");
	}
	@Test
	public void testFizzString2_3() {
		assertEquals(fs.fizzString2(3),"Fizz!");
	}

}
