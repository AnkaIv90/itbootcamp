package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageArchive { 
	
	static WebDriver driver; 
	public MainPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	//Search
	private static WebElement searchBox () { 
		return driver.findElement(By.cssSelector("#searchform > div > div:nth-child(1) > input"));
	} 
	private List<WebElement> searchList () { 
		return driver.findElements(By.id("search_options"));
	} 
	private static WebElement goButton () { 
		return driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
	} 
	private static WebElement searchAdvanced () { 
		return driver.findElement(By.partialLinkText("advancedsearch"));
	} 
	//9 linkova
	private List<WebElement> nineLinkslist () { 
		return driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[2]/div[1]/center"));
	} 
	//see more
	private static WebElement seemoreLink () { 
		return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div[2]/div[3]/div[3]"));
	} 
	//TOP COLLECTIONS
	private List<WebElement> topCollections () { 
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	} 
	//Actions
	public List<WebElement> getTopCollections () { 
		return topCollections();
	} 
	public void sizeTopCollections () { 
		getTopCollections().size();
	} 
	public void clickTopCollections (Integer index) { 
		getTopCollections().get(index).click();
	} 
	public List<WebElement> getNineLinksList () { 
		return nineLinkslist();
	} 
	public void clickNineLinksList (Integer index) { 
		getNineLinksList().get(index).click();
	} 
	public void clickSearchBox() {
        searchBox().click();
    }
    public void sendKeysSearchBox(String text) {
        searchBox().sendKeys(text);
    } 
    public void clickGoButton() {
        goButton().click();
    }
}
