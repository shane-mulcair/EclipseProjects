package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.EndsLy;

public class EndsLyTest {
	EndsLy el;
	@Before
	public void setUp() throws Exception {
		el=new EndsLy();
	}

	@After
	public void tearDown() throws Exception {
		el=null;
	}

	@Test
	public void testEndsLy1() {
		assertEquals(el.endsLy("oddly"),true);
	}
	@Test
	public void testEndsLy2() {
		assertEquals(el.endsLy("y"),false);
	}
	@Test
	public void testEndsLy3() {
		assertEquals(el.endsLy("oddy"),false);
	}

}
