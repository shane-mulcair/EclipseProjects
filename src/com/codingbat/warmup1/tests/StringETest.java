package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.StringE;

public class StringETest {
	StringE se;
	@Before
	public void setUp() throws Exception {
		se=new StringE();
	}

	@After
	public void tearDown() throws Exception {
		se=null;
	}

	@Test
	public void testStringE1() {
		assertEquals(se.stringE("Hello"),true);
	}
	@Test
	public void testStringE2() {
		assertEquals(se.stringE("Heelle"),true);
	}
	@Test
	public void testStringE3() {
		assertEquals(se.stringE("Heelele"),false);
	}
	@Test
	public void testStringE4() {
		assertEquals(se.stringE("Hlll"),false);
	}
}
