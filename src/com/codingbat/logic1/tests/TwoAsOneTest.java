package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.TwoAsOne;

public class TwoAsOneTest {
	TwoAsOne tao;
	@Before
	public void setUp() throws Exception {
		tao=new TwoAsOne();
	}

	@After
	public void tearDown() throws Exception {
		tao=null;
	}

	@Test
	public void testTwoAsOne1() {
		assertEquals(tao.twoAsOne(1,2,3),true);
	}
	@Test
	public void testTwoAsOne2() {
		assertEquals(tao.twoAsOne(3,1,2),true);
	}
	@Test
	public void testTwoAsOne3() {
		assertEquals(tao.twoAsOne(3,2,2),false);
	}

}
