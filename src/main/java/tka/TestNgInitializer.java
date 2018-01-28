package tka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNgInitializer {

	protected WebDriver driver = null;

	@BeforeSuite
	public void beforeSuite() {
//		System.setProperty("webdriver.chrome.driver", "/Users/Olena/Documents/Projekte/JAVA/chromedriver");
//		System.setProperty("webdriver.gecko.driver", "/Users/Olena/Documents/Projekte/JAVA/geckodriver");
	}

	@AfterSuite
	public void afterSuite() {
	}

	@BeforeMethod
	public void beforeMethod() {
		
		String br = System.getProperty("browser");
		String crDr = System.getProperty("webdriver.chrome.driver");
		String ffDr = System.getProperty("webdriver.gecko.driver");

		System.out.println("SYSTEM-PROP BROWSER=" + br);
		System.out.println("SYSTEM-PROP CH_DR=" + crDr);
		System.out.println("SYSTEM-PROP FF_DR=" + ffDr);

		
		switch (br) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
			throw new RuntimeException("Browser not set");
		}
	}

	@AfterMethod
	public void afterMethod() {
		if (driver != null) {
			driver.quit();
		}
	}
}
