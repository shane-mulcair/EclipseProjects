package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.StartHi;

public class StartHiTest {
	StartHi sh;

	@Before
	public void setUp() throws Exception {
		sh=new StartHi();
	}

	@After
	public void tearDown() throws Exception {
		sh=null;
	}

	@Test
	public void testStartHi1() {
		assertEquals(sh.startHi("hi there"),true);
	}
	@Test
	public void testStartHi2() {
		assertEquals(sh.startHi("hi"),true);
	}
	@Test
	public void testStartHi3() {
		assertEquals(sh.startHi("hello hi"),false);
	}

}
