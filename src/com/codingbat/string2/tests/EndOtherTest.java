package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.EndOther;

public class EndOtherTest {
	EndOther eo;
	@Before
	public void setUp() throws Exception {
		eo=new EndOther();
	}

	@After
	public void tearDown() throws Exception {
		eo=null;
	}

	@Test
	public void testEndOther1() {
		assertEquals(eo.endOther("Hiabc", "abc"),true);
	}
	@Test
	public void testEndOther2() {
		assertEquals(eo.endOther("AbC", "HiaBc"),true);
	}
	@Test
	public void testEndOther3() {
		assertEquals(eo.endOther("abc", "abXabc"),true);
	}

}
