package com.codingbat.warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.MonkeyTrouble;
import com.codingbat.warmup1.SleepIn;

public class MonkeyTroubleTest {
	static MonkeyTrouble mt;
	@Before
	public void setUp(){
		mt=new MonkeyTrouble();
	}
	
	@Test
	public void notEither(){
		assertEquals(mt.monkeyTrouble(false, false),true);
	}
	
	@Test
	public void onlyA(){
		assertEquals(mt.monkeyTrouble(true, false),false);
	}
	
	@Test
	public void onlyB(){
		assertEquals(mt.monkeyTrouble(false, true),false);
	}
	
	@Test
	public void both(){
		assertEquals(mt.monkeyTrouble(true, true),true);
	}
	
	@After
	public void tearDown(){
		mt=null;
	}
}
