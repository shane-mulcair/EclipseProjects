package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.WordEnds;

public class WordEndsTest {
	WordEnds we;
	@Before
	public void setUp() throws Exception {
		we=new WordEnds();
	}

	@After
	public void tearDown() throws Exception {
		we=null;
	}

	@Test
	public void testWordEnds1() {
		assertEquals(we.wordEnds("abcXY123XYijk", "XY"),"c13i");
	}
	@Test
	public void testWordEnds2() {
		assertEquals(we.wordEnds("XY123XY", "XY"),"13");
	}
	@Test
	public void testWordEnds3() {
		assertEquals(we.wordEnds("XY1XY", "XY"),"11");
	}

}
