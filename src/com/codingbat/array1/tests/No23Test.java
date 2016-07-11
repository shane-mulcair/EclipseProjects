package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.No23;

public class No23Test {
	No23 n23;
	@Before
	public void setUp() throws Exception {
		n23=new No23();
	}

	@After
	public void tearDown() throws Exception {
		n23=null;
	}

	@Test
	public void testNo23_1() {
		int[] nums={4,5};
		assertEquals(n23.no23(nums),true);
	}
	@Test
	public void testNo23_2() {
		int[] nums={4,2};
		assertEquals(n23.no23(nums),false);
	}
	@Test
	public void testNo23_3() {
		int[] nums={3,5};
		assertEquals(n23.no23(nums),false);
	}

}
