package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.Love6;

public class Love6Test {
	Love6 l6;

	@Before
	public void setUp() throws Exception {
		l6 = new Love6();
	}

	@After
	public void tearDown() throws Exception {
		l6 = null;
	}

	@Test
	public void testLove6_1() {
		assertEquals(l6.love6(6, 4), true);
	}

	@Test
	public void testLove6_2() {
		assertEquals(l6.love6(4, 5), false);
	}

	@Test
	public void testLove6_3() {
		assertEquals(l6.love6(1, 5), true);
	}

}
