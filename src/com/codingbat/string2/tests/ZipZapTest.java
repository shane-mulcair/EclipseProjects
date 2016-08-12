package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.ZipZap;

public class ZipZapTest {
	ZipZap zz;
	@Before
	public void setUp() throws Exception {
		zz=new ZipZap();
	}

	@After
	public void tearDown() throws Exception {
		zz=null;
	}

	@Test
	public void testZipZap1() {
		assertEquals(zz.zipZap("zipXzap"),"zpXzp");
	}
	@Test
	public void testZipZap2() {
		assertEquals(zz.zipZap("zopzop"),"zpzp");
	}
	@Test
	public void testZipZap3() {
		assertEquals(zz.zipZap("zzzopzop"),"zzzpzp");
	}

}
