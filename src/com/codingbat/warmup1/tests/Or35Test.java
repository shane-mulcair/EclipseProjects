package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Or35;

public class Or35Test {
	Or35 o35;
	@Before
	public void setUp() throws Exception {
		o35=new Or35();
	}

	@After
	public void tearDown() throws Exception {
		o35=null;
	}

	@Test
	public void testOr35_1() {
		assertEquals(o35.or35(3),true);
	}
	@Test
	public void testOr35_2() {
		assertEquals(o35.or35(10),true);
	}
	@Test
	public void testOr35_3() {
		assertEquals(o35.or35(8),false);
	}

}
