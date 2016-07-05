package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.WithoutEnd;

public class WithoutEndTest {
	WithoutEnd we;
	@Before
	public void setUp() throws Exception {
		we=new WithoutEnd();
	}

	@After
	public void tearDown() throws Exception {
		we=null;
	}

	@Test
	public void testWithoutEnd1() {
		assertEquals(we.withoutEnd("Hello"),"ell");
	}
	@Test
	public void testWithoutEnd2() {
		assertEquals(we.withoutEnd("java"),"av");
	}
	@Test
	public void testWithoutEnd3() {
		assertEquals(we.withoutEnd("coding"),"odin");
	}

}
