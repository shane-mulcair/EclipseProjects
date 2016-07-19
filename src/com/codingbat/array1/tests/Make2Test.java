package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Make2;

public class Make2Test {
	Make2 m2;
	@Before
	public void setUp() throws Exception {
		m2=new Make2();
	}

	@After
	public void tearDown() throws Exception {
		m2=null;
	}

	@Test
	public void testMake2_1() {
		int[] a={4,5};
		int[] b={1,2,3};
		int[] output={4,5};
		assertArrayEquals(m2.make2(a, b),output);
	}
	@Test
	public void testMake2_2() {
		int[] a={4};
		int[] b={1,2,3};
		int[] output={4,1};
		assertArrayEquals(m2.make2(a, b),output);
	}
	@Test
	public void testMake2_3() {
		int[] a={};
		int[] b={1,2};
		int[] output={1,2};
		assertArrayEquals(m2.make2(a, b),output);
	}
	@Test
	public void testMake2_4() {
		int[] a={3};
		int[] b={1};
		int[] output={3,1};
		assertArrayEquals(m2.make2(a, b),output);
	}

}
