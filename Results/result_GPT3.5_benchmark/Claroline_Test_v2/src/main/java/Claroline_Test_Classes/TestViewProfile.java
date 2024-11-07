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

public class TestViewProfile {
    WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod
    public void before() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);

    }

    @Test
    public void testViewProfile() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.xpath("//input[@value='Enter']")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Right profile list")).click();
        // Warning: verifyTextPresent may require manual changes
       // try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                    .matches("^[\\s\\S]*Course member \\(the user is actually enrolled in the course\\)[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
        driver.findElement(By.xpath("(//img[@alt='Edit'])[6]")).click();
        Assert.assertEquals("Claroline", driver.getTitle());
        driver.findElement(By.cssSelector("a > span")).click();
        driver.findElement(By.cssSelector("a > span")).click();
        driver.findElement(By.cssSelector("a > span")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                    .matches("^[\\s\\S]*Access allowed[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
        driver.findElement(By.linkText("View all right profile")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
        Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Manage Right')]")).isDisplayed());
//            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches(
//                    "^[\\s\\S]*Agenda 	Access allowed Access allowed 	Access allowed Access allowed 	Access allowed Access allowed 	Edition allowed Edition allowed[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
    }

    @AfterMethod(alwaysRun = true)
    public void end() {
        driver.quit();
    }
}
