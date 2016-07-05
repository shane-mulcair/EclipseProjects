package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.HelloName;

public class HelloNameTest {
	HelloName hn;
	@Before
	public void setUp() throws Exception {
		hn=new HelloName();
	}

	@After
	public void tearDown() throws Exception {
		hn=null;
	}

	@Test
	public void testHelloName1() {
		assertEquals(hn.helloName("Bob"),"Hello Bob!");
	}
	@Test
	public void testHelloName2() {
		assertEquals(hn.helloName("Alice"),"Hello Alice!");
	}
	@Test
	public void testHelloName3() {
		assertEquals(hn.helloName("X"),"Hello X!");
	}

}
