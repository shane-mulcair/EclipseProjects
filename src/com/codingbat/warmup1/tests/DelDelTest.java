package com.codingbat.warmup1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.DelDel;

public class DelDelTest {
	DelDel del;

	@Before
	public void setUp() throws Exception {
		del=new DelDel();
	}

	@After
	public void tearDown() throws Exception {
		del=null;
	}

	@Test
	public void testDelDel1() {
		assertEquals(del.delDel("adelbc"),"abc");
	}
	@Test
	public void testDelDel2() {
		assertEquals(del.delDel("adelHello"),"aHello");
	}
	@Test
	public void testDelDel3() {
		assertEquals(del.delDel("adedbc"),"adedbc");
	}
	@Test
	public void testDelDel4() {
		assertEquals(del.delDel("adedel"),"adedel");
	}
	@Test
	public void testDelDel5(){
		assertEquals(del.delDel("ad"),"ad");
	}

}
