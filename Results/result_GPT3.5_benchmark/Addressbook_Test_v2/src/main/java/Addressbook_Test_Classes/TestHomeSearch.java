package Addressbook_Test_Classes;

import Addressbook_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Addressbook_Test_Classes.sql.Constants;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestHomeSearch {
	WebDriver driver;
	Random random = new Random();

	@BeforeMethod
	public void before() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
	}

	@Test(priority = 0)
	public void testhomeSearch() {
		driver.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("Zeeshan");

	}

	@AfterMethod
	public void end () {
		driver.quit();
	}

}
