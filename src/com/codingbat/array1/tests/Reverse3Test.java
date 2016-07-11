package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Reverse3;

public class Reverse3Test {
	Reverse3 r3;
	@Before
	public void setUp() throws Exception {
		r3=new Reverse3();
	}

	@After
	public void tearDown() throws Exception {
		r3=null;
	}

	@Test
	public void testReverse3_1() {
		int[] nums={1,2,3};
		int[] output={3,2,1};
		assertEquals(r3.reverse3(nums)[0],output[0]);
		assertEquals(r3.reverse3(nums)[1],output[1]);
		assertEquals(r3.reverse3(nums)[2],output[2]);
	}
	@Test
	public void testReverse3_2() {
		int[] nums={5,11,9};
		int[] output={9,11,5};
		assertEquals(r3.reverse3(nums)[0],output[0]);
		assertEquals(r3.reverse3(nums)[1],output[1]);
		assertEquals(r3.reverse3(nums)[2],output[2]);
	}
	@Test
	public void testReverse3_3() {
		int[] nums={7,0,0};
		int[] output={0,0,7};
		assertEquals(r3.reverse3(nums)[0],output[0]);
		assertEquals(r3.reverse3(nums)[1],output[1]);
		assertEquals(r3.reverse3(nums)[2],output[2]);
	}

}
