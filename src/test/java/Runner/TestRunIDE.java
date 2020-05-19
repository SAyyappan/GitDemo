package Runner;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestRunIDE {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1() {
    // Test name: Test1
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://www.sharetask.eu/");
    // 2 | setWindowSize | 1936x1056 | 
    driver.manage().window().setSize(new Dimension(1936, 1056));
    // 3 | type | id=email_id | ayyappan.sivatharisanam@gmail.com
    driver.findElement(By.id("email_id")).sendKeys("ayyappan.sivatharisanam@gmail.com");
    // 4 | type | id=pwd | London12345#
    driver.findElement(By.id("pwd")).sendKeys("London12345#");
    // 5 | click | css=.field-group:nth-child(3) > #lgenter | 
    driver.findElement(By.cssSelector(".field-group:nth-child(3) > #lgenter")).click();
    // 6 | click | css=.name | 
    driver.findElement(By.cssSelector(".name")).click();
    // 7 | click | css=.toggle_div li:nth-child(2) > a | 
    driver.findElement(By.cssSelector(".toggle_div li:nth-child(2) > a")).click();
    // 8 | click | css=.options > li:nth-child(4) > a | 
    driver.findElement(By.cssSelector(".options > li:nth-child(4) > a")).click();
    // 9 | click | linkText=Add | 
    driver.findElement(By.linkText("Add")).click();
    // 10 | click | id=Cell | 
    driver.findElement(By.id("Cell")).click();
    // 11 | click | css=.phn-no:nth-child(2) > button | 
    driver.findElement(By.cssSelector(".phn-no:nth-child(2) > button")).click();
    // 12 | click | linkText=OK | 
    driver.findElement(By.linkText("OK")).click();
    // 13 | click | id=OTP | 
    driver.findElement(By.id("OTP")).click();
    // 14 | type | id=OTP | 957146
    driver.findElement(By.id("OTP")).sendKeys("957146");
    // 15 | click | css=.phn-no:nth-child(1) > button | 
    driver.findElement(By.cssSelector(".phn-no:nth-child(1) > button")).click();
    // 16 | click | linkText=OK | 
    driver.findElement(By.linkText("OK")).click();
  }
}
