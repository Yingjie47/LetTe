package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestAddWrongPassword {
    WebDriver driver;
    static int in = 1;
    private StringBuffer verificationErrors = new StringBuffer();
    private boolean acceptNextAlert = true;

    @BeforeMethod
    public void before() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
    }

    @Test
    public void testAddWrongPassword() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Create user")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Zainab");
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("ALi");
        driver.findElement(By.id("officialCode")).clear();
        driver.findElement(By.id("officialCode")).sendKeys("555");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("Zainab");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("password_conf")).clear();
        driver.findElement(By.id("password_conf")).sendKeys("1234567");
        driver.findElement(By.id("student")).click();
        driver.findElement(By.id("applyChange")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'You typed two different passwords')]")).getText(),
                "You typed two different passwords");

    }
    @AfterMethod
    public void end(){
        driver.quit();
    }
}
