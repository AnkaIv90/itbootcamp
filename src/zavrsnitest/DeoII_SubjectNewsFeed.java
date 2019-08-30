package zavrsnitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_SubjectNewsFeed { 
	
	static WebDriver driver; 
	public DeoII_SubjectNewsFeed (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private static WebElement subjectInNewsfeed () { 
		return driver.findElement(By.cssSelector("#maincontent div.container container-ia"));
	}

}
