package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import testcases.Claroline_Test_Suite.model_based_dataset.po.User;
//import testcases.Claroline_Test_Suite.model_based_dataset.sql.SQL_Process;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class TestAddCourse {
    WebDriver driver;
    static int in = 1;
    private StringBuffer verificationErrors = new StringBuffer();
    private boolean acceptNextAlert = true;

    @BeforeMethod
    public void before() throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\anaconda3\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get(Constants.BASE_URL);
        // TODO: SQL_Process SQLProcess = new SQL_Process();
        // TODO: if (!SQLProcess.containCategory("Mathematics","MA112")){
        // TODO: 	SQLProcess.addCategory("Mathematics","MA112");
        // TODO: }
        // TODO: if (SQLProcess.containCourse("CS212")){
        // TODO: 	SQLProcess.deleteCourse("CS212");
        // TODO: }
        // TODO: SQLProcess.close();
        // TODO: User.addUser("user","user","user","user");
    }

    @Test
    public void testAddCourse() throws Exception {
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
        driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
        driver.findElement(By.linkText("Create a course site")).click();
        driver.findElement(By.id("course_title")).clear();
        driver.findElement(By.id("course_title")).sendKeys("Computer Science");
        driver.findElement(By.id("course_officialCode")).clear();
        driver.findElement(By.id("course_officialCode")).sendKeys("CS212");
        Select category = new Select(driver.findElement(By.id("mslist2")));
        category.selectByVisibleText("Mathematics");
        driver.findElement(By.xpath("//*[@id=\"mandatories\"]/div/dl/dd[3]/table/tbody/tr/td[2]/a[2]/img")).click();
        driver.findElement(By.id("course_titular")).clear();
        driver.findElement(By.id("course_titular")).sendKeys("Javaria Imtiaz");
        driver.findElement(By.xpath("//*[@id=\"mandatories\"]/div/dl/dd[7]/label[1]")).click();
        driver.findElement(By.linkText("Advanced options")).click();
//        driver.findElement(By.id("course_status_date")).click();
        driver.findElement(By.name("changeProperties")).click();
        String message = driver.findElement(By.xpath("//div[contains(text(),'You have just created the course website')]")).getText();
        Assert.assertTrue(message.contains("You have just created the course website : CS212"));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        driver.quit();
        driver = new ChromeDriver();
        driver.get(Constants.BASE_URL);
        driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("user");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("user");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"siteName\"]/a")).click();
        driver.findElement(By.linkText("Enrol on a new course")).click();
        driver.findElement(By.linkText("Mathematics")).click();
//        driver.findElement(By.xpath("//*[@id=\"siteName\"]/a")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Computer Science')]")).click();
        driver.findElement(By.xpath("//div[@id='toolViewOption']/a/b")).click();
        driver.findElement(By.xpath("//div[@id='courseRightContent']/div[2]/div")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='courseRightContent']/div[2]/div")).getText(), "You've been enrolled on the course");
    }
    @AfterMethod
	public void end(){
		driver.quit();
	}
}
