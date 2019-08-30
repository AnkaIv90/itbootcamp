package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPageArchive { 
	
	static WebDriver driver; 
	public BlogPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	//Blog Meni
	private static WebElement blogMeni () { 
		return driver.findElement(By.id("menu-item-7707"));
	} 
	private static WebElement annoucementsMeni () { 
		return driver.findElement(By.id("menu-item-3417"));
	} 
	private static WebElement netArchiveStoryMeni () { 
		return driver.findElement(By.id("menu-item-7359"));
	} 
	private static WebElement archiveLinkMeni () { 
		return driver.findElement(By.id("menu-item-3422"));
	} 
	private static WebElement aboutBlogMeni () { 
		return driver.findElement(By.id("menu-item-3421"));
	} 
	private static WebElement eventsMeni () { 
		return driver.findElement(By.id("menu-item-15173"));
	} 
	private static WebElement developersMeni () { 
		return driver.findElement(By.id("menu-item-8100"));
	} 
	private static WebElement donateMeni () { 
		return driver.findElement(By.id("menu-item-15172"));
	} 
	//slike Face i Twiter 
	private static WebElement facePicture () { 
		return driver.findElement(By.xpath("//*[@id=\"archive_sharing_widget-4\"]/div/a[1]/img"));
	} 
	private static WebElement twitterPicture () { 
		return driver.findElement(By.xpath("//*[@id=\"archive_sharing_widget-4\"]/div/a[2]/img"));
	} 
	//Archives dropdown 
	private static WebElement archiveDropdown () { 
		return driver.findElement(By.name("archive-dropdown"));
	} 
	//Search 
	private static WebElement searchField () { 
		return driver.findElement(By.cssSelector("#s"));
	} 
	private static WebElement searchButton () { 
		return driver.findElement(By.id("searchsubmit"));
	} 
	private List <WebElement> blogSearchResults () { 
		return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
	} 
	//Actions 
	public void clickFacePicture() {
        facePicture().click();
    }
    public void clickTwitterPicture() {
        twitterPicture().click();
    } 
    public void sendKeysSearchField (String text) { 
    	searchField().sendKeys(text);
    } 
    public void clickSearchButton () { 
    	searchButton().click();
    } 
    public void clickArchiveDropdown(String text) {
        Select drp = new Select(archiveDropdown());
        drp.selectByVisibleText(text);
    }

}
