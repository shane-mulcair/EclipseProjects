package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.CaughtSpeeding;

public class CaughtSpeedingTest {
	CaughtSpeeding cs;
	@Before
	public void setUp() throws Exception {
		cs=new CaughtSpeeding();
	}

	@After
	public void tearDown() throws Exception {
		cs=null;
	}

	@Test
	public void testCaughtSpeeding1() {
		assertEquals(cs.caughtSpeeding(60, false),0);
	}
	@Test
	public void testCaughtSpeeding2() {
		assertEquals(cs.caughtSpeeding(65, false),1);
	}
	@Test
	public void testCaughtSpeeding3() {
		assertEquals(cs.caughtSpeeding(65, true),0);
	}

}
