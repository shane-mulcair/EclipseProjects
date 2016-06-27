package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.PosNeg;

public class PosNegTest {

	PosNeg pn;
	@Before
	public void setUp() throws Exception {
		pn=new PosNeg();
	}

	@After
	public void tearDown() throws Exception {
		pn=null;
	}

	@Test
	public void testPosNeg1() {
		assertEquals(pn.posNeg(1, -1, false),true);
	}
	
	@Test
	public void testPosNeg2() {
		assertEquals(pn.posNeg(-1, 1, false),true);
	}
	
	@Test
	public void testPosNeg3() {
		assertEquals(pn.posNeg(-4, -5, true),true);
	}

}
