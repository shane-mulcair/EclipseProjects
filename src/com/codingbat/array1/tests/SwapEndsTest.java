package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.SwapEnds;

public class SwapEndsTest {
	SwapEnds se;
	@Before
	public void setUp() throws Exception {
		se=new SwapEnds();
	}

	@After
	public void tearDown() throws Exception {
		se=null;
	}

	@Test
	public void testSwapEnds1() {
		int[]nums={1,2,3,4};
		int[]output={4,2,3,1};
		assertArrayEquals(se.swapEnds(nums),output);
	}
	@Test
	public void testSwapEnds2() {
		int[]nums={1,2,3};
		int[]output={3,2,1};
		assertArrayEquals(se.swapEnds(nums),output);
	}
	@Test
	public void testSwapEnds3() {
		int[]nums={8,6,7,9,5};
		int[]output={5,6,7,9,8};
		assertArrayEquals(se.swapEnds(nums),output);
	}

}
