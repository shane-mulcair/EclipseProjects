package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.XyzMiddle;

public class XyzMiddleTest {
	XyzMiddle xyz;
	@Before
	public void setUp() throws Exception {
		xyz=new XyzMiddle();
	}

	@After
	public void tearDown() throws Exception {
		xyz=null;
	}

	@Test
	public void testXyzMiddle1() {
		assertEquals(xyz.xyzMiddle("AAxyzBB"),true);
	}
	@Test
	public void testXyzMiddle2() {
		assertEquals(xyz.xyzMiddle("AxyzBB"),true);
	}
	@Test
	public void testXyzMiddle3() {
		assertEquals(xyz.xyzMiddle("AxyzBBB"),false);
	}

}
