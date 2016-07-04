package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.CountXX;

public class CountXXTest {
	CountXX cx;
	@Before
	public void setUp() throws Exception {
		cx=new CountXX();
	}

	@After
	public void tearDown() throws Exception {
		cx=null;
	}

	@Test
	public void testCountXX1() {
		assertEquals(cx.countXX("abcxx"),1);
	}
	@Test
	public void testCountXX2() {
		assertEquals(cx.countXX("xxx"),2);
	}
	@Test
	public void testCountXX3() {
		assertEquals(cx.countXX("xxxx"),3);
	}

}
