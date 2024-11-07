package MRBS_Test_Classes;

import MRBS_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.testng.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import testcases.mrbs.model_based_dataset.sql.Area;
//import testcases.mrbs.model_based_dataset.sql.MRBSConstants;
//import testcases.mrbs.model_based_dataset.sql.Room;

public class AddMultipleRoomTest {
	private static WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);

		// Login User Administrator
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=' Log in ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("NewUserName")).clear();
		driver.findElement(By.name("NewUserName")).sendKeys(Constants.ADMIN_USER_NAME);
		driver.findElement(By.name("NewUserPassword")).clear();
		driver.findElement(By.name("NewUserPassword")).sendKeys(Constants.ADMIN_PASSWORD);
		driver.findElement(By.xpath("//*[@id=\"logon_submit\"]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Rooms']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 0)
	public static void addMultipleRoomTest() throws Exception {

		// Add Room One
		driver.findElement(By.xpath("//a[text()='Rooms']")).click();
		driver.findElement(By.id("room_name")).clear();
		driver.findElement(By.id("room_name")).sendKeys("New Room");
		driver.findElement(By.id("room_description")).clear();
		driver.findElement(By.id("room_description")).sendKeys("Nice Room1");
		driver.findElement(By.id("room_capacity")).clear();
		driver.findElement(By.id("room_capacity")).sendKeys("10");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Add Room']")).click();
		Thread.sleep(2000);

// Add Room Two
		driver.findElement(By.xpath("//a[text()='Rooms']")).click();
		driver.findElement(By.id("room_name")).clear();
		driver.findElement(By.id("room_name")).sendKeys("New Room");
		driver.findElement(By.id("room_description")).clear();
		driver.findElement(By.id("room_description")).sendKeys("Nice Room2");
		driver.findElement(By.id("room_capacity")).clear();
		driver.findElement(By.id("room_capacity")).sendKeys("10");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Add Room']")).click();
		//try {
		Assert.assertEquals(driver.findElement(By.xpath("//td[div/a[text()='New Room']]")).getText(),
				"New Room");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}

	public static void jsClick(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}

}
