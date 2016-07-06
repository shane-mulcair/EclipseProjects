package com.codingbat.string1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string1.WithoutX;

public class WithoutXTest {
	WithoutX wx;
	@Before
	public void setUp() throws Exception {
		wx=new WithoutX();
	}

	@After
	public void tearDown() throws Exception {
		wx=null;
	}

	@Test
	public void testWithoutX1() {
		assertEquals(wx.withoutX("xHix"),"Hi");
	}
	@Test
	public void testWithoutX2() {
		assertEquals(wx.withoutX("xHi"),"Hi");
	}
	@Test
	public void testWithoutX3() {
		assertEquals(wx.withoutX("Hxix"),"Hxi");
	}
	@Test
	public void testWithoutX4() {
		assertEquals(wx.withoutX("x"),"");
	}

}
