package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.StringTimes;

public class StringTimesTest {
	StringTimes st;
	@Before
	public void setUp() throws Exception {
		st=new StringTimes();
	}

	@After
	public void tearDown() throws Exception {
		st=null;
	}

	@Test
	public void testStringTimes1() {
		assertEquals(st.stringTimes("Hi", 2),"HiHi");
	}
	@Test
	public void testStringTimes2() {
		assertEquals(st.stringTimes("Hi", 3),"HiHiHi");
	}
	@Test
	public void testStringTimes3() {
		assertEquals(st.stringTimes("Hi", 1),"Hi");
	}

}
