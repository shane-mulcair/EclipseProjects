package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.Front3;

public class Front3Test {

	Front3 f3;
	@Before
	public void setUp() throws Exception {
		f3=new Front3();
	}

	@After
	public void tearDown() throws Exception {
		f3=null;
	}

	@Test
	public void testFront3_1() {
		assertEquals(f3.front3("Java"),"JavJavJav");
	}
	
	@Test
	public void testFront3_2() {
		assertEquals(f3.front3("Chocolate"),"ChoChoCho");
	}
	
	@Test
	public void testFront3_3() {
		assertEquals(f3.front3("abc"),"abcabcabc");
	}

}
