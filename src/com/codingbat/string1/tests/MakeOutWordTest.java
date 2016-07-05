package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MakeOutWord;

public class MakeOutWordTest {
	MakeOutWord mow;
	@Before
	public void setUp() throws Exception {
		mow=new MakeOutWord();
	}

	@After
	public void tearDown() throws Exception {
		mow=null;
	}

	@Test
	public void testMakeOutWord1() {
		assertEquals(mow.makeOutWord("<<>>", "Yay"),"<<Yay>>");
	}
	@Test
	public void testMakeOutWord2() {
		assertEquals(mow.makeOutWord("<<>>", "WooHoo"),"<<WooHoo>>");
	}
	@Test
	public void testMakeOutWord3() {
		assertEquals(mow.makeOutWord("[[]]", "word"),"[[word]]");
	}

}
