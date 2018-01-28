package tka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNgInitializer {

	protected WebDriver driver = null;

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "/Users/Olena/Documents/Projekte/JAVA/chromedriver");
	}

	@AfterSuite
	public void afterSuite() {
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		if (driver != null) {
			driver.quit();
		}
	}
}
