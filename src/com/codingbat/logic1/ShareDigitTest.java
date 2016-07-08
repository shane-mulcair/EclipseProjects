package com.codingbat.logic1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ShareDigitTest {
	ShareDigit sd;
	@Before
	public void setUp() throws Exception {
		sd=new ShareDigit();
	}

	@After
	public void tearDown() throws Exception {
		sd=null;
	}

	@Test
	public void testShareDigit1() {
		assertEquals(sd.shareDigit(12,23),true);
	}
	@Test
	public void testShareDigit2() {
		assertEquals(sd.shareDigit(12,43),false);
	}
	@Test
	public void testShareDigit3() {
		assertEquals(sd.shareDigit(12,44),false);
	}
	@Test
	public void testShareDigit4() {
		assertEquals(sd.shareDigit(55,44),false);
	}
}
