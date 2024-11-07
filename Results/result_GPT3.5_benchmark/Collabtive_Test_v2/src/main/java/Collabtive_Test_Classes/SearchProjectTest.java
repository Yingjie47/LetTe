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
import Collabtive_Test_Classes.sql.Login;
//import testcases.collabtive.model_based_dataset.po.Project;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class SearchProjectTest {

    WebDriver driver;

    @BeforeMethod
    void setUp() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        Login.login(driver,Constants.Collabtive_ADMIN_USER_NAME,Constants.Collabtive_ADMIN_PASSWORD);
        //TODO: Project.addProject("oneproject");

    }

    @Test(priority = 37)
    public void SearchProjectTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"query\"]")).sendKeys("oneproject");
        driver.findElement(By.xpath("//*[@id=\"search\"]/fieldset/button")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector("tr:nth-child(2) > td")).getText(), ("oneproject"));

        // assert 3

    }

    @AfterMethod
    public void end(){
        driver.quit();
    }
}
