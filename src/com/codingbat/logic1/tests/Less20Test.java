package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.Less20;

public class Less20Test {
	Less20 l20;
	@Before
	public void setUp() throws Exception {
		l20=new Less20();
	}

	@After
	public void tearDown() throws Exception {
		l20=null;
	}

	@Test
	public void testLess20_1() {
		assertEquals(l20.less20(18),true);
	}
	@Test
	public void testLess20_2() {
		assertEquals(l20.less20(19),true);
	}
	@Test
	public void testLess20_3() {
		assertEquals(l20.less20(20),false);
	}
	@Test
	public void testLess20_4() {
		assertEquals(l20.less20(38),true);
	}

}
