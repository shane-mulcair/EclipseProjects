package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.TheEnd;

public class TheEndTest {
	TheEnd te;
	@Before
	public void setUp() throws Exception {
		te=new TheEnd();
	}

	@After
	public void tearDown() throws Exception {
		te=null;
	}

	@Test
	public void testTheEnd1() {
		assertEquals(te.theEnd("Hello", true),"H");
	}
	@Test
	public void testTheEnd2() {
		assertEquals(te.theEnd("Hello", false),"o");
	}
	@Test
	public void testTheEnd3() {
		assertEquals(te.theEnd("oh", true),"o");
	}

}
