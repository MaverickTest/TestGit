

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MaritimeTest {
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
  public void testUntitled4() throws Exception {
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Weather & Tide")).click();
    assertEquals("Weather & Tide | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Seafarers' Welfare")).click();
    assertEquals("Seafarers' Welfare | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Maritime")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Ship Management")).click();
    assertEquals("Ship Management | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Shipping Agents")).click();
    assertEquals("Shipping Agents | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Ship Registry")).click();
    assertEquals("Ship Registry | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Maritime Administration")).click();
    driver.findElement(By.linkText("Ship Arrests")).click();
    assertEquals("Ship Arrests | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Ship Repair")).click();
    assertEquals("Ship Repair | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime Directory')])[2]")).click();
    driver.findElement(By.linkText("Provisioning")).click();
    assertEquals("Provisioning | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("STS")).click();
    assertEquals("STS | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Off Port Limits")).click();
    assertEquals("Off Port Limits | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Waste")).click();
    assertEquals("Waste | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Maritime Directory")).click();
    assertEquals("Maritime Directory | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("ANCILLARY SERVICE PROVIDERS");
    driver.findElement(By.cssSelector("option[value=\"ancillary-service-providers\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("BERTHING AND MOORING SERVICES");
    driver.findElement(By.cssSelector("option[value=\"berthing-and-mooring-services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("BUNKERING");
    driver.findElement(By.cssSelector("option[value=\"bunkering\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("COUNTER POLLUTION SERVICES");
    driver.findElement(By.cssSelector("option[value=\"counter-pollution-services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("DIVING OPERATIONS (COMMERCIAL)");
    driver.findElement(By.cssSelector("option[value=\"diving-operations-(commercial)\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("DOLPHIN BOAT SERVICES");
    driver.findElement(By.cssSelector("option[value=\"dolphin-boat-services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("FENDERS & MARINE HARDWARE");
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("FERRY SERVICES");
    driver.findElement(By.cssSelector("option[value=\"ferry-services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("LAUNCH PROVIDER/SERVICES");
    driver.findElement(By.cssSelector("option[value=\"launch-provider/services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("MARINE & CIVIL ELECTRICAL ENGINEERS");
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("SHIP AGENTS - YACHTS ONLY");
    driver.findElement(By.cssSelector("option[value=\"ship-agents---yachts-only\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("SHIP CHANDLERY");
    driver.findElement(By.cssSelector("option[value=\"ship-chandlery\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("SHIP REGISTRATION AGENTS");
    driver.findElement(By.cssSelector("option[value=\"ship-registration-agents\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("SHIP REPAIRERS");
    driver.findElement(By.cssSelector("option[value=\"ship-repairers\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("SHIPPING AGENTS");
    driver.findElement(By.cssSelector("option[value=\"shipping-agents\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("STEVEDORING");
    driver.findElement(By.cssSelector("option[value=\"stevedoring\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("STS OPERATORS");
    driver.findElement(By.cssSelector("option[value=\"sts-operators\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("TEST, HIRE, SALE OF FENDERS");
    driver.findElement(By.cssSelector("option[value=\"test,-hire,-sale-of-fenders\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("TRAINING");
    driver.findElement(By.cssSelector("option[value=\"training\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("TUG SERVICES");
    driver.findElement(By.cssSelector("option[value=\"tug-services\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("WASTE MANAGEMENT AND/OR REFUSE COLLECTION");
    driver.findElement(By.cssSelector("option[value=\"waste-management-and/or-refuse-collection\"]")).click();
    new Select(driver.findElement(By.cssSelector("select"))).selectByVisibleText("YACHT REGISTRATION AGENTS");
    driver.findElement(By.cssSelector("option[value=\"yacht-registration-agents\"]")).click();
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
