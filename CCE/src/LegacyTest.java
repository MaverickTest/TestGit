

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LegacyTest {
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
    driver.get("http://cceambassador.dev02.maverick.local/login/");
    assertEquals("Login | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys("refresh2020");
    driver.findElement(By.name("submit")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[3]/article/a")).click();
    assertEquals("Legacy | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("a.inner")).click();
    assertEquals("Heritage | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("Legacy | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='content']/div[2]/article/a")).click();
    assertEquals("Winning Culture | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("a.inner")).click();
    assertEquals("Winning Culture Factsheet | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Back to previous page")).click();
    assertEquals("Winning Culture | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Logout")).click();
    assertEquals("Login | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys("refresh2020");
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
