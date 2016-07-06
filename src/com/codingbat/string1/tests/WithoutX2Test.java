package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.WithoutX2;

public class WithoutX2Test {
	WithoutX2 wx2;
	@Before
	public void setUp() throws Exception {
		wx2=new WithoutX2();
	}

	@After
	public void tearDown() throws Exception {
		wx2=null;
	}

	@Test
	public void testWithoutX2_1() {
		assertEquals(wx2.withoutX2("xHi"),"Hi");
	}
	@Test
	public void testWithoutX2_2() {
		assertEquals(wx2.withoutX2("Hxi"),"Hi");
	}
	@Test
	public void testWithoutX2_3() {
		assertEquals(wx2.withoutX2("Hi"),"Hi");
	}
	@Test
	public void testWithoutX2_4() {
		assertEquals(wx2.withoutX2(""),"");
	}
}
