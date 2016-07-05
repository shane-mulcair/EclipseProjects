package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringBits;

public class StringBitsTest {
	StringBits sb;
	@Before
	public void setUp() throws Exception {
		sb=new StringBits();
	}

	@After
	public void tearDown() throws Exception {
		sb=null;
	}

	@Test
	public void testStringBits1() {
		assertEquals(sb.stringBits("Hello"),"Hlo");
	}
	@Test
	public void testStringBits2() {
		assertEquals(sb.stringBits("Hi"),"H");
	}
	@Test
	public void testStringBits3() {
		assertEquals(sb.stringBits("Heeololeo"),"Hello");
	}

}
