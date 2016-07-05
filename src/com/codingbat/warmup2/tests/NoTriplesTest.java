package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.NoTriples;

public class NoTriplesTest {
	NoTriples nt;
	@Before
	public void setUp() throws Exception {
		nt=new NoTriples();
	}

	@After
	public void tearDown() throws Exception {
		nt=null;
	}

	@Test
	public void testNoTriples1() {
		int[] input={1, 1, 2, 2, 1};
		assertEquals(nt.noTriples(input),true);
	}
	@Test
	public void testNoTriples2() {
		int[] input={1, 1, 2, 2, 2, 1};
		assertEquals(nt.noTriples(input),false);
	}
	@Test
	public void testNoTriples3() {
		int[] input={1, 1, 1, 2, 2, 2, 1};
		assertEquals(nt.noTriples(input),false);
	}

}
