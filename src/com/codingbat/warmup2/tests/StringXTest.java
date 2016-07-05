package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringX;

public class StringXTest {
	StringX sx;
	@Before
	public void setUp() throws Exception {
		sx=new StringX();
	}

	@After
	public void tearDown() throws Exception {
		sx=null;
	}

	@Test
	public void testStringX1() {
		assertEquals(sx.stringX("xxHxix"),"xHix");
	}
	@Test
	public void testStringX2() {
		assertEquals(sx.stringX("abxxxcd"),"abcd");
	}
	@Test
	public void testStringX3() {
		assertEquals(sx.stringX("xabxxxcdx"),"xabcdx");
	}

}
