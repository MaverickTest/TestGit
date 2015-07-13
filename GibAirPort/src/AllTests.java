import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ AboutTest.class, AtTheAirportTest.class, B2bTest.class,
		ContactUsTest.class, FlightInfoTest.class, FooterMenu.class,
		GibAirportHighlightsTest.class, Navigation.class,
		PrepareForYourJourneyTest.class, TimeTableTest.class, VisitTheAirPortTest.class })
public class AllTests {

}
