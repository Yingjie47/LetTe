package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class TestSearchAdmin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeMethod
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver",
            "D:\\anaconda3\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(Constants.BASE_URL);
  }

  @Test
  public void testSearchAdmin() throws Exception {
    driver.findElement(By.id("login")).clear();
    driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
    driver.findElement(By.xpath("//input[@value='Enter']")).click();
    driver.findElement(By.id("breadcrumbLine")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Claroline')])[2]")).click();
    driver.findElement(By.linkText("Platform administration")).click();
    driver.findElement(By.linkText("Advanced")).click();
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Doe");
    driver.findElement(By.xpath("//input[@value='Search user']")).click();
    driver.findElement(By.linkText("Advanced")).click();
    driver.findElement(By.xpath("//input[@value='Search user']")).click();
    driver.findElement(By.id("L0")).click();
    assertEquals(driver.findElement(By.id("L0")).getText(), "Doe");
    driver.findElement(By.xpath("//div[@id='claroBody']/table[2]")).click();
    assertEquals(driver.findElement(By.linkText("admin@gmail.com")).getText(), "admin@gmail.com");
    driver.findElement(By.xpath("//div[@id='claroBody']/table[2]")).click();
    driver.findElement(By.xpath("//div[@id='claroBody']/table[2]/tbody/tr/td[6]")).click();
    assertTrue(driver.findElement(By.xpath("//div[@id='claroBody']/table[2]/tbody/tr/td[6]")).getText().contains("Administrator"));
    driver.findElement(By.linkText("Logout")).click();
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
