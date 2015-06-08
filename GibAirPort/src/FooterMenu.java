

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FooterMenu {
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
  public void testUntitled3() throws Exception {
    driver.get("http://gibairport.mavdig.co.uk/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Live flight info')])[2]")).click();
    assertEquals("Live flight info | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Airlines')])[3]")).click();
    assertEquals("Airlines | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Tour operators')])[3]")).click();
    assertEquals("Tour operators | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Destination map')])[3]")).click();
    assertEquals("Destinations | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Timetable')])[3]")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LHR (Heathrow)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Arrivals")).click();
    new Select(driver.findElement(By.id("departure-airports"))).selectByVisibleText("LTN (Luton)");
    driver.findElement(By.xpath("//input[@value='Search flights']")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Destination map')])[3]")).click();
    assertEquals("Destinations | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Timetable')])[3]")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Timetable')])[3]")).click();
    assertEquals("Timetable | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'New Routes')])[3]")).click();
    assertEquals("New routes | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Read more...")).click();
    assertEquals("Tangier | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Check-in')])[2]")).click();
    assertEquals("Check-in | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Luggage')])[3]")).click();
    assertEquals("Luggage | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Documentation requirements')])[3]")).click();
    assertEquals("Documentation requirements | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Special assistance')])[3]")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Special assistance')])[3]")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Special assistance-de")).click();
    assertEquals("Special assistance | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Customs')])[3]")).click();
    assertEquals("Customs | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Your passenger rights')])[3]")).click();
    assertEquals("Your passenger rights | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Your passenger rights')])[3]")).click();
    assertEquals("Your passenger rights | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Plan your trip to Gibraltar')])[3]")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Read more...")).click();
    assertEquals("Car hire | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Prepare for your journey')])[2]")).click();
    assertEquals("Prepare for your journey | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Plan your trip to Gibraltar')])[3]")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[2]")).click();
    assertEquals("Transport companies | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Plan your trip to Gibraltar')])[2]")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[3]")).click();
    assertEquals("Gibraltar hotels | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Plan your trip to Gibraltar')])[2]")).click();
    assertEquals("Plan your trip to Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Getting here')])[3]")).click();
    assertEquals("Getting here | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Terminal map')])[2]")).click();
    assertEquals("Terminal map | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Shop')])[3]")).click();
    assertEquals("Shop | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Eat')])[3]")).click();
    assertEquals("Eat | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Relax')])[3]")).click();
    assertEquals("Relax | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Services')])[3]")).click();
    assertEquals("Services | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[2]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Advertising opportunities')])[3]")).click();
    assertEquals("Advertising opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[3]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Meeting rooms')])[3]")).click();
    assertEquals("Meeting rooms | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'News')])[2]")).click();
    assertEquals("News", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Photos')])[3]")).click();
    assertEquals("Visit the airport | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Useful Gibraltar links')])[3]")).click();
    assertEquals("Useful Gibraltar links | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Useful Gibraltar links')])[3]")).click();
    assertEquals("Useful Gibraltar links | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Gibraltar government links')])[3]")).click();
    assertEquals("Gibraltar government links | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[2]")).click();
    assertEquals("Contact us | Gibraltar International Airport", driver.getTitle());
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
