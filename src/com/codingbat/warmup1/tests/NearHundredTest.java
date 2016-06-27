package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.NearHundred;

public class NearHundredTest {

	NearHundred nh;
	@Before
	public void setUp() throws Exception {
		nh=new NearHundred();
	}

	@After
	public void tearDown() throws Exception {
		nh=null;
	}

	@Test
	public void testNearHundred1() {
		assertEquals(nh.nearHundred(93), true);
	}
	
	@Test
	public void testNearHundred2() {
		assertEquals(nh.nearHundred(90), true);
	}
	
	@Test
	public void testNearHundred3() {
		assertEquals(nh.nearHundred(89), false);
	}

}
