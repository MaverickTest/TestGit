

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactTest {
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
  public void testUntitled5() throws Exception {
    driver.get("http://mavtranscreation.dev02.maverick.local/");
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("//*[@id='main-nav']/div/ul/li[5]/a")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.cssSelector("a.ir > img.svg-i")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp |  | 30000]]
    driver.findElement(By.cssSelector("li.linkedIn.social > a.ir > img.svg-i")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp |  | 30000]]
    driver.findElement(By.linkText("www.mavad.co.uk")).click();
    driver.findElement(By.cssSelector("img.svg-i")).click();
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
