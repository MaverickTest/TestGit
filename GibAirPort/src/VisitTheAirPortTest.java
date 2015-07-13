

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VisitTheAirPortTest {
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
    driver.get("http://gibairport.dev02.maverick.local/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//*[@id='block-panels-mini-latest-news-visit-the-airport']/section/div/div/div[2]/div/div/div/div[1]/a/img")).click();
    assertEquals("Visit the airport | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("General");
    assertEquals("General | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("Terminal building");
    assertEquals("Terminal building | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("All");
    assertEquals("Visit the airport | Gibraltar International Airport", driver.getTitle());
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("General");
    assertEquals("General | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("a.gallery-grouped > img")).click();
    driver.findElement(By.cssSelector("a.fancybox-nav.fancybox-next")).click();
    driver.findElement(By.cssSelector("a.fancybox-nav.fancybox-next")).click();
    driver.findElement(By.cssSelector("a.fancybox-nav.fancybox-next")).click();
    driver.findElement(By.cssSelector("a.fancybox-nav.fancybox-next")).click();
    driver.findElement(By.cssSelector("a.fancybox-nav.fancybox-next")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("Terminal building");
    assertEquals("Terminal building | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("//img[contains(@src,'http://gibairport.dev02.maverick.local/sites/default/files/styles/gallery_thumbnail/public/gallery/Terminal%20From%20The%20Upper%20Rock.jpg?itok=jQn-fiIc')]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("SelectURL"))).selectByVisibleText("All");
    assertEquals("Visit the airport | Gibraltar International Airport", driver.getTitle());
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
