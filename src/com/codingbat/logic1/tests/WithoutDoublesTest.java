package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.WithoutDoubles;

public class WithoutDoublesTest {
	WithoutDoubles wd;
	@Before
	public void setUp() throws Exception {
		wd=new WithoutDoubles();
	}

	@After
	public void tearDown() throws Exception {
		wd=null;
	}

	@Test
	public void testWithoutDoubles1() {
		assertEquals(wd.withoutDoubles(2,3,true),5);
	}
	@Test
	public void testWithoutDoubles2() {
		assertEquals(wd.withoutDoubles(3,3,true),7);
	}
	@Test
	public void testWithoutDoubles3() {
		assertEquals(wd.withoutDoubles(3,3,false),6);
	}

}
