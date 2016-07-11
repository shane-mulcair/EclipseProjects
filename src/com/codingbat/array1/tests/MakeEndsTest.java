package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MakeEnds;

public class MakeEndsTest {
	MakeEnds me;
	@Before
	public void setUp() throws Exception {
		me=new MakeEnds();
	}

	@After
	public void tearDown() throws Exception {
		me=null;
	}

	@Test
	public void testMakeEnds1() {
		int[] nums={1,2,3};
		int[] output={1,3};
		assertEquals(me.makeEnds(nums)[0],output[0]);
		assertEquals(me.makeEnds(nums)[1],output[1]);
	}
	@Test
	public void testMakeEnds2() {
		int[] nums={1,2,3,4};
		int[] output={1,4};
		assertEquals(me.makeEnds(nums)[0],output[0]);
		assertEquals(me.makeEnds(nums)[1],output[1]);
	}
	@Test
	public void testMakeEnds3() {
		int[] nums={7,4,6,2};
		int[] output={7,2};
		assertEquals(me.makeEnds(nums)[0],output[0]);
		assertEquals(me.makeEnds(nums)[1],output[1]);
	}
	@Test
	public void testMakeEnds4() {
		int[] nums={7};
		int[] output={7,7};
		assertEquals(me.makeEnds(nums)[0],output[0]);
		assertEquals(me.makeEnds(nums)[1],output[1]);
	}

}
