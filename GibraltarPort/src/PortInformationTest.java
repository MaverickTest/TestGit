

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PortInformationTest {
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
    driver.findElement(By.linkText("Cruise")).click();
    assertEquals("Cruises | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Schedules")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("+")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Photo Library")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Arion\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Weather & Tide")).click();
    assertEquals("Weather & Tide | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Port Information")).click();
    assertEquals("Port Information | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Live Map")).click();
    assertEquals("Live Map | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Port Operator Licences")).click();
    assertEquals("Port Operator Licences | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Tariffs")).click();
    assertEquals("Tariffs | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='node-26']/div/div[3]/section/div/div/h3")).click();
    driver.findElement(By.cssSelector("h3.accordion-title.m0")).click();
    driver.findElement(By.linkText("Towage")).click();
    assertEquals("Towage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Berthing")).click();
    assertEquals("Berthing | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Cargo Handling")).click();
    assertEquals("Cargo Handling | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Pre-arrival Forms")).click();
    assertEquals("Pre-arrival Forms | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Pilotage")).click();
    assertEquals("Pilotage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Vessel Traffic Services")).click();
    assertEquals("Vessel Traffic Services | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Pilotage")).click();
    assertEquals("Pilotage | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("//a[@href='http://www.gibraltarpilots.com/']")).click();
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
