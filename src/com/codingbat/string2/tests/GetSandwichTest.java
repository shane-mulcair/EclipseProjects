package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.GetSandwich;

public class GetSandwichTest {
	GetSandwich gs;
	@Before
	public void setUp() throws Exception {
		gs=new GetSandwich();
	}

	@After
	public void tearDown() throws Exception {
		gs=null;
	}

	@Test
	public void testGetSandwich1() {
		assertEquals(gs.getSandwich("breadjambread"),"jam");
	}
	@Test
	public void testGetSandwich2() {
		assertEquals(gs.getSandwich("xxbreadjambreadyy"),"jam");
	}
	@Test
	public void testGetSandwich3() {
		assertEquals(gs.getSandwich("xxbreadyy"),"");
	}
}
