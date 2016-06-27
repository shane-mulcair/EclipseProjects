package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Front22;

public class Front22Test {
	Front22 f22;
	@Before
	public void setUp() throws Exception {
		f22=new Front22();
	}

	@After
	public void tearDown() throws Exception {
		f22=null;
	}

	@Test
	public void testFront22_1() {
		assertEquals(f22.front22("kitten"),"kikittenki");
	}
	@Test
	public void testFront22_2() {
		assertEquals(f22.front22("Ha"),"HaHaHa");
	}
	@Test
	public void testFront22_3() {
		assertEquals(f22.front22("abc"),"ababcab");
	}

}
