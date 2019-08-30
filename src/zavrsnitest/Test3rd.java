package zavrsnitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3rd { 
	
	WebDriver driver; 
	@BeforeTest
	public void systemset () { 
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\Dell\\Desktop\\selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe"); 
		driver = new FirefoxDriver ();
	} 
	@Test 
	public void ArchiveTest1 () throws Exception { 
	
    driver.navigate().to(PageURLsArchive.PAGE_ARCHIVE);
    new NavigacioniMeni(driver).clickTexts();
    new NavigacioniMeniSkriveneIkonice(driver).clickFeaturedTexts(1);;
    
    Thread.sleep(2000);
    
    String url = driver.getCurrentUrl();
	
    Thread.sleep(2000);
	
    new NavigacioniMeni(driver).clickLogoIcone();
	new MainPageArchive(driver).clickNineLinksList(2);;
	
	Thread.sleep(2000);
	
	Assert.assertTrue(driver.getCurrentUrl().equals(url));
	
	}
}
