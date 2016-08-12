package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.RepeatFront;

public class RepeatFrontTest {
	RepeatFront rf;
	@Before
	public void setUp() throws Exception {
		rf=new RepeatFront();
	}

	@After
	public void tearDown() throws Exception {
		rf=null;
	}

	@Test
	public void testRepeatFront1() {
		assertEquals(rf.repeatFront("Chocolate", 4),"ChocChoChC");
	}
	@Test
	public void testRepeatFront2() {
		assertEquals(rf.repeatFront("Chocolate", 3),"ChoChC");
	}
	@Test
	public void testRepeatFront3() {
		assertEquals(rf.repeatFront("Ice Cream", 2),"IcI");
	}

}
