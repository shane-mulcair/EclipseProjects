package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.AlarmClock;

public class AlarmClockTest {
	AlarmClock ac;
	@Before
	public void setUp() throws Exception {
		ac=new AlarmClock();
	}

	@After
	public void tearDown() throws Exception {
		ac=null;
	}

	@Test
	public void testAlarmClock1() {
		assertEquals(ac.alarmClock(1, false),"7:00");
	}
	@Test
	public void testAlarmClock2() {
		assertEquals(ac.alarmClock(5, false),"7:00");
	}
	@Test
	public void testAlarmClock3() {
		assertEquals(ac.alarmClock(0, false),"10:00");
	}

}
