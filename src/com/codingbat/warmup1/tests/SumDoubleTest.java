package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.SumDouble;

public class SumDoubleTest {
	SumDouble sd;
	@Before
	public void setUp() throws Exception {
		sd=new SumDouble();
	}

	@After
	public void tearDown() throws Exception {
		sd=null;
	}

	@Test
	public void testSumDouble1() {
		assertEquals(sd.sumDouble(1, 2),3);
	}
	
	@Test
	public void testSumDouble2() {
		assertEquals(sd.sumDouble(3, 2),5);
	}
	
	@Test
	public void testSumDouble3() {
		assertEquals(sd.sumDouble(2, 2),8);
	}
	

}
