package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.CatDog;

public class CatDogTest {
	CatDog cd;
	@Before
	public void setUp() throws Exception {
		cd=new CatDog();
	}

	@After
	public void tearDown() throws Exception {
		cd=null;
	}

	@Test
	public void testCatDog1() {
		assertEquals(cd.catDog("catdog"),true);
	}
	@Test
	public void testCatDog2() {
		assertEquals(cd.catDog("catcat"),false);
	}
	@Test
	public void testCatDog3() {
		assertEquals(cd.catDog("1cat1cadodog"),true);
	}

}
