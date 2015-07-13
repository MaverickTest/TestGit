

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
  public void testUntitled4() throws Exception {
    driver.get("http://bank.dev02.maverick.local/");
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    //driver.findElement(By.partialLinkText("About")).click();
    driver.findElement(By.xpath("//a[@href='http://bank.dev02.maverick.local/about']")).click();
    assertEquals("About - Gibraltar Bank", driver.getTitle());
    //driver.findElement(By.linkText("Personal Accounts")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Personal Accounts')]")).click();
    assertEquals("Personal Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//a[contains(text(),'Business Accounts')]")).click();
    assertEquals("Business Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//a[contains(text(),'Where to find us')]")).click();
    assertEquals("Where to find us - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//a[contains(text(),'Business Accounts')]")).click();
    //assertEquals("Personal Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//a[contains(text(),'Business Accounts')]")).click();
    assertEquals("Business Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//a[contains(text(),'Client Applications')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Mortgage Applications')]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Where to find us')])[2]")).click();
    assertEquals("Where to find us - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    //driver.findElement(By.linkText("Tariffs")).click();
    driver.findElement(By.xpath("(//a[contains(@href, 'https://www.facebook.com/gibintbank')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(@href, 'https://twitter.com/gibintbank')])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(@href, 'https://www.linkedin.com/company/5396557')])[2]")).click();
    driver.findElement(By.linkText("Terms & Conditions")).click();
    assertEquals("Terms & Conditions - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Home')])[2]")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'About')])[2]")).click();
    assertEquals("About - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Personal Accounts')])[2]")).click();
    assertEquals("Personal Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Business Accounts')])[2]")).click();
    assertEquals("Business Accounts - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Where to find us')])[3]")).click();
    assertEquals("Where to find us - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar International Bank")).click();
    assertEquals("Managing your money easily - Gibraltar Bank", driver.getTitle());
    driver.findElement(By.xpath("//button")).click();
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
