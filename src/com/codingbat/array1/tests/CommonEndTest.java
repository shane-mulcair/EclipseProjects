package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.CommonEnd;

public class CommonEndTest {
	CommonEnd ce;
	@Before
	public void setUp() throws Exception {
		ce=new CommonEnd();
	}

	@After
	public void tearDown() throws Exception {
		ce=null;
	}

	@Test
	public void testCommonEnd1() {
		int[] a={1,2,3};
		int[] b={7,3};
		assertEquals(ce.commonEnd(a,b),true);
	}
	@Test
	public void testCommonEnd2() {
		int[] a={1,2,3};
		int[] b={7,3,2};
		assertEquals(ce.commonEnd(a,b),false);
	}
	@Test
	public void testCommonEnd3() {
		int[] a={1,2,3};
		int[] b={1,3};
		assertEquals(ce.commonEnd(a,b),true);
	}

}
