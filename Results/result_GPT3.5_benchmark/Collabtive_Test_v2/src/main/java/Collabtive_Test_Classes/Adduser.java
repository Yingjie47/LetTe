package Collabtive_Test_Classes;

//import config.DriverConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Collabtive_Test_Classes.sql.Constants;
import Collabtive_Test_Classes.sql.Login;
//import testcases.collabtive.model_based_dataset.po.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class Adduser {
    WebDriver driver;

    @BeforeMethod
    void setUp() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        //TODO: User.deleteUser("Ali");
    }


    @Test
    void Adduser() throws InterruptedException {
        Login.login(driver,Constants.Collabtive_ADMIN_USER_NAME,Constants
                .Collabtive_ADMIN_PASSWORD);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainmenue\"]/li[3]/a")));
        actions.perform();
        driver.findElement(By.xpath("//*[@id=\"mainmenue\"]/li[3]/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"contentwrapper\"]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"add_butn_member\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Ali");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Ali@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Ali");
        driver.findElement(By.xpath("//*[@name=\"rate\"]")).sendKeys("ten");

//        driver.findElement(By.xpath("//*[@id=\"form_member\"]/div/form/fieldset/div[6]/div/div[1]/input")).click();
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"roleselect\"]")));
        Thread.sleep(1000); //后加的
        dropdown.selectByVisibleText("Admin");
        driver.findElement(By.xpath("//button[contains(text(),'Add')]")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".info_in_green")).getText(), ("User was added"));
    }
    @AfterMethod
	public void end(){
		driver.quit();
	}

}
