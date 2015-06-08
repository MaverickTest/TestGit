

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PhotoLibraryTest {
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
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Photo Library")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Cruise");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Thomson Spirit\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Independence Of The Seas\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.cssSelector("img[alt=\"Alabatros\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Local Workboats");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Red Wolf\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Merchant");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"BBC Danube\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.linkText("2")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Tugs");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Wellington\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Yachts");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Zoom Zoom Zoom\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.name("category"))).selectByVisibleText("Please select");
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("last »")).click();
    assertEquals("Photo Library | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"Zoom Zoom Zoom\"]")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    driver.findElement(By.linkText("« first")).click();
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
