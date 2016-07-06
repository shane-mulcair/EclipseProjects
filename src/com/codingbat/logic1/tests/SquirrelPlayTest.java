package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.SquirrelPlay;

public class SquirrelPlayTest {
	SquirrelPlay sp;
	@Before
	public void setUp() throws Exception {
		sp=new SquirrelPlay();
	}

	@After
	public void tearDown() throws Exception {
		sp=null;
	}

	@Test
	public void testSquirrelPlay1() {
		assertEquals(sp.squirrelPlay(70, false),true);
	}
	@Test
	public void testSquirrelPlay2() {
		assertEquals(sp.squirrelPlay(95, false),false);
	}
	@Test
	public void testSquirrelPlay3() {
		assertEquals(sp.squirrelPlay(95, true),true);
	}

}
