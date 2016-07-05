package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.Right2;

public class Right2Test {
	Right2 r2;
	@Before
	public void setUp() throws Exception {
		r2=new Right2();
	}

	@After
	public void tearDown() throws Exception {
		r2=null;
	}

	@Test
	public void testRight2_1() {
		assertEquals(r2.right2("Hello"),"loHel");
	}
	@Test
	public void testRight2_2() {
		assertEquals(r2.right2("java"),"vaja");
	}
	@Test
	public void testRight2_3() {
		assertEquals(r2.right2("Hi"),"Hi");
	}

}
