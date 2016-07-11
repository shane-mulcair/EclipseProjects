package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MaxEnd3;

public class MaxEnd3Test {
	MaxEnd3 me3;
	@Before
	public void setUp() throws Exception {
		me3=new MaxEnd3();
	}

	@After
	public void tearDown() throws Exception {
		me3=null;
	}

	@Test
	public void testMaxEnd3_1() {
		int[]nums={1,2,3};
		int[]output={3,3,3};
		assertEquals(me3.maxEnd3(nums)[0],output[0]);
		assertEquals(me3.maxEnd3(nums)[1],output[1]);
		assertEquals(me3.maxEnd3(nums)[2],output[2]);
	}
	@Test
	public void testMaxEnd3_2() {
		int[]nums={11,5,9};
		int[]output={11,11,11};
		assertEquals(me3.maxEnd3(nums)[0],output[0]);
		assertEquals(me3.maxEnd3(nums)[1],output[1]);
		assertEquals(me3.maxEnd3(nums)[2],output[2]);
	}
	@Test
	public void testMaxEnd3_3() {
		int[]nums={2,11,3};
		int[]output={3,3,3};
		assertEquals(me3.maxEnd3(nums)[0],output[0]);
		assertEquals(me3.maxEnd3(nums)[1],output[1]);
		assertEquals(me3.maxEnd3(nums)[2],output[2]);
	}

}
