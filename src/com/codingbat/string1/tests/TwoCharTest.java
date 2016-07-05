package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.TwoChar;

public class TwoCharTest {
	TwoChar tc;
	@Before
	public void setUp() throws Exception {
		tc=new TwoChar();
	}

	@After
	public void tearDown() throws Exception {
		tc=null;
	}

	@Test
	public void testTwoChar1() {
		assertEquals(tc.twoChar("java", 0),"ja");
	}
	@Test
	public void testTwoChar2() {
		assertEquals(tc.twoChar("java", 2),"va");
	}
	@Test
	public void testTwoChar3() {
		assertEquals(tc.twoChar("java", 3),"ja");
	}

}
