package test.CogntiveScale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Pageobjects extends TestEngine{

	public static WebElement username = driver.findElement(By.id("email"));
	public static WebElement password = driver.findElement(By.id("pass"));
	public static WebElement login = driver.findElement(By.id("loginbutton"));
	
	public static WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	public static WebElement nextBtn = driver.findElement(By.xpath("//div[@id='identifierNext']"));
	public static WebElement passwordmail = driver.findElement(By.xpath("//input[@name='password']"));
	public static WebElement passwordNext = driver.findElement(By.xpath("//div[@id='passwordNext']"));
	public static WebElement account = driver.findElement(By.xpath("//a[@role='button']"));
	public static WebElement signout = driver.findElement(By.xpath("//a[contains(text(),'Sign out')]"));
	
	public static WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create account')]"));
	public static WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
	public static WebElement lastName = driver.findElement(By.xpath("//input[@id='firstName']//following::input[1]"));
	public static WebElement emailAddress = driver.findElement(By.xpath("//input[@id='username']"));
	public static WebElement passwordCreate = driver.findElement(By.xpath("//input[@id='username']//following::input[1]"));
	public static WebElement confirmPasswordCreate = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	public static WebElement nextCreate = driver.findElement(By.xpath("//span[text()='Next']"));
	
	public static WebElement forgotpassword = driver.findElement(By.xpath("//span[text()='Forgot email?']"));
	public static WebElement emailforgot = driver.findElement(By.xpath("//input[@name='identifier']"));
	public static WebElement sendbutton = driver.findElement(By.xpath("//span[text()='Send']"));
	
	public static WebElement book = driver.findElement(By.xpath("//a[text()='Book']"));
	
	public static WebElement departure = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
	public static WebElement arrival = driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT"));
	public static WebElement search = driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights"));
	
	public static WebElement currencyConverter = driver.findElement(By.xpath("//a[text()='Currency Converter']"));
	public static WebElement addon = driver.findElement(By.xpath("//a[text()='Add-ons']"));
	public static WebElement SpiceCash = driver.findElement(By.xpath("//a[text()='SpiceCash Top-up']"));
	public static WebElement mobilenumber = driver.findElement(By.id("SMoneyTopup_MobileNumber"));
	public static WebElement confirmmobilenumber = driver.findElement(By.cssSelector("#SMoneyTopup_MobileNumberConfirm"));
	public static WebElement Amount = driver.findElement(By.name("SMoneyTopup$TopupAmount"));
	public static WebElement PAN = driver.findElement(By.id("SMoneyTopup_TEXTBOXPANCARD"));
	public static WebElement continuebtn = driver.findElement(By.id("SMoneyTopup_LinkButtonSubmit"));
	
	
	

}
