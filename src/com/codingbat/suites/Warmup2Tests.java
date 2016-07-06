package com.codingbat.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codingbat.warmup2.tests.AltPairsTest;
import com.codingbat.warmup2.tests.Array123Test;
import com.codingbat.warmup2.tests.Array667Test;
import com.codingbat.warmup2.tests.ArrayCount9Test;
import com.codingbat.warmup2.tests.ArrayFront9Test;
import com.codingbat.warmup2.tests.CountXXTest;
import com.codingbat.warmup2.tests.DoubleXTest;
import com.codingbat.warmup2.tests.FrontTimesTest;
import com.codingbat.warmup2.tests.Has271Test;
import com.codingbat.warmup2.tests.Last2Test;
import com.codingbat.warmup2.tests.NoTriplesTest;
import com.codingbat.warmup2.tests.StringBitsTest;
import com.codingbat.warmup2.tests.StringMatchTest;
import com.codingbat.warmup2.tests.StringSplosionTest;
import com.codingbat.warmup2.tests.StringTimesTest;
import com.codingbat.warmup2.tests.StringXTest;
import com.codingbat.warmup2.tests.StringYakTest;

@RunWith(Suite.class)
@SuiteClasses({ AltPairsTest.class, Array123Test.class, Array667Test.class, ArrayCount9Test.class,
		ArrayFront9Test.class, CountXXTest.class, DoubleXTest.class, FrontTimesTest.class, Has271Test.class,
		Last2Test.class, NoTriplesTest.class, StringBitsTest.class, StringMatchTest.class, StringSplosionTest.class,
		StringTimesTest.class, StringXTest.class, StringYakTest.class })
public class Warmup2Tests {

}
