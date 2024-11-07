package MRBS_Test_Classes;

import MRBS_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import testcases.mrbs.model_based_dataset.sql.Area;
//import testcases.mrbs.model_based_dataset.sql.Entry;
//import testcases.mrbs.model_based_dataset.sql.MRBSConstants;
//import testcases.mrbs.model_based_dataset.sql.Room;

public class SearchEntryTest {
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
		driver.findElement(By.xpath("//div[@id='logon_submit']/input")).click();
		Thread.sleep(2000);
		//TODO: Entry.addEntry(driver,"Demo Entry");
	}

	@Test(priority = 0)
	public static void searchEntryTest() throws Exception {
		driver.findElement(By.xpath("//a[text()='Search:']")).click();
		driver.findElement(By.xpath("//a[text()='Search:']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("search_str")).clear();
		driver.findElement(By.xpath("//*[@id='search_str']")).sendKeys("Demo Entry");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		//try {
		Assert.assertEquals(driver.findElement(By.xpath("//a[text()='Demo Entry']")).getText(), "Demo Entry");
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
