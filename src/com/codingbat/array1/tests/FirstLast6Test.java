package com.codingbat.array1.tests;

import static org.junit.Assert.*;
import com.codingbat.array1.FirstLast6;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstLast6Test {
	FirstLast6 fl6;
	@Before
	public void setUp() throws Exception {
		fl6=new FirstLast6();
	}

	@After
	public void tearDown() throws Exception {
		fl6=null;
	}

	@Test
	public void testFirstLast6_1() {
		int[] nums={1,2,6};
		assertEquals(fl6.firstLast6(nums),true);
	}
	@Test
	public void testFirstLast6_2() {
		int[] nums={6,1,2,3};
		assertEquals(fl6.firstLast6(nums),true);
	}
	@Test
	public void testFirstLast6_3() {
		int[] nums={13,6,1,2,3};
		assertEquals(fl6.firstLast6(nums),false);
	}

}
