package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.Last2;

public class Last2Test {
	Last2 l2;
	@Before
	public void setUp() throws Exception {
		l2=new Last2();
	}

	@After
	public void tearDown() throws Exception {
		l2=null;
	}

	@Test
	public void testLast2_1() {
		assertEquals(l2.last2("hixxhi"),1);
	}
	@Test
	public void testLast2_2() {
		assertEquals(l2.last2("xaxxaxaxx"),1);
	}
	@Test
	public void testLast2_3() {
		assertEquals(l2.last2("axxxaaxx"),2);
	}

}
