package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringSplosion;

public class StringSplosionTest {
	StringSplosion ss;
	@Before
	public void setUp() throws Exception {
		ss=new StringSplosion();
	}

	@After
	public void tearDown() throws Exception {
		ss=null;
	}

	@Test
	public void testStringSplosion1() {
		assertEquals(ss.stringSplosion("Code"),"CCoCodCode");
	}
	@Test
	public void testStringSplosion2() {
		assertEquals(ss.stringSplosion("abc"),"aababc");
	}
	@Test
	public void testStringSplosion3() {
		assertEquals(ss.stringSplosion("ab"),"aab");
	}

}
