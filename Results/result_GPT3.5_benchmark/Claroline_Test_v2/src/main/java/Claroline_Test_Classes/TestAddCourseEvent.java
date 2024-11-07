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

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestAddCourseEvent {
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
    public void testAddCourseTestEvent() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.name("submitAuth")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Computer Science')]")).click();
        driver.findElement(By.id("CLCAL")).click();
        driver.findElement(By.linkText("Add an event")).click();
        driver.findElement(By.id("title")).click();
        driver.findElement(By.id("title")).clear();
        driver.findElement(By.id("title")).sendKeys("Exam 001");
        driver.findElement(By.id("fday")).click();
        new Select(driver.findElement(By.id("fday"))).selectByVisibleText("26");
        driver.findElement(By.id("fmonth")).click();
        new Select(driver.findElement(By.id("fmonth"))).selectByVisibleText("December");
        driver.findElement(By.id("fyear")).click();
        new Select(driver.findElement(By.id("fyear"))).selectByVisibleText("2023");
        driver.findElement(By.name("submitEvent")).click();
        //try {
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Event added to the agenda.')]")).getText(), "Event added to the agenda.");
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}
