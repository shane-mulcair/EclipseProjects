package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.RotateLeft3;

public class RotateLeft3Test {
	RotateLeft3 rl3;
	@Before
	public void setUp() throws Exception {
		rl3=new RotateLeft3();
	}

	@After
	public void tearDown() throws Exception {
		rl3=null;
	}

	@Test
	public void testRotateLeft3_1() {
		int[] nums={1,2,3};
		int[] output={2,3,1};
		assertEquals(rl3.rotateLeft3(nums)[0],output[0]);
		assertEquals(rl3.rotateLeft3(nums)[1],output[1]);
		assertEquals(rl3.rotateLeft3(nums)[2],output[2]);
	}
	@Test
	public void testRotateLeft3_2() {
		int[] nums={5,11,9};
		int[] output={11,9,5};
		assertEquals(rl3.rotateLeft3(nums)[0],output[0]);
		assertEquals(rl3.rotateLeft3(nums)[1],output[1]);
		assertEquals(rl3.rotateLeft3(nums)[2],output[2]);
	}
	@Test
	public void testRotateLeft3_3() {
		int[] nums={7,0,0};
		int[] output={0,0,7};
		assertEquals(rl3.rotateLeft3(nums)[0],output[0]);
		assertEquals(rl3.rotateLeft3(nums)[1],output[1]);
		assertEquals(rl3.rotateLeft3(nums)[2],output[2]);
	}

}
