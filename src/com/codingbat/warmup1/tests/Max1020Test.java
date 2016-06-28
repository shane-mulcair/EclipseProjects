package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Max1020;

public class Max1020Test {
	Max1020 m12;
	@Before
	public void setUp() throws Exception {
		m12=new Max1020();
	}

	@After
	public void tearDown() throws Exception {
		m12=null;
	}

	@Test
	public void testMax1020_1() {
		assertEquals(m12.max1020(11, 19),19);
	}
	@Test
	public void testMax1020_2() {
		assertEquals(m12.max1020(19, 11),19);
	}
	@Test
	public void testMax1020_3() {
		assertEquals(m12.max1020(11, 9),11);
	}
	@Test
	public void testMax1020_4() {
		assertEquals(m12.max1020(21, 9),0);
	}

}
