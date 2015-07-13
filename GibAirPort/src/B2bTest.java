

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class B2bTest {
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
    driver.get("http://gibairport.dev02.maverick.local/");
    assertEquals("Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("B2B")).click();
    assertEquals("B2B | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[2]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-582 > a")).click();
    assertEquals("Advertising opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Meeting rooms')])[2]")).click();
    assertEquals("Meeting rooms | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[2]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.linkText("Read more...")).click();
    assertEquals("About Gibraltar Airport | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.expanded.menu-mlid-449 > a")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.linkText("Read more...")).click();
    assertEquals("An enviable location | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-467 > a")).click();
    assertEquals("About Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-469 > a")).click();
    assertEquals("Much more than you can imagine | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-450 > a")).click();
    assertEquals("Facts | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'City break')])[2]")).click();
    assertEquals("City break | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Why Gibraltar?')])[2]")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[2]")).click();
    assertEquals("About Gibraltar | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-469 > a")).click();
    assertEquals("Much more than you can imagine | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Why Gibraltar?')])[2]")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[3]")).click();
    assertEquals("Much more than you can imagine | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Why Gibraltar?')])[2]")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[4]")).click();
    assertEquals("Facts | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Why Gibraltar?')])[2]")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.xpath("(//a[contains(text(),'Read more...')])[5]")).click();
    assertEquals("City break | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Why Gibraltar?')])[2]")).click();
    //assertTrue(driver.getTitle().matches("^exact:Why Gibraltar[\\s\\S] | Gibraltar International Airport$"));
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-584 > a")).click();
    assertEquals("Technical information | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-585 > a")).click();
    assertEquals("Passenger profile | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-586 > a")).click();
    assertEquals("The Gateway | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-883 > a")).click();
    assertEquals("Catchment area | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-884 > a")).click();
    assertEquals("Air traffic in the region | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-885 > a")).click();
    assertEquals("Air traffic statistics | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-590 > a")).click();
    assertEquals("Pricing and incentives | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-591 > a")).click();
    assertEquals("Route opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation B2B contact')])[2]")).click();
    assertEquals("Aviation B2B contact | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.xpath("(//a[contains(text(),'Aviation opportunities')])[2]")).click();
    assertEquals("Aviation opportunities | Gibraltar International Airport", driver.getTitle());
    driver.findElement(By.cssSelector("li.leaf.menu-mlid-582 > a")).click();
    assertEquals("Advertising opportunities | Gibraltar International Airport", driver.getTitle());
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
