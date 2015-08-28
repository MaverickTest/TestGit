

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CceNavigation {
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
    //driver.get("http://cceambassador.dev02.maverick.local/login/?redirect_to=http://cceambassador.dev02.maverick.local/");
    driver.get("http://www.cceambassador.com/login/");
    assertEquals("Login | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys(")#(b8@r@.L=;p-K");
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys("refresh2020");
    driver.findElement(By.name("submit")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("a.inner")).click();
    assertEquals("Products & Ingredients | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("a.inner")).click();
    assertEquals("Sugar | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("Products & Ingredients | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div/article[2]/a")).click();
    assertEquals("Active Healthy Living | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[2]/article/a")).click();
    assertEquals("Environment | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[2]/article[2]/a")).click();
    assertEquals("Community (Made In) | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[3]/article/a")).click();
    assertEquals("Legacy | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[3]/article[2]/a")).click();
    assertEquals("Latest News | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("span.back-btn > a")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[4]/article/a")).click();
    assertEquals("Super Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.xpath("//div[@id='main']/main/div[4]/article[2]/a")).click();
    assertEquals("Favourites | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.id("Layer_1")).click();
    driver.findElement(By.linkText("France – Français")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.id("Layer_1")).click();
    driver.findElement(By.linkText("Belux – Français")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.id("Layer_1")).click();
    driver.findElement(By.linkText("Belux – Nederlands")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.id("Layer_1")).click();
    driver.findElement(By.linkText("Nederland – Nederlands")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("polygon")).click();
    driver.findElement(By.linkText("Norge – Norsk")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("polygon")).click();
    driver.findElement(By.linkText("Sverige - Svenska")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.id("Layer_1")).click();
    driver.findElement(By.linkText("GB – English")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Products & Ingredients")).click();
    assertEquals("Products & Ingredients | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Active Healthy Living")).click();
    assertEquals("Active Healthy Living | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Environment")).click();
    assertEquals("Environment | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Community (Made In)")).click();
    assertEquals("Community (Made In) | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Legacy")).click();
    assertEquals("Legacy | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Latest News")).click();
    assertEquals("Latest News | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Favourites")).click();
    assertEquals("Favourites | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Super Ambassadors")).click();
    assertEquals("Super Ambassadors | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.cssSelector("img[alt=\"CCE Ambassador Site\"]")).click();
    assertEquals("CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.linkText("Logout")).click();
    assertEquals("Login | CCE Ambassador Site", driver.getTitle());
    driver.findElement(By.name("pwd")).clear();
    driver.findElement(By.name("pwd")).sendKeys(")#(b8@r@.L=;p-K");
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
