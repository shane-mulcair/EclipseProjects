package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.Array123;

public class Array123Test {
	Array123 a123;
	@Before
	public void setUp() throws Exception {
		a123=new Array123();
	}

	@After
	public void tearDown() throws Exception {
		a123=null;
	}

	@Test
	public void testArray123_1() {
		int[] input={1, 1, 2, 3, 1};
		assertEquals(a123.array123(input),true);
	}
	@Test
	public void testArray123_2() {
		int[] input={1, 1, 2, 4, 1};
		assertEquals(a123.array123(input),false);
	}
	@Test
	public void testArray123_3() {
		int[] input={1, 1, 2, 1, 2, 3};
		assertEquals(a123.array123(input),true);
	}

}
