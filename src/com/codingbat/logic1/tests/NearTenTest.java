package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.NearTen;

public class NearTenTest {
	NearTen nt;
	@Before
	public void setUp() throws Exception {
		nt=new NearTen();
	}

	@After
	public void tearDown() throws Exception {
		nt=null;
	}

	@Test
	public void testNearTen_1() {
		assertEquals(nt.nearTen(12),true);
	}
	@Test
	public void testNearTen_2() {
		assertEquals(nt.nearTen(17),false);
	}
	@Test
	public void testNearTen_3() {
		assertEquals(nt.nearTen(19),true);
	}

}
