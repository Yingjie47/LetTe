package MRBS_Test_Classes;

import MRBS_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import testcases.mrbs.model_based_dataset.sql.Area;
//import testcases.mrbs.model_based_dataset.sql.Entry;
//import testcases.mrbs.model_based_dataset.sql.MRBSConstants;
//import testcases.mrbs.model_based_dataset.sql.Room;

public class GotoTest {
	private static WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
		//TODO: Area.addArea("Area New","888");
		//TODO: Room.addRoom("Room New","10","888");

		// Login User Administrator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=' Log in ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("NewUserName")).clear();
		driver.findElement(By.name("NewUserName")).sendKeys(Constants.ADMIN_USER_NAME);
		driver.findElement(By.name("NewUserPassword")).clear();
		driver.findElement(By.name("NewUserPassword")).sendKeys(Constants.ADMIN_PASSWORD);
		driver.findElement(By.xpath("//*[@id='logon_submit']/input")).click();
		Thread.sleep(2000);
		//TODO: Entry.addEntry(driver,"Demo Entry");
	}

	@Test(priority = 0)
	public static void gotoTest() throws Exception {

		driver.findElement(By.xpath("//input[@value='goto']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Go To Today']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getPageSource().contains("Demo Entry"));
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

}
