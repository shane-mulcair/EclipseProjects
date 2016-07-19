package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.PlusTwo;

public class PlusTwoTest {
	PlusTwo pt;
	@Before
	public void setUp() throws Exception {
		pt=new PlusTwo();
	}

	@After
	public void tearDown() throws Exception {
		pt=null;
	}

	@Test
	public void testPlusTwo1() {
		int[] a={1,2};
		int[] b={3,4};
		int[] output={1,2,3,4};
		assertArrayEquals(pt.plusTwo(a, b),output);
	}
	@Test
	public void testPlusTwo2() {
		int[] a={4,4};
		int[] b={2,2};
		int[] output={4,4,2,2};
		assertArrayEquals(pt.plusTwo(a, b),output);
	}
	@Test
	public void testPlusTwo3() {
		int[] a={9,2};
		int[] b={3,4};
		int[] output={9,2,3,4};
		assertArrayEquals(pt.plusTwo(a, b),output);
	}

}
