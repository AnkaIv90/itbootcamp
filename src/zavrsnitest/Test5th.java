package zavrsnitest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5th { 
	
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
		Thread.sleep(2000);
		new NavigacioniMeni (driver).clickUploadIcone(); 
		
		String pageSource = driver.getPageSource();
		Assert.assertTrue(pageSource.contains("Log in"));
		Assert.assertTrue(pageSource.contains("Sign up"));
	}

}
