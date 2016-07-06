package com.codingbat.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codingbat.string1.tests.AtFirstTest;
import com.codingbat.string1.tests.ComboStringTest;
import com.codingbat.string1.tests.ConCatTest;
import com.codingbat.string1.tests.DeFrontTest;
import com.codingbat.string1.tests.EndsLyTest;
import com.codingbat.string1.tests.ExtraEndTest;
import com.codingbat.string1.tests.ExtraFrontTest;
import com.codingbat.string1.tests.FirstHalfTest;
import com.codingbat.string1.tests.FirstTwoTest;
import com.codingbat.string1.tests.FrontAgainTest;
import com.codingbat.string1.tests.HasBadTest;
import com.codingbat.string1.tests.HelloNameTest;
import com.codingbat.string1.tests.LastCharsTest;
import com.codingbat.string1.tests.LastTwoTest;
import com.codingbat.string1.tests.Left2Test;
import com.codingbat.string1.tests.MakeAbbaTest;
import com.codingbat.string1.tests.MakeOutWordTest;
import com.codingbat.string1.tests.MakeTagsTest;
import com.codingbat.string1.tests.MiddleThreeTest;
import com.codingbat.string1.tests.MiddleTwoTest;
import com.codingbat.string1.tests.MinCatTest;
import com.codingbat.string1.tests.NTwiceTest;
import com.codingbat.string1.tests.NonStartTest;
import com.codingbat.string1.tests.Right2Test;
import com.codingbat.string1.tests.SeeColorTest;
import com.codingbat.string1.tests.StartWordTest;
import com.codingbat.string1.tests.TheEndTest;
import com.codingbat.string1.tests.TwoCharTest;
import com.codingbat.string1.tests.WithouEnd2Test;
import com.codingbat.string1.tests.Without2Test;
import com.codingbat.string1.tests.WithoutEndTest;
import com.codingbat.string1.tests.WithoutX2Test;
import com.codingbat.string1.tests.WithoutXTest;

@RunWith(Suite.class)
@SuiteClasses({ AtFirstTest.class, ComboStringTest.class, ConCatTest.class, DeFrontTest.class, EndsLyTest.class,
		ExtraEndTest.class, ExtraFrontTest.class, FirstHalfTest.class, FirstTwoTest.class, FrontAgainTest.class,
		HasBadTest.class, HelloNameTest.class, LastCharsTest.class, LastTwoTest.class, Left2Test.class,
		MakeAbbaTest.class, MakeOutWordTest.class, MakeTagsTest.class, MiddleThreeTest.class, MiddleTwoTest.class,
		MinCatTest.class, NonStartTest.class, NTwiceTest.class, Right2Test.class, SeeColorTest.class,
		StartWordTest.class, TheEndTest.class, TwoCharTest.class, WithouEnd2Test.class, Without2Test.class,
		WithoutEndTest.class, WithoutX2Test.class, WithoutXTest.class })
public class String1Tests {

}
