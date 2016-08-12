package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.StarOut;

public class StarOutTest {
	StarOut so;
	@Before
	public void setUp() throws Exception {
		so=new StarOut();
	}

	@After
	public void tearDown() throws Exception {
		so=null;
	}

	@Test
	public void testStarOut1() {
		assertEquals(so.starOut("ab*cd"),"ad");
	}
	@Test
	public void testStarOut2() {
		assertEquals(so.starOut("ab**cd"),"ad");
	}
	@Test
	public void testStarOut3() {
		assertEquals(so.starOut("sm*eilly"),"silly");
	}
}
