

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class YachtingTest {
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
  public void testUntitled6() throws Exception {
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Yachting")).click();
    assertEquals("Yachting | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Marinas")).click();
    assertEquals("Marinas | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'here')])[2]")).click();
    driver.findElement(By.linkText("Clearance Formalities")).click();
    assertEquals("Clearance Formalities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar HM Customs")).click();
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
