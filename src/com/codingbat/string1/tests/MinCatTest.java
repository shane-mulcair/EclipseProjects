package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MinCat;

public class MinCatTest {
	MinCat mc;
	@Before
	public void setUp() throws Exception {
		mc=new MinCat();
	}

	@After
	public void tearDown() throws Exception {
		mc=null;
	}

	@Test
	public void testMinCat1() {
		assertEquals(mc.minCat("Hello", "Hi"),"loHi");
	}
	@Test
	public void testMinCat2() {
		assertEquals(mc.minCat("Hello", "java"),"ellojava");
	}
	@Test
	public void testMinCat3() {
		assertEquals(mc.minCat("java", "Hello"),"javaello");
	}

}
