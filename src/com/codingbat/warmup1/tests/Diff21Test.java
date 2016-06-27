package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Diff21;

public class Diff21Test {
	
	Diff21 d21;

	@Before
	public void setUp() throws Exception {
		d21 = new Diff21();
	}

	@After
	public void tearDown() throws Exception {
		d21=null;
	}

	@Test
	public void testDiff21_1() {
		assertEquals(d21.diff21(19),2);
	}
	
	@Test
	public void testDiff21_2() {
		assertEquals(d21.diff21(10),11);
	}
	
	@Test
	public void testDiff21_3() {
		assertEquals(d21.diff21(21),0);
	}
	
	@Test
	public void testDiff21_4() {
		assertEquals(d21.diff21(22),2);
	}

}
