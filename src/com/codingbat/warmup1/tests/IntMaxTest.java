package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.IntMax;

public class IntMaxTest {
	IntMax im;
	@Before
	public void setUp() throws Exception {
		im=new IntMax();
	}

	@After
	public void tearDown() throws Exception {
		im=null;
	}

	@Test
	public void testIntMax1() {
		assertEquals(im.intMax(1, 2, 3),3);
	}
	@Test
	public void testIntMax2() {
		assertEquals(im.intMax(1, 3, 2),3);
	}
	@Test
	public void testIntMax3() {
		assertEquals(im.intMax(3, 2, 1),3);
	}

}
