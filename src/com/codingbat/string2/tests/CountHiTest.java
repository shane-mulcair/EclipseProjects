package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.CountHi;

public class CountHiTest {
	CountHi ch;
	@Before
	public void setUp() throws Exception {
		ch=new CountHi();
	}

	@After
	public void tearDown() throws Exception {
		ch=null;
	}

	@Test
	public void testCountHi1() {
		assertEquals(ch.countHi("abc hi ho"),1);
	}
	@Test
	public void testCountHi2() {
		assertEquals(ch.countHi("ABChi hi"),2);
	}
	@Test
	public void testCountHi3() {
		assertEquals(ch.countHi("hihi"),2);
	}

}
