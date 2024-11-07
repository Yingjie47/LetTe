package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class TestRemoveUsers {
    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod
    public void setUp() throws Exception {
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (!SQLProcess.containUser("aa","aa")){
        // TODO:     SQLProcess.addUser("aa","aa");
        // TODO: }
        // TODO: SQLProcess.close();
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
    }

    @Test
    public void testRemoveUsers() throws IOException {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value='Enter']")).click();
        driver.findElement(By.id("breadcrumbLine")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Claroline')])[2]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("User list")).click();
        acceptNextAlert = true;
        driver.findElement(By.xpath("(//img[@alt='Delete'])[2]")).click();
        assertTrue(closeAlertAndGetItsText().contains("Are you sure to delete"));
        assertEquals(driver.findElement(By.xpath("//div[contains(text(),'Deletion of the user was done sucessfully')]")).getText(), "Deletion of the user was done sucessfully");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (SQLProcess.containUser("aaa","aaa")){
        // TODO:     SQLProcess.addUser("aaa","aaa");
        // TODO: }
        // TODO: SQLProcess.close();
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
