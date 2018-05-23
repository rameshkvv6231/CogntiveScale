package test.CogntiveScale;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class TestEngine {
	public static WebDriver driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 30);

	@Parameters({ "browser" })
	@BeforeSuite
	public void beforeSuite(String browser) throws MalformedURLException {
		if (browser.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			  System.setProperty("webdriver.gecho.driver", System.getProperty("user.dir")+"\\drivers\\gechodriver.exe");

			driver = new FirefoxDriver();
		} else {
			  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
