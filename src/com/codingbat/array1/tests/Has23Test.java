package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Has23;

public class Has23Test {
	Has23 h23;
	@Before
	public void setUp() throws Exception {
		h23=new Has23();
	}

	@After
	public void tearDown() throws Exception {
		h23=null;
	}

	@Test
	public void testHas23_1() {
		int[] nums={2,5};
		assertEquals(h23.has23(nums),true);
	}
	@Test
	public void testHas23_2() {
		int[] nums={4,3};
		assertEquals(h23.has23(nums),true);
	}
	@Test
	public void testHas23_3() {
		int[] nums={4,5};
		assertEquals(h23.has23(nums),false);
	}

}
