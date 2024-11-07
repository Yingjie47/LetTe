package Addressbook_Test_Classes;

import Addressbook_Test_Classes.sql.Constants;
//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Addressbook_Test_Classes.sql.Constants;
//import testcases.addressbook.model_based_dataset.po.Group;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestDeleteGroup {
	WebDriver driver;
	Random random = new Random();
	int rand_number = random.nextInt(1520000);
	static int expected_row_count = 0;

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
		//TODO: Group.addGroup("test");

	}

	@Test(priority = 0)
	public void testdeleteGroup() {

		driver.findElement(By.xpath("//A[@href='group.php'][text()='groups']/..")).click();

		try {
			driver.findElement(By.xpath("(//INPUT[@type='checkbox'])[2]")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("(//INPUT[@type='checkbox'])[1]")).click();
		}

		driver.findElement(By.xpath("(//INPUT[@type='submit'])[2]")).click();
		System.out.println("end");
		Assert.assertEquals("Group has been removed.\n" +
				"return to the group page",driver.findElement(By.xpath("//*[@id=\"content\"]/div")).getText());
	}

	@AfterMethod
	public void end () {
		driver.quit();
	}

}
