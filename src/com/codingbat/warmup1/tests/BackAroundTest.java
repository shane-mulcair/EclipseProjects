package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.BackAround;

public class BackAroundTest {

	BackAround ba;
	@Before
	public void setUp() throws Exception {
		ba=new BackAround();
	}

	@After
	public void tearDown() throws Exception {
		ba=null;
	}

	@Test
	public void testBackAround1() {
		assertEquals(ba.backAround("cat"),"tcatt");
	}
	@Test
	public void testBackAround2() {
		assertEquals(ba.backAround("Hello"),"oHelloo");
	}
	@Test
	public void testBackAround3() {
		assertEquals(ba.backAround("a"),"aaa");
	}

}
