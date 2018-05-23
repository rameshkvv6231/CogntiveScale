package test.CogntiveScale;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UI extends TestEngine{

	
	@BeforeTest
	public void beforeTest(){
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// 
	@Test
	public void test(){
		String color = Pageobjects.book.getCssValue("color");
		System.out.println("color of book text "+ color);
		
		String backGroundColor = Pageobjects.book.getCssValue("background");
		System.out.println("backGroundColor of book"+ backGroundColor);
		
		String fontWeight = Pageobjects.book.getCssValue("font-weight");
		System.out.println("fontWeight of book text "+ fontWeight);
		
		String fontSize = Pageobjects.book.getCssValue("font-size");
		System.out.println("fontSize of book text "+ fontSize);
	}
}
