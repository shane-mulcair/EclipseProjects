package com.codingbat.logic2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SameStarCharTest {
SameStarChar ssc;
	@Before
	public void setUp() throws Exception {
		ssc=new SameStarChar();
	}

	@After
	public void tearDown() throws Exception {
		ssc=null;
	}

	@Test
	public void testSameStarChar1() {
		assertEquals(ssc.sameStarChar("xy*yzz"),true);
	}
	@Test
	public void testSameStarChar2() {
		assertEquals(ssc.sameStarChar("xy*zzz"),false);
	}
	@Test
	public void testSameStarChar3() {
		assertEquals(ssc.sameStarChar("*xa*az"),true);
	}
}
