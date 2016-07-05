package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MiddleThree;

public class MiddleThreeTest {
	MiddleThree mt;
	@Before
	public void setUp() throws Exception {
		mt=new MiddleThree();
	}

	@After
	public void tearDown() throws Exception {
		mt=null;
	}

	@Test
	public void testMiddleThree1() {
		assertEquals(mt.middleThree("Candy"),"and");
	}
	@Test
	public void testMiddleThree2() {
		assertEquals(mt.middleThree("and"),"and");
	}
	@Test
	public void testMiddleThree3() {
		assertEquals(mt.middleThree("solving"),"lvi");
	}

}
