package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Unlucky1;

public class Unlucky1Test {
	Unlucky1 u1;
	@Before
	public void setUp() throws Exception {
		u1=new Unlucky1();
	}

	@After
	public void tearDown() throws Exception {
		u1=null;
	}

	@Test
	public void testUnlucky1_1() {
		int[] nums={1,3,4,5};
		assertEquals(u1.unlucky1(nums),true);
	}
	@Test
	public void testUnlucky1_2() {
		int[] nums={2,1,3,4,5};
		assertEquals(u1.unlucky1(nums),true);
	}
	@Test
	public void testUnlucky1_3() {
		int[] nums={1,1,1};
		assertEquals(u1.unlucky1(nums),false);
	}

}
