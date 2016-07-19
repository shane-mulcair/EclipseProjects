package com.codingbat.logic2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic2.MakeBricks;

public class MakeBricksTest {
	MakeBricks mb;
	@Before
	public void setUp() throws Exception {
		mb=new MakeBricks();
	}

	@After
	public void tearDown() throws Exception {
		mb=null;
	}

	@Test
	public void testMakeBricks1() {
		assertEquals(mb.makeBricks(3, 1, 8),true);
	}
	@Test
	public void testMakeBricks2() {
		assertEquals(mb.makeBricks(3, 1, 9),false);
	}
	@Test
	public void testMakeBricks3() {
		assertEquals(mb.makeBricks(3, 2, 10),true);
	}

}
