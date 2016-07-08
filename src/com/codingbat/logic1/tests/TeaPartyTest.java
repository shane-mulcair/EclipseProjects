package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.TeaParty;

public class TeaPartyTest {
	TeaParty tp;
	@Before
	public void setUp() throws Exception {
		tp=new TeaParty();
	}

	@After
	public void tearDown() throws Exception {
		tp=null;
	}

	@Test
	public void testTeaParty1() {
		assertEquals(tp.teaParty(6,8),1);
	}
	@Test
	public void testTeaParty2() {
		assertEquals(tp.teaParty(3,8),0);
	}
	@Test
	public void testTeaParty3() {
		assertEquals(tp.teaParty(20,6),2);
	}

}
