

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FooterMenuTest {
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
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Vessel Traffic Services")).click();
    assertEquals("Vessel Traffic Services | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Pilotage')])[2]")).click();
    assertEquals("Pilotage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Pre-arrival Forms')])[2]")).click();
    assertEquals("Pre-arrival Forms | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Cargo Handling')])[2]")).click();
    assertEquals("Cargo Handling | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Berthing')])[2]")).click();
    assertEquals("Berthing | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Towage')])[2]")).click();
    assertEquals("Towage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Tariffs')])[2]")).click();
    assertEquals("Tariffs | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div/h3")).click();
    driver.findElement(By.cssSelector("h3.accordion-title.m0")).click();
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div[10]/h3")).click();
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div[10]/h3")).click();
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div[5]/h3")).click();
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div[5]/h3")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Live Map')])[2]")).click();
    assertEquals("Live Map | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Port Operator Licences')])[2]")).click();
    assertEquals("Port Operator Licences | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-220']/div/div[3]/section/div/dl/dt")).click();
    driver.findElement(By.cssSelector("dt")).click();
    driver.findElement(By.xpath("//div[@id='node-220']/div/div[3]/section/div/dl[2]/dt")).click();
    driver.findElement(By.xpath("//div[@id='node-220']/div/div[3]/section/div/dl[2]/dt")).click();
    driver.findElement(By.xpath("//div[@id='node-220']/div/div[3]/section/div/dl[3]/dt")).click();
    driver.findElement(By.xpath("//div[@id='node-220']/div/div[3]/section/div/dl[3]/dt")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Weather & Tide')])[2]")).click();
    assertEquals("Weather & Tide | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(@href, '/seafarers-welfare')])[2]")).click();
    assertEquals("Seafarers' Welfare | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Shipment Management")).click();
    assertEquals("Ship Management | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Shipping Agents')])[2]")).click();
    assertEquals("Shipping Agents | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Ship Registry')])[2]")).click();
    assertEquals("Ship Registry | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Ship Arrests')])[2]")).click();
    assertEquals("Ship Arrests | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Ship Repair')])[2]")).click();
    assertEquals("Ship Repair | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Provisioning')])[2]")).click();
    assertEquals("Provisioning | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'STS')])[2]")).click();
    assertEquals("STS | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Off Port Limits')])[2]")).click();
    assertEquals("Off Port Limits | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Waste')])[2]")).click();
    assertEquals("Waste | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Maritime Directory')])[2]")).click();
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
    driver.findElement(By.linkText("Operators")).click();
    assertEquals("Operators | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Code of Practice')])[2]")).click();
    assertEquals("Code of Practice | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Marinas")).click();
    assertEquals("Marinas | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Clearance Formalities')])[2]")).click();
    assertEquals("Clearance Formalities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Schedules")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'+')])[2]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.id("from-month"))).selectByVisibleText("July");
    driver.findElement(By.xpath("//input[@value='GO']")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("2")).click();
    driver.findElement(By.id("DataTables_Table_0_previous")).click();
    new Select(driver.findElement(By.name("DataTables_Table_0_length"))).selectByVisibleText("All");
    driver.findElement(By.xpath("(//a[contains(text(),'Facilities')])[2]")).click();
    assertEquals("Facilities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Tourism')])[2]")).click();
    assertEquals("Tourism | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Airport')])[2]")).click();
    assertEquals("Airport | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Contact Us')])[2]")).click();
    assertEquals("Contact us | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Photo Library')])[2]")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Please select");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Asian Cosmos\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Arrozero Tres\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Arikan Dadayli\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Alabatros\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.linkText("last »")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("« first")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Cruise");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Thomson Spirit\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Alabatros\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Local Workboats");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Red Wolf\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Carla M\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Merchant");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("2")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Tugs");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Eliott\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Yachts");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Zoom Zoom Zoom\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Please select");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
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
