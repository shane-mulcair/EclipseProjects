package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MaxTriple;

public class MaxTripleTest {
	MaxTriple mt;
	@Before
	public void setUp() throws Exception {
		mt=new MaxTriple();
	}

	@After
	public void tearDown() throws Exception {
		mt=null;
	}

	@Test
	public void testMaxTriple1() {
		int[] nums={1,2,3};
		assertEquals(mt.maxTriple(nums),3);
	}
	@Test
	public void testMaxTriple2() {
		int[] nums={1,5,3};
		assertEquals(mt.maxTriple(nums),5);
	}
	@Test
	public void testMaxTriple3() {
		int[] nums={5,2,3};
		assertEquals(mt.maxTriple(nums),5);
	}

}
