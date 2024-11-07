package MantisBT_Test_Classes;

//import config.DriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.*;
import MantisBT_Test_Classes.sql.Constants;
//import testcases.mantisbt.model_based_dataset.po.Project;

import java.util.concurrent.TimeUnit;

public class AddCategoryWrongTest {
	private static WebDriver driver;

	@BeforeMethod

	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\anaconda3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.BASE_URL);
		// Login User Administrator
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(Constants.Mantisbt_ADMIN_USER_NAME);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Constants.Mantisbt_ADMIN_PASSWORD);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		// TODO: Project.addProject("Project001 New");
	}

	@Test(priority = 0)
	public static void addCategoryWrongTest() throws Exception {
		driver.findElement(By.xpath("//a[contains(text(),'Manage')]")).click(); // Updated xpath to navigate to the manage page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Manage Projects')]")).click(); // Updated xpath to navigate to the manage projects page
		driver.findElement(By.xpath("//a[contains(text(),'Project001 New')]")).click(); // Updated xpath to click on the specific project
		Thread.sleep(1000);

		Thread.sleep(1000);
		driver.findElement(By.name("category")).sendKeys("Category1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Add Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("category")).sendKeys("Category1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Add Category']")).click();
		Thread.sleep(3000);
		AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@style='color:red']")).getText(),
				"A category with that name already exists.");
	}

	@AfterMethod
	public void close() {
		driver.quit();
	}
	// TODO: Project.deleteProject("Project001 New");
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
