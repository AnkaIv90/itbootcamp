package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigacioniMeni { 
	
	static WebDriver driver; 
	public NavigacioniMeni (WebDriver driver) { 
		this.driver = driver;
	} 
	//Elements 6 ikonica
	private static WebElement iconeWeb () { 
		return driver.findElement(By.className("iconochive-web")); //preko xpatha
	} 
	private static WebElement iconeTexts () { 
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[2]/a/span[1]"));
	} 
	private static WebElement iconeVideo () { 
		return driver.findElement(By.className("iconochive-movies"));
	} 
	private static WebElement iconeAudio () { 
		return driver.findElement(By.className("iconochive-audio")); 
	} 
	private static WebElement iconeSoftware () { 
		return driver.findElement(By.className("iconochive-software")); 
	} 
	private static WebElement iconeImage () { 
		return driver.findElement(By.className("iconochive-image"));
	} 
	//Actions 
	public void clickWeb () { 
		iconeWeb().click();
	} 
	public void clickTexts () { 
		iconeTexts().click();
	} 
	public void clickVideo () { 
		iconeVideo().click();
	} 
	public void clickAudio () { 
		iconeAudio().click();
	} 
	public void clickSoftware () { 
		iconeSoftware().click();
	} 
	public void clickImage () { 
		iconeImage().click();
	} 
	//Elements
	private static WebElement logoIcone () { 
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[7]/a/span[1]"));
	} 
	private static WebElement signInIcone () { 
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[10]/a"));
	} 
	private static WebElement uploadIcone () { 
		return driver.findElement(By.xpath("//*[@id=\"navwrap2\"]/div[2]/ul[1]/li[9]/a"));
	} 
	private static WebElement searchIcone () { 
		return driver.findElement(By.id("search-bar-2"));
	} 
	private static WebElement usernameIcone () { 
		return driver.findElement(By.xpath("//*[@id=\"user-menu\"]/span"));
	}
	
	//Actions 
	public void clickLogoIcone () { 
		logoIcone().click();
	} 
	public void clicksignInIcone () { 
		signInIcone().click();
	} 
	public void clickUploadIcone () { 
		uploadIcone().click();
	} 
	public void clickSearchIcone () { 
		searchIcone().click();
	} 
	public void sendKeysSerachIcone (String text) { 
		searchIcone().sendKeys(text, Keys.ENTER);
	} 
	public void clickUsernameIcone () { 
		usernameIcone().click();
	}
}
