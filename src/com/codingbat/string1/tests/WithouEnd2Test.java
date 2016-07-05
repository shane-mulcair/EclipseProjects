package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.WithouEnd2;

public class WithouEnd2Test {
	WithouEnd2 we;
	@Before
	public void setUp() throws Exception {
		we=new WithouEnd2();
	}

	@After
	public void tearDown() throws Exception {
		we=null;
	}

	@Test
	public void testWithouEnd2_1() {
		assertEquals(we.withouEnd2("Hello"),"ell");
	}
	@Test
	public void testWithouEnd2_2() {
		assertEquals(we.withouEnd2("abc"),"b");
	}
	@Test
	public void testWithouEnd2_3() {
		assertEquals(we.withouEnd2("ab"),"");
	}

}
