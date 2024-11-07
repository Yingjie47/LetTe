package MRBS_Test_Classes;

import MRBS_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.testng.annotations.*;

import java.nio.file.Files;
import java.nio.file.Paths;
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

public class DeleteRoomTest {
	private static WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
		//TODO: Area.addArea("a","999");
		//TODO: Room.clearRoom();
		//TODO: Room.addRoom("a","10","999");

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
	public static void deleteRoomTest() throws Exception {

		driver.findElement(By.xpath("//a[text()='Rooms']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='rooms_table_wrapper']//a/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='del_yes']")).click();

		driver.findElement(By.xpath("//a[text()='Rooms']")).click();
		driver.findElement(By.xpath("//a[text()='Rooms']")).click();

		//try {
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "No rooms have been defined.");
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
