package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.StartOz;

public class StartOzTest {
	StartOz soz;
	@Before
	public void setUp() throws Exception {
		soz=new StartOz();
	}

	@After
	public void tearDown() throws Exception {
		soz=null;
	}

	@Test
	public void testStartOz1() {
		assertEquals(soz.startOz("ozymandias"),"oz");
	}
	@Test
	public void testStartOz2() {
		assertEquals(soz.startOz("bzoo"),"z");
	}
	@Test
	public void testStartOz3() {
		assertEquals(soz.startOz("oxx"),"o");
	}

}
