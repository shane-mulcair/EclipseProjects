package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.NTwice;

public class NTwiceTest {
	NTwice nt;
	@Before
	public void setUp() throws Exception {
		nt=new NTwice();
	}

	@After
	public void tearDown() throws Exception {
		nt=null;
	}

	@Test
	public void testNTwice1() {
		assertEquals(nt.nTwice("Hello", 2),"Helo");
	}
	@Test
	public void testNTwice2() {
		assertEquals(nt.nTwice("Chocolate", 3),"Choate");
	}
	@Test
	public void testNTwice3() {
		assertEquals(nt.nTwice("Chocolate", 1),"Ce");
	}

}
