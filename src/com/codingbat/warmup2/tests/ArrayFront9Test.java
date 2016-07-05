package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.ArrayFront9;

public class ArrayFront9Test {
	ArrayFront9 af9;
	@Before
	public void setUp() throws Exception {
		af9=new ArrayFront9();
	}

	@After
	public void tearDown() throws Exception {
		af9=null;
	}

	@Test
	public void testArrayFront9_1() {
		int[] input={1, 2, 9, 3, 4};
		assertEquals(af9.arrayFront9(input),true);
	}
	@Test
	public void testArrayFront9_2() {
		int[] input={1, 2, 3, 4, 9};
		assertEquals(af9.arrayFront9(input),false);
	}
	@Test
	public void testArrayFront9_3() {
		int[] input={1, 2, 3, 4, 5};
		assertEquals(af9.arrayFront9(input),false);
	}

}
