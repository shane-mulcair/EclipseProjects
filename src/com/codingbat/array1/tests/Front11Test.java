package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Front11;

public class Front11Test {
	Front11 f11;
	@Before
	public void setUp() throws Exception {
		f11=new Front11();
	}

	@After
	public void tearDown() throws Exception {
		f11=null;
	}

	@Test
	public void testFront11_1() {
		int[] a={1,2,3};
		int[] b={7,9,8};
		int[] output={1,7};
		assertArrayEquals(f11.front11(a, b),output);
	}
	@Test
	public void testFront11_2() {
		int[] a={1};
		int[] b={2};
		int[] output={1,2};
		assertArrayEquals(f11.front11(a, b),output);
	}
	@Test
	public void testFront11_3() {
		int[] a={1,7};
		int[] b={};
		int[] output={1};
		assertArrayEquals(f11.front11(a, b),output);
	}
	@Test
	public void testFront11_4() {
		int[] a={};
		int[] b={};
		int[] output={};
		assertArrayEquals(f11.front11(a, b),output);
	}
}
