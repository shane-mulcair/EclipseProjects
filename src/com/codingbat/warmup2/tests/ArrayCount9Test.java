package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.ArrayCount9;

public class ArrayCount9Test {
	ArrayCount9 ac9;
	@Before
	public void setUp() throws Exception {
		ac9=new ArrayCount9();
	}

	@After
	public void tearDown() throws Exception {
		ac9=null;
	}

	@Test
	public void testArrayCount9_1() {
		int[] input={1,2,9};
		assertEquals(ac9.arrayCount9(input),1);
	}
	@Test
	public void testArrayCount9_2() {
		int[] input={1,9,9};
		assertEquals(ac9.arrayCount9(input),2);
	}
	@Test
	public void testArrayCount9_3() {
		int[] input={1,9,9,3,9};
		assertEquals(ac9.arrayCount9(input),3);
	}

}
