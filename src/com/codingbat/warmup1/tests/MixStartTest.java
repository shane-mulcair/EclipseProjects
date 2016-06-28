package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.MixStart;

public class MixStartTest {
	MixStart ms;

	@Before
	public void setUp() throws Exception {
		ms = new MixStart();
	}

	@After
	public void tearDown() throws Exception {
		ms=null;
	}

	@Test
	public void testMixStart1() {
		assertEquals(ms.mixStart("mix snacks"),true);
	}
	@Test
	public void testMixStart2() {
		assertEquals(ms.mixStart("pix snacks"),true);
	}
	@Test
	public void testMixStart3() {
		assertEquals(ms.mixStart("piz snacks"),false);
	}

}
