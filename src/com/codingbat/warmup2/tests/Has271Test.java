package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.Has271;

public class Has271Test {
	Has271 h271;
	@Before
	public void setUp() throws Exception {
		h271=new Has271();
	}

	@After
	public void tearDown() throws Exception {
		h271=null;
	}

	@Test
	public void testHas271_1() {
		int[] input={1, 2, 7, 1};
		assertEquals(h271.has271(input),true);
	}
	@Test
	public void testHas271_2() {
		int[] input={1, 2, 8, 1};
		assertEquals(h271.has271(input),false);
	}
	@Test
	public void testHas271_3() {
		int[] input={2, 7, 1};
		assertEquals(h271.has271(input),true);
	}
	@Test
	public void testHas271_4() {
		int[] input={2, 7, -2};
		assertEquals(h271.has271(input),false);
	}
	@Test
	public void testHas271_5() {
		int[] input={2, 7, 4};
		assertEquals(h271.has271(input),false);
	}

}
