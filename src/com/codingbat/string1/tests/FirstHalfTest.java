package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.FirstHalf;

public class FirstHalfTest {
	FirstHalf fh;
	@Before
	public void setUp() throws Exception {
		fh=new FirstHalf();
	}

	@After
	public void tearDown() throws Exception {
		fh=null;
	}

	@Test
	public void testFirstHalf1() {
		assertEquals(fh.firstHalf("WooHoo"),"Woo");
	}
	@Test
	public void testFirstHalf2() {
		assertEquals(fh.firstHalf("HelloThere"),"Hello");
	}
	@Test
	public void testFirstHalf3() {
		assertEquals(fh.firstHalf("abcdef"),"abc");
	}

}
