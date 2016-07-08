package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.InOrder;

public class InOrderTest {
	InOrder io;
	@Before
	public void setUp() throws Exception {
		io=new InOrder();
	}

	@After
	public void tearDown() throws Exception {
		io=null;
	}

	@Test
	public void testInOrder1() {
		assertEquals(io.inOrder(1,2,4,false),true);
	}
	@Test
	public void testInOrder2() {
		assertEquals(io.inOrder(1,2,1,false),false);
	}
	@Test
	public void testInOrder3() {
		assertEquals(io.inOrder(1,1,2,true),true);
	}

}
