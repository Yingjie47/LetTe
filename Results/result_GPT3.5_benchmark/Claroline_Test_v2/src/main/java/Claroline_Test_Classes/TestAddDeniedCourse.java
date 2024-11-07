package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestAddDeniedCourse {
  private WebDriver driver;

  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver",
            "D:\\anaconda3\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(Constants.BASE_URL);
    // TODO: Course.deleteCourse("225");
  }

  @Test
  public void testAddDeniedCourse() throws Exception {
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    driver.findElement(By.linkText("Create a course site")).click();
    driver.findElement(By.id("course_title")).click();
    driver.findElement(By.id("course_title")).clear();
    driver.findElement(By.id("course_title")).sendKeys("Computer Science");
    driver.findElement(By.id("course_officialCode")).click();
    driver.findElement(By.id("course_officialCode")).clear();
    driver.findElement(By.id("course_officialCode")).sendKeys("225");
    Select category = new Select(driver.findElement(By.xpath("//*[@id=\"mslist2\"]")));
    category.selectByIndex(0);
    driver.findElement(By.xpath("//*[@id=\"mandatories\"]/div/dl/dd[3]/table/tbody/tr/td[2]/a[2]/img")).click();
    //    driver.findElement(By.xpath("//*[@id=\"advancedInformation\"]/legend/a")).click();
//    driver.findElement(By.xpath("//*[@id=\"course_status_date\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=mslist2 | label=Sciences]]
//    driver.findElement(By.xpath("//*[@id=\"course_publicationDay\"]")).click();
//    driver.findElement(By.xpath("//option[@value='2']")).click();
    driver.findElement(By.xpath("//fieldset[@id='mandatories']/div/dl/dd[3]/table/tbody/tr/td[2]/a[2]/img")).click();
    driver.findElement(By.id("mandatories")).click();
    driver.findElement(By.id("course_titular")).clear();
    driver.findElement(By.id("course_titular")).sendKeys("John");
    driver.findElement(By.name("changeProperties")).click();

    Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'You have just created the course website :')]")).getText(),
            "You have just created the course website : 225");
  }

  @AfterMethod
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }


}
