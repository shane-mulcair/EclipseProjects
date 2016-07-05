package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.ExtraFront;

public class ExtraFrontTest {
	ExtraFront ef;
	@Before
	public void setUp() throws Exception {
		ef=new ExtraFront();
	}

	@After
	public void tearDown() throws Exception {
		ef=null;
	}

	@Test
	public void testExtraFront1() {
		assertEquals(ef.extraFront("Hello"),"HeHeHe");
	}
	@Test
	public void testExtraFront2() {
		assertEquals(ef.extraFront("ab"),"ababab");
	}
	@Test
	public void testExtraFront3() {
		assertEquals(ef.extraFront("H"),"HHH");
	}

}
