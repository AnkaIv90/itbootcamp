package zavrsnitest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1st {
	
	WebDriver driver; 
	@BeforeTest
	public void systemset () { 
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Dell\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		driver = new FirefoxDriver ();
	} 
	@Test 
	public void ArchiveTest () throws Exception { 
		
		driver.navigate().to(PageURLsArchive.PAGE_ARCHIVE);
		Assert.assertTrue(new MainPageArchive(driver).getTopCollections().size() >= 20);
	    
		List<WebElement> text = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
		for (WebElement i : text) {
		System.out.println(i.getText());
		
		Assert.assertTrue(i.getText().toLowerCase().contains("items"));
	}
	}	
}


