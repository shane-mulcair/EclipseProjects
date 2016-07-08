package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.GreenTicket;

public class GreenTicketTest {
	GreenTicket gt;
	@Before
	public void setUp() throws Exception {
		gt=new GreenTicket();
	}

	@After
	public void tearDown() throws Exception {
		gt=null;
	}

	@Test
	public void testGreenTicket1() {
		assertEquals(gt.greenTicket(1,2,3),0);
	}
	@Test
	public void testGreenTicket2() {
		assertEquals(gt.greenTicket(2,2,2),20);
	}
	@Test
	public void testGreenTicket3() {
		assertEquals(gt.greenTicket(1,1,2),10);
	}

}
