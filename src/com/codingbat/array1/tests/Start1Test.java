package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Start1;

public class Start1Test {
	Start1 s1;
	@Before
	public void setUp() throws Exception {
		s1=new Start1();
	}

	@After
	public void tearDown() throws Exception {
		s1=null;
	}

	@Test
	public void testStart1_1() {
		int[] a={1,2,3};
		int[] b={1,3};
		assertEquals(s1.start1(a, b),2);
	}
	@Test
	public void testStart1_2() {
		int[] a={7,2,3};
		int[] b={1};
		assertEquals(s1.start1(a, b),1);
	}
	@Test
	public void testStart1_3() {
		int[] a={1,2};
		int[] b={};
		assertEquals(s1.start1(a, b),1);
	}

}
