package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.Left2;

public class Left2Test {
	Left2 l2;
	@Before
	public void setUp() throws Exception {
		l2=new Left2();
	}

	@After
	public void tearDown() throws Exception {
		l2=null;
	}

	@Test
	public void testLeft2_1() {
		assertEquals(l2.left2("Hello"),"lloHe");
	}
	@Test
	public void testLeft2_2() {
		assertEquals(l2.left2("java"),"vaja");
	}
	@Test
	public void testLeft2_3() {
		assertEquals(l2.left2("Hi"),"Hi");
	}

}
