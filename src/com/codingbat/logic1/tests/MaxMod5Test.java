package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.MaxMod5;

public class MaxMod5Test {
	MaxMod5 mm5;
	@Before
	public void setUp() throws Exception {
		mm5=new MaxMod5();
	}

	@After
	public void tearDown() throws Exception {
		mm5=null;
	}

	@Test
	public void testMaxMod5_1() {
		assertEquals(mm5.maxMod5(2,3),3);
	}
	@Test
	public void testMaxMod5_2() {
		assertEquals(mm5.maxMod5(6,2),6);
	}
	@Test
	public void testMaxMod5_3() {
		assertEquals(mm5.maxMod5(3,2),3);
	}

}
