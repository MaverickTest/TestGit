

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WhatYouCanDoWithUsTest {
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
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("div.hub-image.background-cover")).click();
    assertEquals("Bunkering | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Operators")).click();
    assertEquals("Operators | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Code of Practice")).click();
    assertEquals("Code of Practice | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div[2]/div[2]/div/a/div")).click();
    assertEquals("Cruises | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Schedules")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.id("from-year"))).selectByVisibleText("2016");
    driver.findElement(By.xpath("//input[@value='GO']")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("DataTables_Table_0_length"))).selectByVisibleText("All");
    driver.findElement(By.name("DataTables_Table_0_length")).click();
    new Select(driver.findElement(By.name("DataTables_Table_0_length"))).selectByVisibleText("50");
    new Select(driver.findElement(By.name("DataTables_Table_0_length"))).selectByVisibleText("25");
    new Select(driver.findElement(By.name("DataTables_Table_0_length"))).selectByVisibleText("10");
    driver.findElement(By.linkText("Facilities")).click();
    assertEquals("Facilities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Tourism")).click();
    assertEquals("Tourism | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Airport")).click();
    assertEquals("Airport | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div[2]/div[3]/div/a/div")).click();
    assertEquals("Yachting | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Marinas")).click();
    assertEquals("Marinas | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Clearance Formalities")).click();
    assertEquals("Clearance Formalities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div[2]/div[4]/div/a/div")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Shipment Management")).click();
    assertEquals("Ship Management | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[2]/div/a/div")).click();
    assertEquals("Shipping Agents | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[3]/div/a/div")).click();
    assertEquals("Ship Registry | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[4]/div/a/div")).click();
    assertEquals("Ship Arrests | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[5]/div/a/div")).click();
    assertEquals("Ship Repair | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[6]/div/a/div")).click();
    assertEquals("Provisioning | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[7]/div/a/div")).click();
    assertEquals("STS | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[8]/div/a/div")).click();
    assertEquals("Off Port Limits | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-32']/div/div[2]/section/div/div[9]/div/a/div")).click();
    assertEquals("Waste | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime')])[2]")).click();
    assertEquals("Maritime | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[10]")).click();
    assertEquals("Maritime Directory | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div[2]/div[5]/div/a/div")).click();
    assertEquals("Seafarers' Welfare | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div[2]/div[6]/div/a/div")).click();
    assertEquals("Port Information | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Vessel Traffic Services")).click();
    assertEquals("Vessel Traffic Services | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Pilotage")).click();
    assertEquals("Pilotage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Pre-arrival Forms")).click();
    assertEquals("Pre-arrival Forms | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Cargo Handling")).click();
    assertEquals("Cargo Handling | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Berthing")).click();
    assertEquals("Berthing | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Towage")).click();
    assertEquals("Towage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Tariffs")).click();
    assertEquals("Tariffs | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Live Map")).click();
    assertEquals("Live Map | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Port Operator Licences")).click();
    assertEquals("Port Operator Licences | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
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
