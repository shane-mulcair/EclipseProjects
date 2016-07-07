package com.codingbat.logic1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.logic1.AnswerCell;

public class AnswerCellTest {
	AnswerCell at;
	@Before
	public void setUp() throws Exception {
		at=new AnswerCell();
	}

	@After
	public void tearDown() throws Exception {
		at=null;
	}

	@Test
	public void testAnswerCell1() {
		assertEquals(at.answerCell(false, false, false),true);
	}
	@Test
	public void testAnswerCell2() {
		assertEquals(at.answerCell(false, false, true),false);
	}
	@Test
	public void testAnswerCell3() {
		assertEquals(at.answerCell(true, false, false),false);
	}

}
