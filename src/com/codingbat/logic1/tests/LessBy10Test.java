package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.LessBy10;

public class LessBy10Test {
	LessBy10 lb10;
	@Before
	public void setUp() throws Exception {
		lb10=new LessBy10();
	}

	@After
	public void tearDown() throws Exception {
		lb10=null;
	}

	@Test
	public void testLessBy10_1() {
		assertEquals(lb10.lessBy10(1,7,11),true);
	}
	@Test
	public void testLessBy10_2() {
		assertEquals(lb10.lessBy10(1,7,10),false);
	}
	@Test
	public void testLessBy10_3() {
		assertEquals(lb10.lessBy10(11,1,7),true);
	}

}
