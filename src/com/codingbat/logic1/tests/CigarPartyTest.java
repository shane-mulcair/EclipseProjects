package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.CigarParty;

public class CigarPartyTest {
	CigarParty cp;
	@Before
	public void setUp() throws Exception {
		cp=new CigarParty();
	}

	@After
	public void tearDown() throws Exception {
		cp=null;
	}

	@Test
	public void testCigarParty1() {
		assertEquals(cp.cigarParty(30, false),false);
	}
	@Test
	public void testCigarParty2() {
		assertEquals(cp.cigarParty(50, false),true);
	}
	@Test
	public void testCigarParty3() {
		assertEquals(cp.cigarParty(70, true),true);
	}

}
