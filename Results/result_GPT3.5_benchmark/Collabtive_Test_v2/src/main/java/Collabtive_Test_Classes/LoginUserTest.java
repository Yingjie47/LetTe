
package Collabtive_Test_Classes;

//import config.DriverConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Collabtive_Test_Classes.sql.Constants;
//import Collabtive_Test_Classes.sql.Login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginUserTest {

    WebDriver driver;

    @BeforeMethod
    void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
    }

    @Test
    void performLogin() {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Constants.Collabtive_ADMIN_USER_NAME);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Constants.Collabtive_ADMIN_PASSWORD);
        driver.findElement(By.xpath("//*[@id=\"loginform\"]/fieldset/div[4]/button")).click();
        Assert.assertEquals(driver.getTitle(), ("Desktop @ Collabtive"));
    }

    @AfterMethod
    public void end(){
        driver.quit();
    }
}
