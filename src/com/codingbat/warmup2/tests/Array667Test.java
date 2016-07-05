package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.Array667;

public class Array667Test {
	Array667 a667;
	@Before
	public void setUp() throws Exception {
		a667=new Array667();
	}

	@After
	public void tearDown() throws Exception {
		a667=null;
	}

	@Test
	public void testArray667_1() {
		int[] input={6, 6, 2};
		assertEquals(a667.array667(input),1);
	}
	@Test
	public void testArray667_2() {
		int[] input={6, 6, 2, 6};
		assertEquals(a667.array667(input),1);
		
	}
	@Test
	public void testArray667_3() {
		int[] input={6, 7, 2, 6};
		assertEquals(a667.array667(input),1);
		
	}

}
