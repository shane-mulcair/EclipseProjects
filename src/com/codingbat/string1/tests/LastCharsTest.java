package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.LastChars;

public class LastCharsTest {
	LastChars lc;

	@Before
	public void setUp() throws Exception {
		lc = new LastChars();
	}

	@After
	public void tearDown() throws Exception {
		lc = null;
	}

	@Test
	public void testLastChars1() {
		assertEquals(lc.lastChars("last", "chars"), "ls");
	}

	@Test
	public void testLastChars2() {
		assertEquals(lc.lastChars("yo", "java"), "ya");
	}

	@Test
	public void testLastChars3() {
		assertEquals(lc.lastChars("hi", ""), "h@");
	}
}
