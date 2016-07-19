package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MakeMiddle;

public class MakeMiddleTest {
	MakeMiddle mm;
	@Before
	public void setUp() throws Exception {
		mm=new MakeMiddle();
	}

	@After
	public void tearDown() throws Exception {
		mm=null;
	}

	@Test
	public void testMakeMiddle1() {
		int[] nums={1,2,3,4};
		int[] output={2,3};
		assertEquals(mm.makeMiddle(nums)[0],output[0]);
		assertEquals(mm.makeMiddle(nums)[1],output[1]);
	}
	@Test
	public void testMakeMiddle2() {
		int[] nums={7,1,2,3,4,9};
		int[] output={2,3};
		assertEquals(mm.makeMiddle(nums)[0],output[0]);
		assertEquals(mm.makeMiddle(nums)[1],output[1]);
	}
	@Test
	public void testMakeMiddle3() {
		int[] nums={1,2};
		int[] output={1,2};
		assertEquals(mm.makeMiddle(nums)[0],output[0]);
		assertEquals(mm.makeMiddle(nums)[1],output[1]);
	}

}
