package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import testcases.Claroline_Test_Suite.model_based_dataset.sql.SQL_Process;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;


public class TestAddCategory {
    WebDriver driver;
    static int in = 1;
    private StringBuffer verificationErrors = new StringBuffer();
    private boolean acceptNextAlert = true;

    @BeforeMethod
    public void before() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containCategory("Software Eng","SE112")){
        // TODO:     SQLProcess.deleteCategory("Software Eng","SE112");
        // TODO: }
        // TODO: SQLProcess.close();
    }

    @Test
    public void testAddCategory() throws Exception {
        char[] s = Character.toChars(in);
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Manage course categories")).click();
        driver.findElement(By.linkText("Create a category")).click();
        driver.findElement(By.id("category_name")).clear();
        driver.findElement(By.id("category_name")).sendKeys("Software Eng");
        driver.findElement(By.id("category_code")).clear();
        driver.findElement(By.id("category_code")).sendKeys("SE112" + s.toString());
        in++;
        driver.findElement(By.id("hidden")).click();
        driver.findElement(By.id("visible")).click();
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                    .matches("^[\\s\\S]*Category created[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
    }

    @AfterMethod
    public void end() throws SQLException, ClassNotFoundException, IOException {
        driver.quit();
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containCategory("Software Eng","SE112")){
        // TODO:     SQLProcess.deleteCategory("Software Eng","SE112");
        // TODO: }
        // TODO: SQLProcess.close();
    }
}
