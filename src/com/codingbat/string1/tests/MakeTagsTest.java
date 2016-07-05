package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MakeTags;

public class MakeTagsTest {
	MakeTags mt;
	@Before
	public void setUp() throws Exception {
		mt=new MakeTags();
	}

	@After
	public void tearDown() throws Exception {
		mt=null;
	}

	@Test
	public void testMakeTags1() {
		assertEquals(mt.makeTags("i", "Yay"),"<i>Yay</i>");
	}
	@Test
	public void testMakeTags2() {
		assertEquals(mt.makeTags("i", "Hello"),"<i>Hello</i>");
	}
	@Test
	public void testMakeTags3() {
		assertEquals(mt.makeTags("cite", "Yay"),"<cite>Yay</cite>");
	}

}
