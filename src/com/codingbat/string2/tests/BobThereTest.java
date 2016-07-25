package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.BobThere;

public class BobThereTest {
	BobThere bt;
	@Before
	public void setUp() throws Exception {
		bt=new BobThere();
	}

	@After
	public void tearDown() throws Exception {
		bt=null;
	}

	@Test
	public void testBobThere1() {
		assertEquals(bt.bobThere("abcbob"),true);
	}
	@Test
	public void testBobThere2() {
		assertEquals(bt.bobThere("b9b"),true);
	}
	@Test
	public void testBobThere3() {
		assertEquals(bt.bobThere("bac"),false);
	}

}
