package test.CogntiveScale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CompletePath extends TestEngine{
	Select s ;
	@BeforeTest
	public void beforeTest(){
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// 
	@Test
	public void test(){
		s= new Select(Pageobjects.departure);
		s.selectByIndex(1);
		s= new Select(Pageobjects.arrival);
		s.selectByVisibleText("Bangkok (BKK)");
		Pageobjects.search.click();
		
		wait.until(ExpectedConditions.visibilityOf(Pageobjects.currencyConverter));
		if(Pageobjects.currencyConverter.isDisplayed()){
			System.out.println("displayed");
		}
		else{
			System.out.println("not displayed");
		}
	}
	@Test
	public void test1(){
		Actions a = new Actions(driver);
		a.moveToElement(Pageobjects.addon).build().perform();
		Pageobjects.SpiceCash.click();
		Pageobjects.mobilenumber.sendKeys("1234567890");
		Pageobjects.confirmmobilenumber.sendKeys("1234567890");
		Pageobjects.Amount.sendKeys("12334");
		Pageobjects.PAN.sendKeys("css1234l");
		Pageobjects.continuebtn.click();
	}

}
