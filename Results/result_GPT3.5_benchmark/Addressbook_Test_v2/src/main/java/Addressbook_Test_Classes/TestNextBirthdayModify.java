package Addressbook_Test_Classes;

import Addressbook_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import Addressbook_Test_Classes.sql.Constants;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestNextBirthdayModify {
	WebDriver driver;
	Random random = new Random();
	int rand_number = random.nextInt(1520000);
	static int expected_row_count = 0;
	private static String downloadPath = "C:\\Users\\A653\\Downloads";

	@BeforeMethod
	public void before() throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
	}

	@Test(priority = 0)
	public void testnextBirthdayModify() {
		driver.findElement(By.xpath("//*[@id=\"nav\"]/ul/li[4]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"birthdays\"]/tbody/tr[2]/td[7]/a/img")).click();

		driver.findElement(By.xpath("(//INPUT[@type='text'])[1]")).sendKeys("Muhammad Modify");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[2]")).sendKeys("Suleman");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[3]")).sendKeys("Quest Lab");

		driver.findElement(By.xpath("//TEXTAREA[@name='address']")).sendKeys("Rothas Road G9/4 lamabad");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[4]")).sendKeys("03165282707");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[5]")).sendKeys("03341006096");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[6]")).sendKeys("-----");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[7]")).sendKeys("----");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[8]")).sendKeys("");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[9]")).sendKeys("");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[8]")).sendKeys("");

		new Select(driver.findElement(By.xpath("//SELECT[@name='bday']"))).selectByValue("13");

		new Select(driver.findElement(By.xpath("//SELECT[@name='bmonth']"))).selectByValue("December");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[8]")).sendKeys("1996");

		driver.findElement(By.xpath("//TEXTAREA[@name='address2']")).sendKeys("Rothas Road G9/4 lamabad");

		driver.findElement(By.xpath("(//INPUT[@type='text'])[9]")).sendKeys("");

		driver.findElement(By.xpath("//TEXTAREA[@name='address2']")).sendKeys("");

		driver.findElement(By.xpath("(//INPUT[@type='submit'])[1]")).click();
		Assert.assertEquals("Address book UPDATED\n" +
						"return to home page",
				driver.findElement(By.xpath("//*[@id=\"content\"]/div")).getText());

	}

	@AfterMethod
	public void end () {
		driver.quit();
	}

}
