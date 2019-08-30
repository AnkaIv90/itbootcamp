package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;

public class DeoII_CollectionFromMain { 
	
	static WebDriver driver; 
	public DeoII_CollectionFromMain (WebDriver driver) { 
		this.driver = driver;
	} 
	
    private List <WebElement> sortByOptions () {
        return driver.findElements(By.xpath("//*[@id=\"tabby-collection\"]/div/div[2]/div[1]/div[1]/div[4]/div/span"));
    }
    private List <WebElement> videoResults () {
        return driver.findElements(By.cssSelector("#ikind--date > div"));
    }
    private List <WebElement> leftBarList () {
        return driver.findElements(By.cssSelector("#tabby-collection > div > div.columns-facets > div"));
    }
    private static WebElement searchThisCollectionBarButton () {
        return driver.findElement(By.name("and[]"));
    }
    private List <WebElement> playOptions () {
        return driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[2]"));
    }
}
