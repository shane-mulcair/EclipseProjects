package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.InOrderEqual;

public class InOrderEqualTest {
	InOrderEqual ioe;
	@Before
	public void setUp() throws Exception {
		ioe=new InOrderEqual();
	}

	@After
	public void tearDown() throws Exception {
		ioe=null;
	}

	@Test
	public void testInOrderEqual1() {
		assertEquals(ioe.inOrderEqual(2,5,11,false),true);
	}
	@Test
	public void testInOrderEqual2() {
		assertEquals(ioe.inOrderEqual(5,7,6,false),false);
	}
	@Test
	public void testInOrderEqual3() {
		assertEquals(ioe.inOrderEqual(5,5,7,true),true);
	}

}
