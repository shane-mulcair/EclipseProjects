package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.SpecialEleven;

public class SpecialElevenTest {
	SpecialEleven se;
	@Before
	public void setUp() throws Exception {
		se=new SpecialEleven();
	}

	@After
	public void tearDown() throws Exception {
		se=null;
	}

	@Test
	public void testSpecialEleven1() {
		assertEquals(se.specialEleven(22), true);
	}
	@Test
	public void testSpecialEleven2() {
		assertEquals(se.specialEleven(23), true);
	}
	@Test
	public void testSpecialEleven3() {
		assertEquals(se.specialEleven(24), false);
	}

}
