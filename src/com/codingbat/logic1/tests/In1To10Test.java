package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.In1To10;

public class In1To10Test {
	In1To10 i1;

	@Before
	public void setUp() throws Exception {
		i1 = new In1To10();
	}

	@After
	public void tearDown() throws Exception {
		i1 = null;
	}

	@Test
	public void testIn1To10_1() {
		assertEquals(i1.in1To10(5, false), true);
	}

	@Test
	public void testIn1To10_2() {
		assertEquals(i1.in1To10(11, false), false);
	}

	@Test
	public void testIn1To10_3() {
		assertEquals(i1.in1To10(11, true), true);
	}

}
