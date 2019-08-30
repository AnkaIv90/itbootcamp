package zavrsnitest; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPageArchive { 
	
	static WebDriver driver; 
	public AboutPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	
	static List<WebElement> newsList () { 
		return driver.findElements(By.cssSelector
				("div. forumRow"));
	} 
	private static WebElement moreNewsButton() { 
		return driver.findElement(By.cssSelector
				("#maincontent > div > div > div.col-md-3.hidden-xs.hidden-sm > div.box > h1 > a"));
	} 
	
	//Actions 
	public List<WebElement> getNewsList () { 
		return newsList();
	} 
	public void sizeNewsList () { 
		getNewsList().size();
	} 
	public void clickNewsMoreButton () { 
		moreNewsButton().click();
	}

}
