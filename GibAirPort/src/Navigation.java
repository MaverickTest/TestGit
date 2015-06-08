

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigation {
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
    driver.findElement(By.linkText("Live flight info")).click();
    assertEquals("Live flight info | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-1017 > a")).click();
    assertEquals("Airlines | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-401 > a")).click();
    assertEquals("Tour operators | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-446 > a")).click();
    assertEquals("Destinations | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-447 > a")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LHR (Heathrow)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LGW (Gatwick)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'New Routes')])[2]")).click();
    assertEquals("New routes | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Check-in")).click();
    assertEquals("Check-in | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-406 > a")).click();
    assertEquals("Luggage | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-407 > a")).click();
    assertEquals("Documentation requirements | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-408 > a")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-409 > a")).click();
    assertEquals("Customs | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-408 > a")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-410 > a")).click();
    assertEquals("Your passenger rights | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-411 > a")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Getting here')])[2]")).click();
    assertEquals("Getting here | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("At the airport")).click();
    assertEquals("At the airport | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Terminal map')])[2]")).click();
    assertEquals("Terminal map | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-861 > a")).click();
    assertEquals("Shop | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-862 > a")).click();
    assertEquals("Eat | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-863 > a")).click();
    assertEquals("Relax | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Services')])[2]")).click();
    assertEquals("Services | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Aviation opportunities")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//img[contains(@src,'http://gibairport.dev02.maverick.local/sites/default/files/navigation-block/4653_Gib%20Airport_Small%20banners%20315x75px26.jpg')]")).click();
    assertEquals("Catchment area | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[2]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-582 > a")).click();
    assertEquals("Advertising opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Meeting rooms')])[2]")).click();
    assertEquals("Meeting rooms | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Business aviation")).click();
    assertEquals("Business Aviation | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Flight information")).click();
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
    driver.findElement(By.linkText("About")).click();
    assertEquals("About us | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'News')])[2]")).click();
    assertEquals("News", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-451 > a")).click();
    assertEquals("Visit the airport | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-454 > a")).click();
    assertEquals("Useful Gibraltar links | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Gibraltar government links')])[2]")).click();
    assertEquals("Gibraltar government links | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Contact us")).click();
    assertEquals("Contact us | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.id("edit-submitted-name")).clear();
    driver.findElement(By.id("edit-submitted-name")).sendKeys("test");
    driver.findElement(By.id("edit-submitted-email")).clear();
    driver.findElement(By.id("edit-submitted-email")).sendKeys("test@test.co.uk");
    driver.findElement(By.id("edit-submitted-message")).clear();
    driver.findElement(By.id("edit-submitted-message")).sendKeys("test");
    driver.findElement(By.cssSelector("#webform-client-form-70 > div > div.form-actions > input[name=\"op\"]")).click();
    assertEquals("Contact us | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//img[@alt='Gibraltar International Airport']")).click();
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
