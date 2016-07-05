package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.StartWord;

public class StartWordTest {
	StartWord sw;
	@Before
	public void setUp() throws Exception {
		sw=new StartWord();
	}

	@After
	public void tearDown() throws Exception {
		sw=null;
	}

	@Test
	public void testStartWord1() {
		assertEquals(sw.startWord("hippo", "hi"),"hi");
	}
	@Test
	public void testStartWord2() {
		assertEquals(sw.startWord("hippo", "xip"),"hip");
	}
	@Test
	public void testStartWord3() {
		assertEquals(sw.startWord("hippo", "i"),"h");
	}
	@Test
	public void testStartWord4() {
		assertEquals(sw.startWord("h", "ix"),"");
	}
	@Test
	public void testStartWord5() {
		assertEquals(sw.startWord("", "i"),"");
	}
	@Test
	public void testStartWord6() {
		assertEquals(sw.startWord("hip", "zig"),"");
	}
}
