package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.SortaSum;

public class SortaSumTest {
	SortaSum ss;
	@Before
	public void setUp() throws Exception {
		ss=new SortaSum();
	}

	@After
	public void tearDown() throws Exception {
		ss=null;
	}

	@Test
	public void testSortaSum1() {
		assertEquals(ss.sortaSum(3, 4),7);
	}
	@Test
	public void testSortaSum2() {
		assertEquals(ss.sortaSum(9, 4),20);
	}
	@Test
	public void testSortaSum3() {
		assertEquals(ss.sortaSum(10, 11),21);
	}

}
