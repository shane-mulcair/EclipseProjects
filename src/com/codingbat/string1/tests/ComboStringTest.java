package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.ComboString;

public class ComboStringTest {
	ComboString cs;

	@Before
	public void setUp() throws Exception {
		cs = new ComboString();
	}

	@After
	public void tearDown() throws Exception {
		cs = null;
	}

	@Test
	public void testComboString1() {
		assertEquals(cs.comboString("Hello", "hi"),"hiHellohi");
	}

	@Test
	public void testComboString2() {
		assertEquals(cs.comboString("hi", "Hello"),"hiHellohi");
	}

	@Test
	public void testComboString3() {
		assertEquals(cs.comboString("aaa", "b"),"baaab");
	}

}
