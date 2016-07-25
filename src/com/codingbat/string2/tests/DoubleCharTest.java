package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.DoubleChar;

public class DoubleCharTest {
	DoubleChar dc;
	@Before
	public void setUp() throws Exception {
		dc=new DoubleChar();
	}

	@After
	public void tearDown() throws Exception {
		dc=null;
	}

	@Test
	public void testDoubleChar1() {
		assertEquals(dc.doubleChar("The"),"TThhee");
	}
	@Test
	public void testDoubleChar2() {
		assertEquals(dc.doubleChar("AAbb"),"AAAAbbbb");
	}
	@Test
	public void testDoubleChar3() {
		assertEquals(dc.doubleChar("Hi-There"),"HHii--TThheerree");
	}

}
