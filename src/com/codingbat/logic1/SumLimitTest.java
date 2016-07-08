package com.codingbat.logic1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumLimitTest {
	SumLimit sl;
	@Before
	public void setUp() throws Exception {
		sl=new SumLimit();
	}

	@After
	public void tearDown() throws Exception {
		sl=null;
	}

	@Test
	public void testSumLimit1() {
		assertEquals(sl.sumLimit(2,3),5);
	}
	@Test
	public void testSumLimit2() {
		assertEquals(sl.sumLimit(8,3),8);
	}
	@Test
	public void testSumLimit3() {
		assertEquals(sl.sumLimit(8,1),9);
	}

}
