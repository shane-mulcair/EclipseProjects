package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.MixString;

public class MixStringTest {
	MixString mx;
	@Before
	public void setUp() throws Exception {
		mx=new MixString();
	}

	@After
	public void tearDown() throws Exception {
		mx=null;
	}

	@Test
	public void testMixString1() {
		assertEquals(mx.mixString("abc", "xyz"),"axbycz");
	}
	@Test
	public void testMixString2() {
		assertEquals(mx.mixString("Hi", "There"),"HTihere");
	}
	@Test
	public void testMixString3() {
		assertEquals(mx.mixString("xxxx", "There"),"xTxhxexre");
	}

}
