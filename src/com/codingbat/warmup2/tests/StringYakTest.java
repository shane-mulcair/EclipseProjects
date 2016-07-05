package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringYak;

public class StringYakTest {
	StringYak sy;
	@Before
	public void setUp() throws Exception {
		sy=new StringYak();
	}

	@After
	public void tearDown() throws Exception {
		sy=null;
	}

	@Test
	public void testStringYak1() {
		assertEquals(sy.stringYak("yakpak"),"pak");
	}
	@Test
	public void testStringYak2() {
		assertEquals(sy.stringYak("pakyak"),"pak");
	}
	@Test
	public void testStringYak3() {
		assertEquals(sy.stringYak("yak123ya"),"123ya");
	}

}
