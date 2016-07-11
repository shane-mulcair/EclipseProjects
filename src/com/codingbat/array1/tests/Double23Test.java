package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Double23;

public class Double23Test {
	Double23 d23;
	@Before
	public void setUp() throws Exception {
		d23=new Double23();
	}

	@After
	public void tearDown() throws Exception {
		d23=null;
	}

	@Test
	public void testDouble23_1() {
		int[] nums={2,2};
		assertEquals(d23.double23(nums),true);
	}
	@Test
	public void testDouble23_2() {
		int[] nums={3,3};
		assertEquals(d23.double23(nums),true);
	}
	@Test
	public void testDouble23_3() {
		int[] nums={2,3};
		assertEquals(d23.double23(nums),false);
	}

}
