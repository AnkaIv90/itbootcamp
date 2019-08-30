package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_AboutFromCollection { 
	
	static WebDriver driver; 
	public DeoII_AboutFromCollection (WebDriver driver) { 
		this.driver = driver;
	}
	private List <WebElement> contributorsList () {
	    return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > div:nth-child(2)"));
	}
	private List <WebElement> graphsList () {
	    return driver.findElements(By.cssSelector("div.grafs about-box"));
	}
	private List <WebElement> relatedCollectionsList () {
	    return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > div:nth-child(7)"));
	}
	private static WebElement tableTopRegions () {
	    return driver.findElement(By.cssSelector("#tabby-about > div > div.col-sm-5 > section > table"));
	}
}
