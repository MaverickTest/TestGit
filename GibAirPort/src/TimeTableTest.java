

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TimeTableTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.firefox.bin",
              "C:\\Program Files\\Mozilla\\firefox.exe");
	  driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get("http://gibairport.dev02.maverick.local/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    driver.findElement(By.linkText("Departures")).click();
    driver.findElement(By.linkText("View all of today's flights")).click();
    assertEquals("Live flight info | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-447 > a")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LGW (Gatwick)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LHR (Heathrow)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LTN (Luton)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("MAN (Manchester)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("BHX (Birmingham)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("BRS (Bristol)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("TNG (Tangier)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("CMN (Casablanca)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LGW (Gatwick)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LHR (Heathrow)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LTN (Luton)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("MAN (Manchester)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("BHX (Birmingham)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("BRS (Bristol)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("TNG (Tangier)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Departures")).click();
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
