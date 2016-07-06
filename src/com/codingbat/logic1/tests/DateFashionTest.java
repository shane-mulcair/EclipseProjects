package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.DateFashion;

public class DateFashionTest {
	DateFashion df;
	@Before
	public void setUp() throws Exception {
		df=new DateFashion();
	}

	@After
	public void tearDown() throws Exception {
		df=null;
	}

	@Test
	public void testDateFashion1() {
		assertEquals(df.dateFashion(5, 10),2);
	}
	@Test
	public void testDateFashion2() {
		assertEquals(df.dateFashion(5, 2),0);
	}
	@Test
	public void testDateFashion3() {
		assertEquals(df.dateFashion(5, 5),1);
	}

}
