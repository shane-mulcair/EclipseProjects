package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.HasBad;

public class HasBadTest {
	HasBad hb;
	@Before
	public void setUp() throws Exception {
		hb=new HasBad();
	}

	@After
	public void tearDown() throws Exception {
		hb=null;
	}

	@Test
	public void testHasBad1() {
		assertEquals(hb.hasBad("badxx"),true);
	}
	@Test
	public void testHasBad2() {
		assertEquals(hb.hasBad("xbadxx"),true);
	}
	@Test
	public void testHasBad3() {
		assertEquals(hb.hasBad("xxbadxx"),false);
	}
	@Test
	public void testHasBad4() {
		assertEquals(hb.hasBad("ba"),false);
	}
	@Test
	public void testHasBad5() {
		assertEquals(hb.hasBad(""),false);
	}

}
