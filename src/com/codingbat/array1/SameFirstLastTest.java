package com.codingbat.array1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SameFirstLastTest {
	SameFirstLast sfl;
	@Before
	public void setUp() throws Exception {
		sfl=new SameFirstLast();
	}

	@After
	public void tearDown() throws Exception {
		sfl=null;
	}

	@Test
	public void testSameFirstLast1() {
		int[] nums={1,2,3};
		assertEquals(sfl.sameFirstLast(nums),false);
	}
	@Test
	public void testSameFirstLast2() {
		int[] nums={1,2,3,1};
		assertEquals(sfl.sameFirstLast(nums),true);
	}
	@Test
	public void testSameFirstLast3() {
		int[] nums={1,2,1};
		assertEquals(sfl.sameFirstLast(nums),true);
	}

}
