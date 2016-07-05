package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.AtFirst;

public class AtFirstTest {
	AtFirst af;
	@Before
	public void setUp() throws Exception {
		af=new AtFirst();
	}

	@After
	public void tearDown() throws Exception {
		af=null;
	}

	@Test
	public void testAtFirst1() {
		assertEquals(af.atFirst("hello"),"he");
	}
	@Test
	public void testAtFirst2() {
		assertEquals(af.atFirst("hi"),"hi");
	}
	@Test
	public void testAtFirst3() {
		assertEquals(af.atFirst("h"),"h@");
	}

}
