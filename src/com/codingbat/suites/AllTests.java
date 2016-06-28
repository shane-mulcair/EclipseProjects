package com.codingbat.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codingbat.warmup1.tests.BackAroundTest;
import com.codingbat.warmup1.tests.Diff21Test;
import com.codingbat.warmup1.tests.Front22Test;
import com.codingbat.warmup1.tests.Front3Test;
import com.codingbat.warmup1.tests.FrontBackTest;
import com.codingbat.warmup1.tests.HasTeenTest;
import com.codingbat.warmup1.tests.IcyHotTest;
import com.codingbat.warmup1.tests.In1020Test;
import com.codingbat.warmup1.tests.Makes10Test;
import com.codingbat.warmup1.tests.MissingCharTest;
import com.codingbat.warmup1.tests.MonkeyTroubleTest;
import com.codingbat.warmup1.tests.NearHundredTest;
import com.codingbat.warmup1.tests.NotStringTest;
import com.codingbat.warmup1.tests.Or35Test;
import com.codingbat.warmup1.tests.ParrotTroubleTest;
import com.codingbat.warmup1.tests.PosNegTest;
import com.codingbat.warmup1.tests.SleepInTest;
import com.codingbat.warmup1.tests.StartHiTest;
import com.codingbat.warmup1.tests.SumDoubleTest;

@RunWith(Suite.class)
@SuiteClasses({ BackAroundTest.class, Diff21Test.class, Front22Test.class, Front3Test.class, FrontBackTest.class,
		HasTeenTest.class, IcyHotTest.class, In1020Test.class, Makes10Test.class, MissingCharTest.class,
		MonkeyTroubleTest.class, NearHundredTest.class, NotStringTest.class, Or35Test.class, ParrotTroubleTest.class,
		PosNegTest.class, SleepInTest.class, StartHiTest.class, SumDoubleTest.class })
public class AllTests {

}
