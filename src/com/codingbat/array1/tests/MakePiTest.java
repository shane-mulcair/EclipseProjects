package com.codingbat.array1.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.codingbat.array1.MakePi;

public class MakePiTest {
	MakePi mp;
	@Before
	public void setUp() throws Exception {
		mp=new MakePi();
	}

	@After
	public void tearDown() throws Exception {
		mp=null;
	}

	@Test
	public void testMakePi() {
		int[] nums={3,1,4};
		int[] pi=mp.makePi();
		int count=0;
		for(int i:nums){
			assertEquals(i,pi[count]);
			count++;
		}
	}

}
