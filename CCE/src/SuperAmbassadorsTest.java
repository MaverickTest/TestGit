

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SuperAmbassadorsTest {
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
    driver.get("http://cceambassador.dev02.maverick.local/login/");
    assertEquals("Login | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys("refresh2020");
    driver.findElement(By.name("submit")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[4]/article/a")).click();
    assertEquals("Super Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='content']/div/article[2]/a")).click();
    assertEquals("Training Videos | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("Super Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='content']/div/article[3]/a")).click();
    assertEquals("Course presentations | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("Super Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Meet The Super Ambassadors")).click();
    assertEquals("Meet the Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\" photo\"]")).click();
    driver.findElement(By.cssSelector("span.close")).click();
    driver.findElement(By.xpath("(//img[@alt=' photo'])[17]")).click();
    driver.findElement(By.xpath("//div[@id='content']/div/article[17]/div/div[2]/span")).click();
    driver.findElement(By.xpath("(//img[@alt=' photo'])[20]")).click();
    driver.findElement(By.xpath("//div[@id='content']/div/article[20]/div/div[2]/span")).click();
    driver.findElement(By.xpath("(//img[@alt=' photo'])[21]")).click();
    driver.findElement(By.xpath("//div[@id='content']/div/article[21]/div/div[2]/span")).click();
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
