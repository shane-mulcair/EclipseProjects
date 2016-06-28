package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Close10;

public class Close10Test {
	Close10 c10;
	@Before
	public void setUp() throws Exception {
		c10=new Close10();
	}

	@After
	public void tearDown() throws Exception {
		c10=null;
	}

	@Test
	public void testClose10_1() {
		assertEquals(c10.close10(8, 13),8);
	}
	@Test
	public void testClose10_2() {
		assertEquals(c10.close10(13, 8),8);
	}
	@Test
	public void testClose10_3() {
		assertEquals(c10.close10(13, 7),0);
	}

}
