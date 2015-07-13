

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigationTest {
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
  public void testUntitled() throws Exception {
    driver.get("http://mavtranscreation.dev02.maverick.local/");
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("//a[@href='http://mavtranscreation.dev02.maverick.local/about/']")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("//section[@id='team']/div/article[4]/a")).click();
    driver.findElement(By.xpath("//section[@id='team']/div/article[4]/a")).click();
    driver.findElement(By.xpath("//a[@href='http://mavtranscreation.dev02.maverick.local/what-we-do/']")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.cssSelector("a[title=\"Copy Origination & Design\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Translation / Transcreation\"]")).click();
    driver.findElement(By.cssSelector("div.service.service_3 > a")).click();
    driver.findElement(By.cssSelector("a[title=\"Desktop publishing & typesetting\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Desktop publishing & typesetting\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Voiceover, Subtitling, Dubbing and more\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Quality control\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Bespoke processes\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"Localisation consultancy\"]")).click();
    driver.findElement(By.xpath("//a[@href='http://mavtranscreation.dev02.maverick.local/how-we-do-it/']")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("//*[@id='main-nav']/div/ul/li[4]/a")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'dd')])[2]")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.xpath("//a[@href='http://mavtranscreation.dev02.maverick.local/contact/']")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.cssSelector("img.svg-i")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
    driver.findElement(By.cssSelector("a.flex-next")).click();
    driver.findElement(By.cssSelector("a.flex-next")).click();
    driver.findElement(By.cssSelector("a.flex-next")).click();
    driver.findElement(By.cssSelector("img.svg-i")).click();
    assertEquals("Maverick Transcreation", driver.getTitle());
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
