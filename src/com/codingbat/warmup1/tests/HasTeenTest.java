package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.HasTeen;

public class HasTeenTest {
	HasTeen ht;
	@Before
	public void setUp() throws Exception {
		ht=new HasTeen();
	}

	@After
	public void tearDown() throws Exception {
		ht=null;
	}

	@Test
	public void testHasTeen1() {
		assertEquals(ht.hasTeen(13, 20, 10),true);
	}
	@Test
	public void testHasTeen2() {
		assertEquals(ht.hasTeen(20, 19, 10),true);
	}
	@Test
	public void testHasTeen3() {
		assertEquals(ht.hasTeen(20, 10, 13),true);
	}
	@Test
	public void testHasTeen4() {
		assertEquals(ht.hasTeen(4, 21, 0),false);
	}

}
