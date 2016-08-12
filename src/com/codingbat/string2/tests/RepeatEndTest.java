package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.RepeatEnd;

public class RepeatEndTest {
	RepeatEnd re;
	@Before
	public void setUp() throws Exception {
		re=new RepeatEnd();
	}

	@After
	public void tearDown() throws Exception {
		re=null;
	}

	@Test
	public void testRepeatEnd1() {
		assertEquals(re.repeatEnd("Hello", 3),"llollollo");
	}
	@Test
	public void testRepeatEnd2() {
		assertEquals(re.repeatEnd("Hello", 2),"lolo");
	}
	@Test
	public void testRepeatEnd3() {
		assertEquals(re.repeatEnd("Hello", 1),"o");
	}

}
