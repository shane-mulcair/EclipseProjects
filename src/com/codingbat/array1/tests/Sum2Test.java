package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Sum2;

public class Sum2Test {
	Sum2 s2;
	@Before
	public void setUp() throws Exception {
		s2=new Sum2();
	}

	@After
	public void tearDown() throws Exception {
		s2=null;
	}

	@Test
	public void testSum2_1() {
		int[] nums={1,2,3};
		assertEquals(s2.sum2(nums),3);
	}
	@Test
	public void testSum2_2() {
		int[] nums={};
		assertEquals(s2.sum2(nums),0);
	}
	@Test
	public void testSum2_3() {
		int[] nums={1,1};
		assertEquals(s2.sum2(nums),2);
	}
	@Test
	public void testSum2_4() {
		int[] nums={1,1,1,1};
		assertEquals(s2.sum2(nums),2);
	}

}
