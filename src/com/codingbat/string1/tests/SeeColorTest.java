package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.SeeColor;

public class SeeColorTest {
	SeeColor sc;
	@Before
	public void setUp() throws Exception {
		sc=new SeeColor();
	}

	@After
	public void tearDown() throws Exception {
		sc=null;
	}

	@Test
	public void testSeeColor1() {
		assertEquals(sc.seeColor("redxx"),"red");
	}
	@Test
	public void testSeeColor2() {
		assertEquals(sc.seeColor("xxred"),"");
	}
	@Test
	public void testSeeColor3() {
		assertEquals(sc.seeColor("blueTimes"),"blue");
	}
}
