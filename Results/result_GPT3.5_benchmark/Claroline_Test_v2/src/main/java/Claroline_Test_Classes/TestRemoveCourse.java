package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Course;
import Claroline_Test_Classes.sql.Constants;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class TestRemoveCourse {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        //TODO: Category.addCategory("Mathematics","MA112");
    }

    @Test
    public void testRemoveCourse() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value='Enter']")).click();

        Course.addCourse(driver,"Computer Science");
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Course list")).click();
        acceptNextAlert = true;
        driver.findElement(By.xpath("(//img[@alt='Delete'])[1]")).click();
        assertTrue(closeAlertAndGetItsText().contains("Are you sure to delete"));
        driver.findElement(By.xpath("//div[@id='claroBody']/div[2]/div")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='claroBody']/div[2]/div")).getText(), "The course has been successfully deleted");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
