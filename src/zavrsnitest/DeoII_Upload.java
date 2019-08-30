package zavrsnitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_Upload { 
	
	static WebDriver driver; 
	public DeoII_Upload(WebDriver driver) { 
		this.driver = driver;
	} 
	
	private static WebElement uploadFilesButton () { 
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(4) > a"));
	} 
	private static WebElement clickableQuestionmark () { 
		return driver.findElement(By.cssSelector("#createhelp > h3 > small > a > span.iconochive-question-dark"));
	} 
	private static WebElement liveMusicUploadButton () { 
		return driver.findElement(By.cssSelector("#createhelp > center:nth-child(7) > a"));
	} 

}
