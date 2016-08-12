package com.codingbat.logic2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OneTwoTest {
	OneTwo ot;
	@Before
	public void setUp() throws Exception {
		ot=new OneTwo();
	}

	@After
	public void tearDown() throws Exception {
		ot=null;
	}

	@Test
	public void testOneTwo1() {
		assertEquals(ot.oneTwo("abc"),"bca");
	}
	@Test
	public void testOneTwo2() {
		assertEquals(ot.oneTwo("tca"),"cat");
	}
	@Test
	public void testOneTwo3() {
		assertEquals(ot.oneTwo("tcagdo"),"catdog");
	}
}
