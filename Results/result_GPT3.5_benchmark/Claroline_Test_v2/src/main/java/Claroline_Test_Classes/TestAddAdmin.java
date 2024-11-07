package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;
//import testcases.Claroline_Test_Suite.model_based_dataset.sql.SQL_Process;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class TestAddAdmin {
    private WebDriver driver;
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
    public void testAddAdmin() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click(); //: fieldset/*[type="submit"]
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (!SQLProcess.containUser("Admin001","Admin001")){
        // TODO:     SQLProcess.deleteUser("Admin001","Admin001");
        // TODO: }
        // TODO: SQLProcess.close();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Create user")).click();
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys("Admin001");
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys("Admin001");
        driver.findElement(By.id("officialCode")).click();
        driver.findElement(By.id("officialCode")).clear();
        driver.findElement(By.id("officialCode")).sendKeys("0001");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("123456");
//        driver.findElement(By.xpath("//form[@id='userSettings']/fieldset[2]/dl")).click();
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys("admin001");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("admin001");
        driver.findElement(By.id("password_conf")).click();
        driver.findElement(By.id("password_conf")).clear();
        driver.findElement(By.id("password_conf")).sendKeys("admin001");
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("admin001@claroline");
        driver.findElement(By.id("platformAdmin")).click();
        driver.findElement(By.id("applyChange")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='claroBody']/div/div")).getText(), "The new user has been sucessfully created");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containUser("Admin001","Admin001")){
        // TODO:     SQLProcess.deleteUser("Admin001","Admin001");
        // TODO: }
        // TODO: SQLProcess.close();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}
