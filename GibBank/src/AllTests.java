import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ AboutTabTest.class, BusinessAccountsTabTest.class, EgibTabTest.class,
		HomeTabTest.class, Navigation.class, PersonalAccountsTabTest.class,
		SocialIconTest.class, Navigation.class,
		WhereToFindUsTabTest.class})
public class AllTests {

}
