package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MiddleWay;

public class MiddleWayTest {
	MiddleWay mw;
	@Before
	public void setUp() throws Exception {
		mw=new MiddleWay();
	}

	@After
	public void tearDown() throws Exception {
		mw=null;
	}

	@Test
	public void testMiddleWay1() {
		int[] a={1,2,3};
		int[] b={4,5,6};
		int[] output={2,5};
		assertEquals(mw.middleWay(a, b)[0],output[0]);
		assertEquals(mw.middleWay(a, b)[1],output[1]);
	}
	@Test
	public void testMiddleWay2() {
		int[] a={7,7,7};
		int[] b={3,8,0};
		int[] output={7,8};
		assertEquals(mw.middleWay(a, b)[0],output[0]);
		assertEquals(mw.middleWay(a, b)[1],output[1]);
	}
	@Test
	public void testMiddleWay3() {
		int[] a={5,2,9};
		int[] b={1,4,5};
		int[] output={2,4};
		assertEquals(mw.middleWay(a, b)[0],output[0]);
		assertEquals(mw.middleWay(a, b)[1],output[1]);
	}

}
