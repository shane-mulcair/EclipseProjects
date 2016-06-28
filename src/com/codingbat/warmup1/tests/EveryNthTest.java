package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.EveryNth;

public class EveryNthTest {
	EveryNth en;
	@Before
	public void setUp() throws Exception {
		en=new EveryNth();
	}

	@After
	public void tearDown() throws Exception {
		en=null;
	}

	@Test
	public void testEveryNth1() {
		assertEquals(en.everyNth("Miracle", 2),"Mrce");
	}
	@Test
	public void testEveryNth2() {
		assertEquals(en.everyNth("abcdefg", 2),"aceg");
	}
	@Test
	public void testEveryNth3() {
		assertEquals(en.everyNth("abcdefg", 3),"adg");
	}

}
