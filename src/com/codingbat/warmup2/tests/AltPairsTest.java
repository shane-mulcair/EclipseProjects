package com.codingbat.warmup2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup2.AltPairs;

public class AltPairsTest {
	AltPairs ap;
	@Before
	public void setUp() throws Exception {
		ap=new AltPairs();
	}

	@After
	public void tearDown() throws Exception {
		ap=null;
	}

	@Test
	public void testAltPairs1() {
		assertEquals(ap.altPairs("kitten"),"kien");
	}
	@Test
	public void testAltPairs2() {
		assertEquals(ap.altPairs("Chocolate"),"Chole");
	}
	@Test
	public void testAltPairs3() {
		assertEquals(ap.altPairs("CodingHorror"),"Congrr");
	}

}
