package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.MissingChar;

public class MissingCharTest {
	MissingChar mc;
	@Before
	public void setUp() throws Exception {
		mc=new MissingChar();
	}

	@After
	public void tearDown() throws Exception {
		mc=null;
	}

	@Test
	public void testMissingChar1() {
		assertEquals(mc.missingChar("kitten", 1),"ktten");
	}
	
	@Test
	public void testMissingChar2() {
		assertEquals(mc.missingChar("kitten", 0),"itten");
	}
	
	@Test
	public void testMissingChar3() {
		assertEquals(mc.missingChar("kitten", 4),"kittn");
	}

}
