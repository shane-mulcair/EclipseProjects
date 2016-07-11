package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MakeLast;

public class MakeLastTest {
	MakeLast ml;
	@Before
	public void setUp() throws Exception {
		ml=new MakeLast();
	}

	@After
	public void tearDown() throws Exception {
		ml=null;
	}

	@Test
	public void testMakeLast1() {
		int[] nums={4,5,6};
		int[] output={0,0,0,0,0,6};
		assertEquals(ml.makeLast(nums)[0],output[0]);
		assertEquals(ml.makeLast(nums)[1],output[1]);
		assertEquals(ml.makeLast(nums)[2],output[2]);
		assertEquals(ml.makeLast(nums)[3],output[3]);
		assertEquals(ml.makeLast(nums)[4],output[4]);
		assertEquals(ml.makeLast(nums)[5],output[5]);
		
	}
	@Test
	public void testMakeLast2() {
		int[] nums={1,2};
		int[] output={0,0,0,2};
		assertEquals(ml.makeLast(nums)[0],output[0]);
		assertEquals(ml.makeLast(nums)[1],output[1]);
		assertEquals(ml.makeLast(nums)[2],output[2]);
		assertEquals(ml.makeLast(nums)[3],output[3]);
	}
	@Test
	public void testMakeLast3() {
		int[] nums={3};
		int[] output={0,3};
		assertEquals(ml.makeLast(nums)[0],output[0]);
		assertEquals(ml.makeLast(nums)[1],output[1]);
	}

}
