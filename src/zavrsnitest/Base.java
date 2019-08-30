package zavrsnitest;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base { 
	
	public WebDriver getWebDriver() {
	      WebDriver driver = new FirefoxDriver();
	      System.setProperty("webdriver.gecko.driver",
	              "C:\\Users\\m\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	      return driver;
	  }
	
	public WebDriverWait waiter() {
	       WebDriverWait wait = new WebDriverWait(getWebDriver(), 30, 500);
	       return wait;
	   } 
	   public void elementToAppear(By locator) {
	       waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	   }
	   public void elementToAppear(WebElement element) {
	       waiter().until(ExpectedConditions.visibilityOf(element));
	   }
	   public void elementToAppear(By locator, By locator2) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOfElementLocated(locator),
	               ExpectedConditions.visibilityOfElementLocated(locator2)));
	   }
	   public void elementToAppear(WebElement element, WebElement element2) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOf(element),
	               ExpectedConditions.visibilityOf(element2)));
	   }
	   public void elementToAppear(By locator, By locator2, By locator3) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOfElementLocated(locator),
	               ExpectedConditions.visibilityOfElementLocated(locator2),
	               ExpectedConditions.visibilityOfElementLocated(locator3)));
	   }
	   public void elementToBeClickable(By locator) {
	       waiter().until(ExpectedConditions.elementToBeClickable(locator));
	   } 
	   public void elementToBeClickable (WebElement element) { 
		   waiter().until(ExpectedConditions.elementToBeClickable(element));
	   }
	   public void urlToContain(String url) {
	       waiter().until(ExpectedConditions.urlContains(url));
	   } 
	   public void elementToBeSelected (By locator) { 
		   waiter().until(ExpectedConditions.elementToBeSelected(locator));
	   } 
	   public void textMatches (By locator, Pattern pattern) { 
		   waiter().until(ExpectedConditions.textMatches(locator, pattern));
	   } 
	   public void titleContains (String title) { 
		   waiter().until(ExpectedConditions.titleContains(title));
	   } 
	   public void visibilityOf (WebElement element) { 
		   waiter().until(ExpectedConditions.visibilityOf(element));
	   } 
	   public void visibilityOfElementLocated (By locator) { 
		   waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	   }
	
}
