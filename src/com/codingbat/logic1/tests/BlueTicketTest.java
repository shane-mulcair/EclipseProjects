package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.BlueTicket;

public class BlueTicketTest {
	BlueTicket bt;
	@Before
	public void setUp() throws Exception {
		bt=new BlueTicket();
	}

	@After
	public void tearDown() throws Exception {
		bt=null;
	}

	@Test
	public void testBlueTicket1() {
		assertEquals(bt.blueTicket(9,1,0),10);
	}
	@Test
	public void testBlueTicket2() {
		assertEquals(bt.blueTicket(9,2,0),0);
	}
	@Test
	public void testBlueTicket3() {
		assertEquals(bt.blueTicket(6,1,4),10);
	}
}
