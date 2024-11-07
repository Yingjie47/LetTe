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

public class RemoveMultipleProjectsTest {

    WebDriver driver;

    @BeforeMethod
    void setUp() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        Login.login(driver,Constants.Collabtive_ADMIN_USER_NAME,Constants.Collabtive_ADMIN_PASSWORD);
        //TODO: Project.cleanProject();
        //TODO: Project.addProject("project001");
        //TODO: Project.addProject("project002");
    }

    @Test(priority = 40)
    public void RemoveMultipleProjectsTest() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"contentwrapper\"]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"desktopprojects\"]/tbody[2]/tr[1]/td[5]/a[2]")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"desktopprojects\"]/tbody/tr[1]/td[5]/a[2]")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"desktopprojects\"]")).findElements(By.tagName("tbody")).size(), 0);

    }

    @AfterMethod
    public void end(){
        driver.quit();
    }
}
