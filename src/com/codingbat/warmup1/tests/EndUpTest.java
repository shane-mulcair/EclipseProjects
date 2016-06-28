package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.EndUp;

public class EndUpTest {
	EndUp eu;
	@Before
	public void setUp() throws Exception {
		eu=new EndUp();
	}

	@After
	public void tearDown() throws Exception {
		eu=null;
	}

	@Test
	public void testEndUp1() {
		assertEquals(eu.endUp("Hello"),"HeLLO");
	}
	@Test
	public void testEndUp2() {
		assertEquals(eu.endUp("hi there"),"hi thERE");
	}
	@Test
	public void testEndUp3() {
		assertEquals(eu.endUp("hi"),"HI");
	}

}
