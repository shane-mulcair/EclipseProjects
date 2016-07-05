package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.FrontAgain;

public class FrontAgainTest {
	FrontAgain fa;
	@Before
	public void setUp() throws Exception {
		fa=new FrontAgain();
	}

	@After
	public void tearDown() throws Exception {
		fa=null;
	}

	@Test
	public void testFrontAgain1() {
		assertEquals(fa.frontAgain("edited"),true);
	}
	@Test
	public void testFrontAgain2() {
		assertEquals(fa.frontAgain("edit"),false);
	}
	@Test
	public void testFrontAgain3() {
		assertEquals(fa.frontAgain("ed"),true);
	}
	@Test
	public void testFrontAgain4() {
		assertEquals(fa.frontAgain("x"),false);
	}
	@Test
	public void testFrontAgain5() {
		assertEquals(fa.frontAgain(""),false);
	}

}
