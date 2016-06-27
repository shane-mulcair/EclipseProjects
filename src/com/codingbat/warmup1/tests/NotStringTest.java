package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.NotString;

public class NotStringTest {

	NotString ns;
	@Before
	public void setUp() throws Exception {
		ns=new NotString();
	}

	@After
	public void tearDown() throws Exception {
		ns=null;
	}

	@Test
	public void testNotString1() {
		assertEquals(ns.notString("candy"),"not candy");
	}
	
	@Test
	public void testNotString2() {
		assertEquals(ns.notString("x"),"not x");
	}
	
	@Test
	public void testNotString3() {
		assertEquals(ns.notString("not bad"),"not bad");
	}

}
