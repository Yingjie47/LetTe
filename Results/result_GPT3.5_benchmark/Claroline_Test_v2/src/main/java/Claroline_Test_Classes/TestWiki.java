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

public class TestWiki {
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
    public void testWiki() {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Modules")).click();
        driver.findElement(By.xpath("(//img[@alt='Properties'])[11]")).click();
        driver.findElement(By.linkText("Local settings")).click();
        driver.findElement(By.id("label_showWikiEditorToolbar_FALSE")).click();
        driver.findElement(By.id("label_forcePreviewBeforeSaving_TRUE")).click();
        driver.findElement(By.id("label_forcePreviewBeforeSaving_FALSE")).click();
        driver.findElement(By.id("label_showWikiEditorToolbar_TRUE")).click();
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
            Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                    .matches("^[\\s\\S]*Properties for Wiki, \\(CLWIKI\\) are now effective on server\\.[\\s\\S]*$"));
        //} catch (Error e) {
        //    verificationErrors.append(e.toString());
        //}
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.linkText("About")).click();
    }

    @AfterMethod(alwaysRun = true)
    public void end() {
        driver.quit();
    }
}
