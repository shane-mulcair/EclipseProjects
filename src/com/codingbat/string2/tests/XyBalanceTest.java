package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.XyBalance;

public class XyBalanceTest {
	XyBalance xyb;
	@Before
	public void setUp() throws Exception {
		xyb=new XyBalance();
	}

	@After
	public void tearDown() throws Exception {
		xyb=null;
	}

	@Test
	public void testXyBalance1() {
		assertEquals(xyb.xyBalance("aaxbby"),true);
	}
	@Test
	public void testXyBalance2() {
		assertEquals(xyb.xyBalance("aaxbb"),false);
	}
	@Test
	public void testXyBalance3() {
		assertEquals(xyb.xyBalance("yaaxbb"),false);
	}
	@Test
	public void testXyBalance4() {
		assertEquals(xyb.xyBalance("xaxxbbyx"),false);
	}

}
