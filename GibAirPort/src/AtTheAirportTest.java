

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AtTheAirportTest {
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
    driver.get("http://gibairport.dev02.maverick.local/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
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
