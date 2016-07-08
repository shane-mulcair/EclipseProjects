package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.RedTicket;

public class RedTicketTest {
	RedTicket rt;
	@Before
	public void setUp() throws Exception {
		rt=new RedTicket();
	}

	@After
	public void tearDown() throws Exception {
		rt=null;
	}

	@Test
	public void testRedTicket1() {
		assertEquals(rt.redTicket(2,2,2),10);
	}
	@Test
	public void testRedTicket2() {
		assertEquals(rt.redTicket(2,2,1),0);
	}
	@Test
	public void testRedTicket3() {
		assertEquals(rt.redTicket(0,0,0),5);
	}
	@Test
	public void testRedTicket4() {
		assertEquals(rt.redTicket(2,0,0),1);
	}
	@Test
	public void testRedTicket5() {
		assertEquals(rt.redTicket(0,2,2),1);
	}
}
