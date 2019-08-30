package zavrsnitest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_LogInPage { 
	
	static WebDriver driver; 
	public DeoII_LogInPage(WebDriver driver) { 
		this.driver = driver;
	} 
	
	private static WebElement signUpFree () { 
		return driver.findElement(By.partialLinkText("signup"));
	} 
	private static WebElement emailBox () { 
		return driver.findElement(By.name("username"));
	} 
	private static WebElement passBox () { 
		return driver.findElement(By.name("password"));
	} 
	private static WebElement eyeButton () { 
		return driver.findElement(By.cssSelector("img.password_icon"));
	} 
	private static WebElement forgotPass () { 
		return driver.findElement(By.partialLinkText("forgot-password"));
	} 
	private static WebElement rememberButton () { 
		return driver.findElement(By.name("remember"));
	} 
	private static WebElement logInbutton () { 
		return driver.findElement(By.name("submit-to-login"));
	} 
	private static WebElement termsOfService () { 
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div[2]/section[2]/form/fieldset[2]/div/a"));
	} 
	
	//Actions 
	public void sendKeysEmailBox (String text) { 
		emailBox().sendKeys(text, Keys.TAB);
	} 
	public void sendKeysPassBox (String text) { 
		passBox().click();
	} 
	public void clickLogInButton () { 
		logInbutton().click();
	} 
	public void clickSignUpForFree () { 
		signUpFree().click();
	} 
	public void clickTermsOfService () { 
		termsOfService().click();
	} 
}
