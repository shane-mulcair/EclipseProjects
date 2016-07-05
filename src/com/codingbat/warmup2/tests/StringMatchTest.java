package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringMatch;

public class StringMatchTest {
	StringMatch sm;
	@Before
	public void setUp() throws Exception {
		sm=new StringMatch();
	}

	@After
	public void tearDown() throws Exception {
		sm=null;
	}

	@Test
	public void testStringMatch1() {
		assertEquals(sm.stringMatch("xxcaazz", "xxbaaz"),3);
	}
	@Test
	public void testStringMatch2() {
		assertEquals(sm.stringMatch("abc", "abc"),2);
	}
	@Test
	public void testStringMatch3() {
		assertEquals(sm.stringMatch("abc", "axc"),0);
	}

}
