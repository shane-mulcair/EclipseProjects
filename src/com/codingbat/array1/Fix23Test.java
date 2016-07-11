package com.codingbat.array1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Fix23Test {
	Fix23 f23;
	@Before
	public void setUp() throws Exception {
		f23=new Fix23();
	}

	@After
	public void tearDown() throws Exception {
		f23=null;
	}

	@Test
	public void testFix23_1() {
		int[] nums={1,2,3};
		int[] output={1,2,0};
		assertEquals(f23.fix23(nums)[0],output[0]);
		assertEquals(f23.fix23(nums)[1],output[1]);
		assertEquals(f23.fix23(nums)[2],output[2]);
	}
	@Test
	public void testFix23_2() {
		int[] nums={2,3,5};
		int[] output={2,0,5};
		assertEquals(f23.fix23(nums)[0],output[0]);
		assertEquals(f23.fix23(nums)[1],output[1]);
		assertEquals(f23.fix23(nums)[2],output[2]);
	}
	@Test
	public void testFix23_3() {
		int[] nums={1,2,1};
		int[] output={1,2,1};
		assertEquals(f23.fix23(nums)[0],output[0]);
		assertEquals(f23.fix23(nums)[1],output[1]);
		assertEquals(f23.fix23(nums)[2],output[2]);
	}

}
