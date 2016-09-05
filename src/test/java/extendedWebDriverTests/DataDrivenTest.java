package extendedWebDriverTests;

import java.util.concurrent.TimeUnit;
//import utilities.*;
import static org.testng.Assert.*;
import org.testng.annotations.*;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DataDrivenTest {
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws Exception{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws Exception {
		driver.get(Constants.URL);
		driver.findElement(By.id("xyz")).click();
		Thread.sleep(2000);
		
		ExcelIntegration.setExcelFile(Constants.File_Path + Constants.File_Name, "SheetName");
		
		driver.findElement(By.id("xyz")).sendKeys("");
		driver.findElement(By.id("xyz2")).sendKeys("");
		
		// set test results

	}

}
