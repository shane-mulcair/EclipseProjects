package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.LastTwo;

public class LastTwoTest {
	LastTwo lt;
	@Before
	public void setUp() throws Exception {
		lt=new LastTwo();
	}

	@After
	public void tearDown() throws Exception {
		lt=null;
	}

	@Test
	public void testLastTwo1() {
		assertEquals(lt.lastTwo("coding"),"codign");
	}
	@Test
	public void testLastTwo2() {
		assertEquals(lt.lastTwo("cat"),"cta");
	}
	@Test
	public void testLastTwo3() {
		assertEquals(lt.lastTwo("ab"),"ba");
	}

}
