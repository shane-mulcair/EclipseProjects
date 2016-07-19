package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.BiggerTwo;

public class BiggerTwoTest {
	BiggerTwo bt;
	@Before
	public void setUp() throws Exception {
		bt=new BiggerTwo();
	}

	@After
	public void tearDown() throws Exception {
		bt=null;
	}

	@Test
	public void testBiggerTwo1() {
		int[] a={1,2};
		int[] b={3,4};
		int[] output={3,4};
		assertEquals(bt.biggerTwo(a, b)[0],output[0]);
		assertEquals(bt.biggerTwo(a, b)[1],output[1]);
	}
	@Test
	public void testBiggerTwo2() {
		int[] a={3,4};
		int[] b={1,2};
		int[] output={3,4};
		assertEquals(bt.biggerTwo(a, b)[0],output[0]);
		assertEquals(bt.biggerTwo(a, b)[1],output[1]);
	}
	@Test
	public void testBiggerTwo3() {
		int[] a={1,1};
		int[] b={1,2};
		int[] output={1,2};
		assertEquals(bt.biggerTwo(a, b)[0],output[0]);
		assertEquals(bt.biggerTwo(a, b)[1],output[1]);
	}

}
