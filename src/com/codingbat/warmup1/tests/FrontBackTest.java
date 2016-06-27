package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.FrontBack;

public class FrontBackTest {

	FrontBack fb;
	@Before
	public void setUp() throws Exception {
		fb=new FrontBack();
	}

	@After
	public void tearDown() throws Exception {
		fb=null;
	}

	@Test
	public void testFrontBack1() {
		assertEquals(fb.frontBack("code"),"eodc");
	}
	
	@Test
	public void testFrontBack2() {
		assertEquals(fb.frontBack("a"),"a");
	}
	
	@Test
	public void testFrontBack3() {
		assertEquals(fb.frontBack("ab"),"ba");
	}

}
