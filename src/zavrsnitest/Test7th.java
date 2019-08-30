package zavrsnitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test7th { 
	
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
		new NavigacioniMeni (driver).clicksignInIcone(); 
		new DeoII_LogInPage (driver).clickSignUpForFree();
		new DeoII_LogInPage (driver).clickTermsOfService(); 
		//proveriti
		
	}

}
