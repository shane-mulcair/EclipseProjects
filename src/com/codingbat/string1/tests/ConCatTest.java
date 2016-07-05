package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.ConCat;

public class ConCatTest {
	ConCat cc;

	@Before
	public void setUp() throws Exception {
		cc = new ConCat();
	}

	@After
	public void tearDown() throws Exception {
		cc = null;
	}

	@Test
	public void testConCat1() {
		assertEquals(cc.conCat("abc", "cat"), "abcat");
	}

	@Test
	public void testConCat2() {
		assertEquals(cc.conCat("dog", "cat"), "dogcat");
	}

	@Test
	public void testConCat3() {
		assertEquals(cc.conCat("abc", ""), "abc");
	}

}
