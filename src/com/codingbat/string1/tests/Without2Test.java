package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.Without2;

public class Without2Test {
	Without2 w2;
	@Before
	public void setUp() throws Exception {
		w2=new Without2();
	}

	@After
	public void tearDown() throws Exception {
		w2=null;
	}

	@Test
	public void testWithout2_1() {
		assertEquals(w2.without2("HelloHe"),"lloHe");
	}
	@Test
	public void testWithout2_2() {
		assertEquals(w2.without2("HelloHi"),"HelloHi");
	}
	@Test
	public void testWithout2_3() {
		assertEquals(w2.without2("Hi"),"");
	}
	@Test
	public void testWithout2_4() {
		assertEquals(w2.without2("x"),"x");
	}
	@Test
	public void testWithout2_5() {
		assertEquals(w2.without2(""),"");
	}

}
