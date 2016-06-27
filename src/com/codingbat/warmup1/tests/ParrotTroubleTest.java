package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.ParrotTrouble;

public class ParrotTroubleTest {

	ParrotTrouble pt;
	@Before
	public void setUp() throws Exception {
		pt=new ParrotTrouble();
	}

	@After
	public void tearDown() throws Exception {
		pt=null;
	}

	@Test
	public void testParrotTrouble1() {
		assertEquals(pt.parrotTrouble(true, 6),true);
	}
	
	@Test
	public void testParrotTrouble2() {
		assertEquals(pt.parrotTrouble(true, 7),false);
	}
	
	@Test
	public void testParrotTrouble3() {
		assertEquals(pt.parrotTrouble(false, 6),false);
	}

}
