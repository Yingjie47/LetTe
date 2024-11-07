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

public class EditProjectTest {

    WebDriver driver;

    @BeforeMethod
    void setUp() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        //TODO: Project.addProject("huzaim");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        Login.login(driver,Constants.Collabtive_ADMIN_USER_NAME,Constants.Collabtive_ADMIN_PASSWORD);
    }

    @Test
    void EditProjectTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"desktopprojects\"]/tbody/tr[1]/td[2]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"edit_butn\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("changed name");
        driver.findElement(By.xpath("//button[text()='Send']")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".info_in_yellow")).getText(), ("Project was edited"));
    }


    @AfterMethod
    public void end() throws SQLException, IOException, ClassNotFoundException {
        //TODO: Project.deleteProject("changed name");
        driver.quit();
    }
}
