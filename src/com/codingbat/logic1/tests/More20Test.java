package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.More20;

public class More20Test {
	More20 m20;
	@Before
	public void setUp() throws Exception {
		m20=new More20();
	}

	@After
	public void tearDown() throws Exception {
		m20=null;
	}

	@Test
	public void testMore20_1() {
		assertEquals(m20.more20(20),false);
	}
	@Test
	public void testMore20_2() {
		assertEquals(m20.more20(21),true);
	}
	@Test
	public void testMore20_3() {
		assertEquals(m20.more20(22),true);
	}
	@Test
	public void testMore20_4() {
		assertEquals(m20.more20(42),true);
	}

}
