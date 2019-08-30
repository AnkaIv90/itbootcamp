package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPageArchive { 
	
	static WebDriver driver; 
	public JobsPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private static WebElement searchBar () { 
		return driver.findElement(By.id("q"));
	} 
	private static WebElement searchButton () { 
		return driver.findElement(By.cssSelector("#btn_search_jobs > span"));
	} 
	private static WebElement searchAdvanced () { 
		return driver.findElement(By.id("link_show_advanced_search"));
	} 
	private List <WebElement> generatedJobsTables () { 
		return driver.findElements(By.cssSelector("table.menu_table #jobs_table"));
	} 
	//Actions 
	public List <WebElement> getJobsTables () { 
		return generatedJobsTables();
	} 
	public void clickJobsTables (Integer index) { 
		getJobsTables().get(index).click();
	} 
	public void sendKeysSearchBar (String text) { 
		searchBar().sendKeys(text);
	} 
	public void clickSearchButton () { 
		searchButton().click();
	}
}
