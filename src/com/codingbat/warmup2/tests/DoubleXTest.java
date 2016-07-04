package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.DoubleX;

public class DoubleXTest {
	DoubleX dx;
	@Before
	public void setUp() throws Exception {
		dx=new DoubleX();
	}

	@After
	public void tearDown() throws Exception {
		dx=null;
	}

	@Test
	public void testDoubleX1() {
		assertEquals(dx.doubleX("axxbb"),true);
	}
	@Test
	public void testDoubleX2() {
		assertEquals(dx.doubleX("axaxax"),false);
	}
	@Test
	public void testDoubleX3() {
		assertEquals(dx.doubleX("xxxxx"),true);
	}

}
