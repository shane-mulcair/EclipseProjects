package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MiddleTwo;

public class MiddleTwoTest {
	MiddleTwo mt;
	@Before
	public void setUp() throws Exception {
		mt=new MiddleTwo();
	}

	@After
	public void tearDown() throws Exception {
		mt=null;
	}

	@Test
	public void testMiddleTwo1() {
		assertEquals(mt.middleTwo("string"),"ri");
	}
	@Test
	public void testMiddleTwo2() {
		assertEquals(mt.middleTwo("code"),"od");
	}
	@Test
	public void testMiddleTwo3() {
		assertEquals(mt.middleTwo("Practice"),"ct");
	}

}
