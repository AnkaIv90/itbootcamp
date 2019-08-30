package zavrsnitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPageArchive { 
	
	static WebDriver driver; 
	public ContactPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private static WebElement parkingMap () { 
		return driver.findElement(By.cssSelector
				("#maincontent > div > div > div.col-md-9 > a:nth-child(5) > img"));
	} 
	private static WebElement addressMap () { 
		return driver.findElement(By.cssSelector
				("#maincontent > div > div > div.col-md-9 > font > font > font > font > font > a:nth-child(7) > img"));
	} 
	//Actions 
	public void clickParkingMap () { 
		parkingMap().click();
	}

}
