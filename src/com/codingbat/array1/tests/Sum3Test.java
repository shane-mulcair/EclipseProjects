package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.Sum3;

public class Sum3Test {
	Sum3 s3;
	@Before
	public void setUp() throws Exception {
		s3=new Sum3();
	}

	@After
	public void tearDown() throws Exception {
		s3=null;
	}

	@Test
	public void testSum3_1() {
		int[] input={1,2,3};
		assertEquals(s3.sum3(input),6);
	}
	@Test
	public void testSum3_2() {
		int[] input={5,11,2};
		assertEquals(s3.sum3(input),18);
	}
	@Test
	public void testSum3_3() {
		int[] input={7,0,0};
		assertEquals(s3.sum3(input),7);
	}

}
