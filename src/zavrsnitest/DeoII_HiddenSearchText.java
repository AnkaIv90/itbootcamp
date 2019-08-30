package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_HiddenSearchText { 
	
	static WebDriver driver; 
	public DeoII_HiddenSearchText (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private List <WebElement> objectText () { 
		return driver.findElements(By.cssSelector
				("#react-wayback-search > div.search-result-container.container"));
	}
}
