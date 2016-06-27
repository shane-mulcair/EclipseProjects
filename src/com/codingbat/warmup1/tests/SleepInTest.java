package com.codingbat.warmup1.tests;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.warmup1.SleepIn;

public class SleepInTest {

	static SleepIn si;
	@Before
	public void setUp(){
		si=new SleepIn();
	}
	
	@Test
	public void notWeekday(){
		assertEquals(si.sleepIn(false, false),true);
	}
	
	@Test
	public void isWeekday(){
		assertEquals(si.sleepIn(true, false),false);
	}
	
	@Test
	public void isVacation(){
		assertEquals(si.sleepIn(false, true),true);
	}
	
	@Test
	public void isVacationAndWeekday(){
		assertEquals(si.sleepIn(true, true),true);
	}
	
	@After
	public void tearDown(){
		si=null;
	}
	
}
