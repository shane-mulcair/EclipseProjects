package com.codingbat.string2.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.string2.RepeatSeparator;

public class RepeatSeparatorTest {
	RepeatSeparator rs;

	@Before
	public void setUp() throws Exception {
		rs = new RepeatSeparator();
	}

	@After
	public void tearDown() throws Exception {
		rs = null;
	}

	@Test
	public void testRepeatSeparator1() {
		assertEquals(rs.repeatSeparator("Word", "X", 3), "WordXWordXWord");
	}

	@Test
	public void testRepeatSeparator2() {
		assertEquals(rs.repeatSeparator("This", "And", 2), "ThisAndThis");
	}

	@Test
	public void testRepeatSeparator3() {
		assertEquals(rs.repeatSeparator("This", "And", 1), "This");
	}

}
