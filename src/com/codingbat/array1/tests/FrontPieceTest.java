package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.FrontPiece;

public class FrontPieceTest {
	FrontPiece fp;
	@Before
	public void setUp() throws Exception {
		fp=new FrontPiece();
	}

	@After
	public void tearDown() throws Exception {
		fp=null;
	}

	@Test
	public void testFrontPiece1() {
		int[]nums={1,2,3};
		int[]output={1,2};
		assertArrayEquals(fp.frontPiece(nums),output);
	}
	@Test
	public void testFrontPiece2() {
		int[]nums={1,2};
		int[]output={1,2};
		assertArrayEquals(fp.frontPiece(nums),output);
	}
	@Test
	public void testFrontPiece3() {
		int[]nums={1};
		int[]output={1};
		assertArrayEquals(fp.frontPiece(nums),output);
	}

}
