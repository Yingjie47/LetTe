package Claroline_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Claroline_Test_Classes.sql.Constants;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestManage {
	WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeMethod
	public void before() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
	}

	@Test
	public void testManage() throws Exception {
		driver.findElement(By.id("login")).clear();
		driver.findElement(By.id("login")).sendKeys(Constants.Claroline_ADMIN_USER_NAME);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Constants.Claroline_ADMIN_PASSWORD);
		driver.findElement(By.cssSelector("input[value=\"Enter\"]")).click();
		driver.findElement(By.linkText("Platform administration")).click();
		driver.findElement(By.linkText("Manage administrator email notifications")).click();
		// Warning: verifyTextPresent may require manual changes
		//try {
			Assert.assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*System mail : recipients list[\\s\\S]*$"));
		//} catch (Error e) {
		//	verificationErrors.append(e.toString());
		//}
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	}

	@AfterMethod
	public void end(){
		driver.quit();
	}
}
