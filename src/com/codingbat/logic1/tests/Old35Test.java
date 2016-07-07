package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.Old35;

public class Old35Test {
	Old35 o35;
	@Before
	public void setUp() throws Exception {
		o35=new Old35();
	}

	@After
	public void tearDown() throws Exception {
		o35=null;
	}

	@Test
	public void testOld35_1() {
		assertEquals(o35.old35(3),true);
	}
	@Test
	public void testOld35_2() {
		assertEquals(o35.old35(10),true);
	}
	@Test
	public void testOld35_3() {
		assertEquals(o35.old35(15),false);
	}

}
