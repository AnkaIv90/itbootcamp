package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeoII_AdvancedSearch { 
	
	static WebDriver driver; 
	public DeoII_AdvancedSearch (WebDriver driver) { 
		this.driver = driver;
	} 
	  //Advanced Search Elements
    private List <WebElement> containsField () {
        return driver.findElements(By.cssSelector
                ("#searchForm > div:nth-child(1) > div:nth-child(3) > select"));
    }
    private List <WebElement> isField () {
        return driver.findElements(By.name("collection_type"));
    }
    private List <WebElement> customField () {
        return driver.findElements(By.name("optional_field1"));
    }
    private static WebElement allMediatypesField () {
        return driver.findElement(By.name("mediatype_query"));
    }
    private List <WebElement> blankoField () {
        return driver.findElements(By.name("any_field"));
    }
    private List <WebElement> yearField () {
        return driver.findElements(By.name("date_year"));
    }
    private List <WebElement> monthField () {
        return driver.findElements(By.name("date_month"));
    }
    private List <WebElement> dayField () {
        return driver.findElements(By.name("date_day"));
    }
    private static WebElement searchButton () {
        return driver.findElement(By.cssSelector("#searchForm > center > input.btn.btn-primary"));
    }
    
    //Advanced Search Elements returning JSON, XML, and more
    private static WebElement queryField () {
        return driver.findElement(By.name("q"));
    }
    private List <WebElement> fieldsToReturn () {
        return driver.findElements(By.name("fl[]"));
    }
    private List <WebElement> sortResultsFields () {
        return driver.findElements(By.name("sort[]"));
    }
    private static WebElement numberOfResults () {
        return driver.findElement(By.id("numresults"));
    }
    private static WebElement pageResultsField () {
        return driver.findElement(By.name("page"));
    }
    private List <WebElement> formatCircleButton () {
        return driver.findElements(By.name("output")); //???
    }
    private static WebElement xmlFormatButton () {
        return driver.findElement(By.name("q"));
    }
    private static WebElement csvFormatHiddenLink () {
        return driver.findElement(By.xpath("//*[@id=\"rawform\"]/div[2]/table/tbody/tr[4]/td[1]/a"));
    }
    private static WebElement searchButtonReturning () {
        return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > input.btn.btn-primary"));
    }

}
