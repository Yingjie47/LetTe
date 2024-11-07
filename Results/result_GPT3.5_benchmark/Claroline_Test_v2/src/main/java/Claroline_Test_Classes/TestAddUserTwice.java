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

import static org.testng.Assert.assertEquals;

public class TestAddUserTwice {
    private WebDriver driver;
    private boolean acceptNextAlert = true;

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containUser("user001", "user001")) {
        // TODO:     SQLProcess.deleteUser("user001", "user001");
        // TODO: }
        // TODO: SQLProcess.close();
    }

    @Test
    public void testAddUserTwice() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("User list")).click();
        driver.findElement(By.id("claroBody")).click();
        driver.findElement(By.linkText("Create user")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("user001");
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("user001");
        driver.findElement(By.id("officialCode")).click();
        driver.findElement(By.id("officialCode")).clear();
        driver.findElement(By.id("officialCode")).sendKeys("001");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("user001");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("user001");
        driver.findElement(By.id("password_conf")).click();
        driver.findElement(By.id("password_conf")).clear();
        driver.findElement(By.id("password_conf")).sendKeys("user001");
        driver.findElement(By.id("applyChange")).click();
        driver.findElement(By.xpath("//div[@id='claroBody']/ul/li[3]/a")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("User list")).click();
        driver.findElement(By.id("claroBody")).click();
        driver.findElement(By.linkText("Create user")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("user001");
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("user001");
        driver.findElement(By.id("officialCode")).click();
        driver.findElement(By.id("officialCode")).clear();
        driver.findElement(By.id("officialCode")).sendKeys("002");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("user001");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("user001");
        driver.findElement(By.id("password_conf")).click();
        driver.findElement(By.id("password_conf")).clear();
        driver.findElement(By.id("password_conf")).sendKeys("user001");
        driver.findElement(By.id("applyChange")).click();
        assertEquals(driver.findElement(By.xpath("//div[contains(text(),'This user name is already taken')]")).getText(), "This user name is already taken");
    }

    @AfterMethod

    public void tearDown() throws Exception {
        driver.quit();
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containUser("user001", "user001")) {
        // TODO:   SQLProcess.deleteUser("user001", "user001");
        // TODO: }
        // TODO: SQLProcess.close();
    }

}
