package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.PlusOut;

public class PlusOutTest {
	PlusOut po;
	@Before
	public void setUp() throws Exception {
		po=new PlusOut();
	}

	@After
	public void tearDown() throws Exception {
		po=null;
	}

	@Test
	public void testPlusOut1() {
		assertEquals(po.plusOut("12xy34", "xy"),"++xy++");
	}
	@Test
	public void testPlusOut2() {
		assertEquals(po.plusOut("12xy34", "1"),"1+++++");
	}
	@Test
	public void testPlusOut3() {
		assertEquals(po.plusOut("12xy34xyabcxy", "xy"),"++xy++xy+++xy");
	}
	@Test
	public void testPlusOut4() {
		assertEquals(po.plusOut("123123", "3"),"++3++3");
	}
}
