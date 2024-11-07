package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import testcases.Claroline_Test_Suite.model_based_dataset.po.Category;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class TestCourseCategoryEdit {
    WebDriver driver;
    static int in = 1;
    private StringBuffer verificationErrors = new StringBuffer();
    private boolean acceptNextAlert = true;

    @BeforeMethod
    public void before() throws IOException, SQLException, ClassNotFoundException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        // TODO: Category.clean();
        // TODO: Category.addCategory("Test","test");
        // TODO: Category.addCategory("Test2","test2");
    }

    @Test
    public void testCourseCategoryEdit() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
        driver.findElement(By.linkText("Platform administration")).click();
        driver.findElement(By.linkText("Manage course categories")).click();
        driver.findElement(By.cssSelector("img[alt=\"Edit category\"]")).click();
        driver.findElement(By.id("category_code")).clear();
        driver.findElement(By.id("category_code")).sendKeys("Sci");
        driver.findElement(By.xpath("//*[@id=\"categorySettings\"]/input[3]")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
        Assert.assertEquals(driver.findElement(By.xpath("//div[contains(text(), 'Category modified')]")).getText(), "Category modified");
//        Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
//                .matches("^[\\s\\S]*Economics \\(ECO\\)[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
        driver.findElement(By.cssSelector("img[alt=\"Move down category\"]")).click();
        // Warning: verifyTextPresent may require manual changes
        //try {
        Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
                .matches("^[\\s\\S]*Category moved down[\\s\\S]*$"));
//        } catch (Error e) {
//            verificationErrors.append(e.toString());
//        }
    }

    @AfterMethod
    public void end() {
        driver.quit();
    }
}
