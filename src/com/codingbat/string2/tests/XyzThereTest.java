package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.XyzThere;

public class XyzThereTest {
	XyzThere xyz;
	@Before
	public void setUp() throws Exception {
		xyz=new XyzThere();
	}

	@After
	public void tearDown() throws Exception {
		xyz=null;
	}

	@Test
	public void testXyzThere1() {
		assertEquals(xyz.xyzThere("abcxyz"),true);
	}
	@Test
	public void testXyzThere2() {
		assertEquals(xyz.xyzThere("abc.xyz"),false);
	}
	@Test
	public void testXyzThere3() {
		assertEquals(xyz.xyzThere("xyz.abc"),true);
	}
	@Test
	public void testXyzThere4() {
		assertEquals(xyz.xyzThere("abc.xyzxyz"),true);
	}
	@Test
	public void testXyzThere5() {
		assertEquals(xyz.xyzThere("1.xyz.xyz2.xyz"),false);
	}
	@Test
	public void testXyzThere6() {
		assertEquals(xyz.xyzThere("xyz"),true);
	}

}
