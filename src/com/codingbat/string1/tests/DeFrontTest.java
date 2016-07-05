package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.DeFront;

public class DeFrontTest {
	DeFront df;
	@Before
	public void setUp() throws Exception {
		df=new DeFront();
	}

	@After
	public void tearDown() throws Exception {
		df=null;
	}

	@Test
	public void testDeFront1() {
		assertEquals(df.deFront("Hello"),"llo");
	}
	@Test
	public void testDeFront2() {
		assertEquals(df.deFront("java"),"va");
	}
	@Test
	public void testDeFront3() {
		assertEquals(df.deFront("away"),"aay");
	}

}
