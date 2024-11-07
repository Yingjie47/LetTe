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

public class TestAddEmptyCourse {
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
    public void testAddEmptyCourse() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.name("submitAuth")).click();
        driver.findElement(By.linkText("Create a course site")).click();
        driver.findElement(By.name("changeProperties")).click();
        String message = driver.findElement(By.xpath("//div[@id='claroBody']/div/div/span[1]")).getText();
        Assert.assertTrue(message.contains("Course title needed"));
        String message2 = driver.findElement(By.xpath("//div[@id='claroBody']/div/div/span[2]")).getText();
        Assert.assertTrue(message2.contains("Course code needed"));
    }

    @AfterMethod
	public void end(){
		driver.quit();
	}


}
