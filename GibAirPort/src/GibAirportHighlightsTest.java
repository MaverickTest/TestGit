

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GibAirportHighlightsTest {
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
  public void testUntitled2() throws Exception {
    driver.get("http://gibairport.dev02.maverick.local/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div/div/a/h2")).click();
    assertEquals("Page not found | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div[2]/div/a/div")).click();
    assertEquals("Documentation requirements | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-408 > a")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-409 > a")).click();
    assertEquals("Customs | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-410 > a")).click();
    assertEquals("Your passenger rights | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-411 > a")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Getting here')])[2]")).click();
    assertEquals("Getting here | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Check-in')])[2]")).click();
    assertEquals("Check-in | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-406 > a")).click();
    assertEquals("Luggage | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div[3]/div/a/h2")).click();
    assertEquals("Flight info | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Live flight info')])[2]")).click();
    assertEquals("Live flight info | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    driver.findElement(By.linkText("Departures")).click();
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-1017 > a")).click();
    assertEquals("Airlines | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-401 > a")).click();
    assertEquals("Tour operators | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-446 > a")).click();
    assertEquals("Destinations | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-447 > a")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'New Routes')])[2]")).click();
    assertEquals("New routes | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-1017 > a")).click();
    assertEquals("Airlines | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div[4]/div/a/h2")).click();
    assertEquals("Page not found | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div[5]/div/a/h2")).click();
    assertEquals("Business Aviation | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Gibraltar International Airport\"]")).click();
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-homepage-highlights-block']/section/div/div/div[6]/div/a/h2")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-409 > a")).click();
    assertEquals("Customs | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-410 > a")).click();
    assertEquals("Your passenger rights | Gibraltar International Airport", driver.getTitle());
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
