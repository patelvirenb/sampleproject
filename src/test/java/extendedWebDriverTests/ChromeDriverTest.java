package extendedWebDriverTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/virenpatel1986/Documents/workspace/verifyproduct/chromedriver");
		
		driver = new ChromeDriver();
		driver.get(baseURL);
		
	}

}
