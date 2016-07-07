package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.TeenSum;

public class TeenSumTest {
	TeenSum ts;
	@Before
	public void setUp() throws Exception {
		ts=new TeenSum();
	}

	@After
	public void tearDown() throws Exception {
		ts=null;
	}

	@Test
	public void testTeenSum1() {
		assertEquals(ts.teenSum(3, 4),7);
	}
	@Test
	public void testTeenSum2() {
		assertEquals(ts.teenSum(10, 13),19);
	}
	@Test
	public void testTeenSum3() {
		assertEquals(ts.teenSum(13, 2),19);
	}

}
