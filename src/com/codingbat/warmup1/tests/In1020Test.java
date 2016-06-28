package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.In1020;

public class In1020Test {
	In1020 i12;

	@Before
	public void setUp() throws Exception {
		i12 = new In1020();
	}

	@After
	public void tearDown() throws Exception {
		i12 = null;
	}

	@Test
	public void testIn1020_1() {
		assertEquals(i12.in1020(12, 99),true);
	}

	@Test
	public void testIn1020_2() {
		assertEquals(i12.in1020(21, 12),true);
	}

	@Test
	public void testIn1020_3() {
		assertEquals(i12.in1020(8, 99),false);
	}

}
