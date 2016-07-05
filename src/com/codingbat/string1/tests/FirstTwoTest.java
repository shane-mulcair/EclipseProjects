package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.FirstTwo;

public class FirstTwoTest {
	FirstTwo ft;
	@Before
	public void setUp() throws Exception {
		ft=new FirstTwo();
	}

	@After
	public void tearDown() throws Exception {
		ft=null;
	}

	@Test
	public void testFirstTwo1() {
		assertEquals(ft.firstTwo("Hello"),"He");
	}
	@Test
	public void testFirstTwo2() {
		assertEquals(ft.firstTwo("abcdefg"),"ab");
	}
	@Test
	public void testFirstTwo3() {
		assertEquals(ft.firstTwo("ab"),"ab");
	}

}
