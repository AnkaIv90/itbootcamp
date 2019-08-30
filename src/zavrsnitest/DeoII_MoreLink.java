package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_MoreLink { 
	
	static WebDriver driver; 
	public DeoII_MoreLink (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private List <WebElement> newsSubject () { 
		return driver.findElements(By.className("forumTable  table table-striped table-condensed table-hover"));
	} 
	private static WebElement mailIcone () { 
		return driver.findElement(By.cssSelector("span.iconochive-email"));
	}

}
