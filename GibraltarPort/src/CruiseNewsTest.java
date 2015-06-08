

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CruiseNewsTest {
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
    //driver.get("http://gibport.dev02.maverick.local/");
	driver.get("http://www.gibraltarport.com");
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Cruise")).click();
    assertEquals("Cruises | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Schedules")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("+")).click();
    driver.findElement(By.cssSelector("a.fancybox-item.fancybox-close")).click();
    new Select(driver.findElement(By.id("from-month"))).selectByVisibleText("June");
    driver.findElement(By.xpath("//input[@value='GO']")).click();
    assertEquals("Schedules | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("2")).click();
    driver.findElement(By.id("DataTables_Table_0_previous")).click();
    driver.findElement(By.linkText("Facilities")).click();
    assertEquals("Facilities | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Tourism")).click();
    assertEquals("Tourism | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Museum")).click();
    driver.findElement(By.partialLinkText("Gibraltar Tourist Board")).click();
    driver.findElement(By.linkText("Airport")).click();
    assertEquals("Airport | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("Gibraltar Airport")).click();
    driver.findElement(By.linkText("News")).click();
    assertEquals("News | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("2")).click();
    assertEquals("News | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("‹ previous")).click();
    assertEquals("News | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.linkText("+ View more")).click();
    assertEquals("Green Award Press Release | Gibraltar Port Authority", driver.getTitle());
    //driver.findElement(By.linkText("Green Award Press Release.pdf")).click();
    //assertEquals("pdfViewer", driver.getTitle());
    //assertEquals("Green Award Press Release | Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
    assertEquals("Gibraltar Port Authority", driver.getTitle());
    driver.findElement(By.cssSelector("a.addthis_button_facebook.at300b > img")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | addthis_share | 30000]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | name=addthis_share | ]]
    //driver.findElement(By.id("email")).clear();
    //driver.findElement(By.id("email")).sendKeys("vanitha999@yahoo.co.uk");
    //driver.findElement(By.id("pass")).clear();
    //driver.findElement(By.id("pass")).sendKeys("Vani2509$");
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.cssSelector("a.addthis_button_twitter.at300b > img")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | addthis_share | 30000]]
    driver.findElement(By.cssSelector("a.addthis_button_print.at300b > img")).click();
    driver.findElement(By.xpath("//div[@id='block-views-do-with-us-block']/section/div/div/a[4]/img")).click();
    //driver.findElement(By.id("em-f")).clear();
    /*driver.findElement(By.cssSelector("#em-f")).clear();
    driver.findElement(By.cssSelector("#em-f")).sendKeys("vamshidhar.busireddy@mavad.co.uk");
    driver.findElement(By.id("em-e")).clear();
    driver.findElement(By.id("em-e")).sendKeys("gibraltarport");
    driver.findElement(By.cssSelector("button.btn-blue")).click();
    driver.findElement(By.id("errButton")).click();
    driver.findElement(By.id("em-e")).clear();
    driver.findElement(By.id("em-e")).sendKeys("gibraltarport@gibraltar.gi");
    driver.findElement(By.cssSelector("button.btn-blue")).click();
    driver.findElement(By.id("nucaptcha-answer")).clear();
    driver.findElement(By.id("nucaptcha-answer")).sendKeys("AATZA");
    driver.findElement(By.cssSelector("button.btn-gry")).click();
    driver.findElement(By.id("at3winheaderclose")).click();*/
    driver.findElement(By.cssSelector("img.gfx-svg")).click();
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
