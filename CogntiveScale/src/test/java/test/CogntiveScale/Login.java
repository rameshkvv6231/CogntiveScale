package test.CogntiveScale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends TestEngine {

	@BeforeTest
	public void beforeTest() {
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void beforeClass() {
		Pageobjects.username.sendKeys("rameshkvv6231@gmail.com");
		Pageobjects.password.sendKeys("tatayya6231");
		Pageobjects.login.click();
	}
	
	

}