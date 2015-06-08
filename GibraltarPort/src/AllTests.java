import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ BunkeringTest.class, ContactUsTest.class, CruiseNewsTest.class,
		FooterMenuTest.class, MaritimeTest.class, PhotoLibraryTest.class,
		PortInformationTest.class, WhatYouCanDoWithUsTest.class,
		YachtingTest.class })
public class AllTests {

}
