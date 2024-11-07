package Addressbook_Test_Classes;

import Addressbook_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Addressbook_Test_Classes.sql.Constants;
//import testcases.addressbook.model_based_dataset.po.Address;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestDeleteItem {
    WebDriver driver;
    Random random = new Random();
    int rand_number = random.nextInt(1520000);
    static int expected_row_count = 0;
    private static String downloadPath = "C:\\Users\\A653\\Downloads";

    @BeforeMethod
    public void before() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        expected_row_count = driver
                .findElements(By.cssSelector("table#maintable.sortcompletecallback-applyZebra>tbody>tr")).size();
        System.out.println(expected_row_count);
        //TODO: Address.addAddress("Suleman","test");

    }

    @Test(priority = 0)
    public void testdeleteItem() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[1]/a")).click();
        Thread.sleep(100);
        driver.findElement(By.cssSelector("[title*='Suleman']")).click(); // select certain value from table and
        // click
        driver.findElement(By.xpath("//table[@id='maintable']/tbody/tr[5]/td[7]/a/img")).click();
        driver.findElement(By.xpath("//input[@value='Delete']")).click();
        Thread.sleep(1000);
        String message = driver.findElement(By.className("msgbox")).getText();
        System.out.println(message);
        Assert.assertEquals("Record successful deleted", message);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[1]/a")).click();
        int afterDelete_row_count = driver
                .findElements(By.cssSelector("table#maintable.sortcompletecallback-applyZebra>tbody>tr")).size(); // Check
        System.out.println("now after delete=" + afterDelete_row_count);
        System.out.println("now after delete=" + expected_row_count);
        Assert.assertTrue(afterDelete_row_count <= expected_row_count);
    }

    @AfterMethod
    public void end () {
        driver.quit();
    }

}
