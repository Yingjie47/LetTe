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

public class TestAnnouncement {
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
    public void testAnnouncement() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value='Enter']")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Configuration")).click();
        driver.findElement(By.linkText("Announcement")).click();
        // Warning: verifyTextPresent may require manual changes
        try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                    .matches("^[\\s\\S]*Use 0 to display all[\\s\\S]*$"));
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        driver.findElement(By.id("label_announcementPortletMaxItems")).clear();
        driver.findElement(By.id("label_announcementPortletMaxItems")).sendKeys("0");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches(
                    "^[\\s\\S]*Properties for Announcement, \\(CLANN\\) are now effective on server[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }

}
