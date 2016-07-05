package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.ExtraEnd;

public class ExtraEndTest {
	ExtraEnd ee;
	@Before
	public void setUp() throws Exception {
		ee=new ExtraEnd();
	}

	@After
	public void tearDown() throws Exception {
		ee=null;
	}

	@Test
	public void testExtraEnd1() {
		assertEquals(ee.extraEnd("Hello"),"lololo");
	}
	@Test
	public void testExtraEnd2() {
		assertEquals(ee.extraEnd("ab"),"ababab");
	}
	@Test
	public void testExtraEnd3() {
		assertEquals(ee.extraEnd("Hi"),"HiHiHi");
	}

}
