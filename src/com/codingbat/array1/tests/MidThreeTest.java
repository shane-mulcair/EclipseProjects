package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MidThree;

public class MidThreeTest {
	MidThree mt;

	@Before
	public void setUp() throws Exception {
		mt = new MidThree();
	}

	@After
	public void tearDown() throws Exception {
		mt = null;
	}

	@Test
	public void testMidThree1() {
		int[] nums = { 1, 2, 3, 4, 5 };
		int[] output = { 2, 3, 4 };
		assertArrayEquals(mt.midThree(nums), output);
	}

	@Test
	public void testMidThree2() {
		int[] nums = { 8, 6, 7, 5, 3, 0, 9 };
		int[] output = { 7, 5, 3 };
		assertArrayEquals(mt.midThree(nums), output);
	}

	@Test
	public void testMidThree3() {
		int[] nums = { 1, 2, 3 };
		int[] output = { 1, 2, 3 };
		assertArrayEquals(mt.midThree(nums), output);
	}
}
