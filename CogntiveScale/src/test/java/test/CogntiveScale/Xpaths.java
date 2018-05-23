package test.CogntiveScale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import test.CogntiveScale.TestEngine;

public class Xpaths extends TestEngine{

	@BeforeTest
	public void beforeTest() {
		driver.get("http://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	// Create a account
	@Test
	public void test(){
		Pageobjects.createAccount.click();
		Pageobjects.firstName.sendKeys("ramesh");
		Pageobjects.lastName.sendKeys("kvv");
		Pageobjects.emailAddress.sendKeys("rameshddvvaa");
		Pageobjects.passwordCreate.sendKeys("rameshddvvaa");
		Pageobjects.confirmPasswordCreate.sendKeys("rameshddvvaa");
		Pageobjects.nextCreate.click();
	}
	
	// Login to the application
	@Test
	public void test1() {
		Pageobjects.email.sendKeys("rameshkvv6231@gmail.com");
		Pageobjects.nextBtn.click();
		Pageobjects.passwordmail.sendKeys("tatayya6231");
		Pageobjects.passwordNext.click();
		Pageobjects.account.click();
		wait.until(ExpectedConditions.visibilityOf(Pageobjects.signout));
		Pageobjects.signout.click();
	}
	
	// forgotpassword flow
	@Test
	public void test2(){
		Pageobjects.forgotpassword.click();
		Pageobjects.emailforgot.sendKeys("rameshkvv6231");
		Pageobjects.nextCreate.click();
		Pageobjects.firstName.sendKeys("raesh");
		Pageobjects.lastName.sendKeys("kk");
		Pageobjects.sendbutton.click();
		
	}

}
