package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.PrefixAgain;

public class PrefixAgainTest {
	PrefixAgain pa;
	@Before
	public void setUp() throws Exception {
		pa=new PrefixAgain();
	}

	@After
	public void tearDown() throws Exception {
		pa=null;
	}

	@Test
	public void testPrefixAgain1() {
		assertEquals(pa.prefixAgain("abXYabc", 1),true);
	}
	@Test
	public void testPrefixAgain2() {
		assertEquals(pa.prefixAgain("abXYabc", 2),true);
	}
	@Test
	public void testPrefixAgain3() {
		assertEquals(pa.prefixAgain("abXYabc", 3),false);
	}
}
