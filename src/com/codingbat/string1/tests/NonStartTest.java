package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.NonStart;

public class NonStartTest {
	NonStart ns;
	@Before
	public void setUp() throws Exception {
		ns=new NonStart();
	}

	@After
	public void tearDown() throws Exception {
		ns=null;
	}

	@Test
	public void testNonStart1() {
		assertEquals(ns.nonStart("Hello", "There"), "ellohere");
	}
	@Test
	public void testNonStart2() {
		assertEquals(ns.nonStart("java", "code"), "avaode");
	}
	@Test
	public void testNonStart3() {
		assertEquals(ns.nonStart("shotl", "java"), "hotlava");
	}

}
