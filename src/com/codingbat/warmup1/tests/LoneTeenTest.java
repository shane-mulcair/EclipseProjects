package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.LoneTeen;

public class LoneTeenTest {

	LoneTeen lt;
	@Before
	public void setUp() throws Exception {
		lt=new LoneTeen();
	}

	@After
	public void tearDown() throws Exception {
		lt=null;
	}

	@Test
	public void testLoneTeen1() {
		assertEquals(lt.loneTeen(13, 99),true);
	}
	@Test
	public void testLoneTeen2() {
		assertEquals(lt.loneTeen(21, 19),true);
	}
	@Test
	public void testLoneTeen3() {
		assertEquals(lt.loneTeen(13, 13),false);
	}

}
