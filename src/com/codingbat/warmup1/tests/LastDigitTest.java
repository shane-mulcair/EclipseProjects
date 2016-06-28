package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.LastDigit;

public class LastDigitTest {
	LastDigit ld;
	@Before
	public void setUp() throws Exception {
		ld=new LastDigit();
	}

	@After
	public void tearDown() throws Exception {
		ld=null;
	}

	@Test
	public void testLastDigit1() {
		assertEquals(ld.lastDigit(7, 17),true);
	}
	@Test
	public void testLastDigit2() {
		assertEquals(ld.lastDigit(6, 17),false);
	}
	@Test
	public void testLastDigit3() {
		assertEquals(ld.lastDigit(3, 113),true);
	}

}
