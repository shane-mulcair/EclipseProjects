package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.In3050;

public class In3050Test {
	In3050 i35;
	@Before
	public void setUp() throws Exception {
		i35=new In3050();
	}

	@After
	public void tearDown() throws Exception {
		i35=null;
	}

	@Test
	public void testIn3050_1() {
		assertEquals(i35.in3050(30, 31),true);
	}
	@Test
	public void testIn3050_2() {
		assertEquals(i35.in3050(30, 41),false);
	}
	@Test
	public void testIn3050_3() {
		assertEquals(i35.in3050(40, 50),true);
	}

}
