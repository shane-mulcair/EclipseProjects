package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Makes10;

public class Makes10Test {

	Makes10 mt;
	@Before
	public void setUp() throws Exception {
		mt=new Makes10();
	}

	@After
	public void tearDown() throws Exception {
		mt=null;
	}

	@Test
	public void testMakes10_1() {
		assertEquals(mt.makes10(9, 10),true);
	}
	
	@Test
	public void testMakes10_2() {
		assertEquals(mt.makes10(9, 9),false);
	}
	
	@Test
	public void testMakes10_3() {
		assertEquals(mt.makes10(1, 9),true);
	}

}
