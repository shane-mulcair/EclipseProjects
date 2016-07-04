package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.FrontTimes;

public class FrontTimesTest {
	FrontTimes ft=null;
	@Before
	public void setUp() throws Exception {
		ft=new FrontTimes();
	}

	@After
	public void tearDown() throws Exception {
		ft=null;
	}

	@Test
	public void testFrontTimes1() {
		assertEquals(ft.frontTimes("Chocolate", 2),"ChoCho");
	}
	@Test
	public void testFrontTimes2() {
		assertEquals(ft.frontTimes("Chocolate", 3),"ChoChoCho");
	}
	@Test
	public void testFrontTimes3() {
		assertEquals(ft.frontTimes("Abc", 3),"AbcAbcAbc");
	}

}
