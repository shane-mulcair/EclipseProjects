package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.IcyHot;

public class IcyHotTest {
	IcyHot ih;

	@Before
	public void setUp() throws Exception {
		ih = new IcyHot();
	}

	@After
	public void tearDown() throws Exception {
		ih = null;
	}

	@Test
	public void testIcyHot1() {
		assertEquals(ih.icyHot(120, -1), true);
	}

	@Test
	public void testIcyHot2() {
		assertEquals(ih.icyHot(-1, 120), true);
	}

	@Test
	public void testIcyHot3() {
		assertEquals(ih.icyHot(2, 120), false);
	}

}
