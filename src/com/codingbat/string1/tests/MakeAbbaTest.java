package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.MakeAbba;

public class MakeAbbaTest {
	MakeAbba ma;
	@Before
	public void setUp() throws Exception {
		ma=new MakeAbba();
	}

	@After
	public void tearDown() throws Exception {
		ma=null;
	}

	@Test
	public void testMakeAbba1() {
		assertEquals(ma.makeAbba("Hi", "Bye"),"HiByeByeHi");
	}
	@Test
	public void testMakeAbba2() {
		assertEquals(ma.makeAbba("Yo", "Alice"),"YoAliceAliceYo");
	}
	@Test
	public void testMakeAbba3() {
		assertEquals(ma.makeAbba("What", "Up"),"WhatUpUpWhat");
	}

}
