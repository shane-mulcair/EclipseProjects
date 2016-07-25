package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.CountCode;

public class CountCodeTest {
	CountCode cc;
	@Before
	public void setUp() throws Exception {
		cc=new CountCode();
	}

	@After
	public void tearDown() throws Exception {
		cc=null;
	}

	@Test
	public void testCountCode1() {
		assertEquals(cc.countCode("aaacodebbb"),1);
	}
	@Test
	public void testCountCode2() {
		assertEquals(cc.countCode("codexxcode"),2);
	}
	@Test
	public void testCountCode3() {
		assertEquals(cc.countCode("cozexxcope"),2);
	}

}
