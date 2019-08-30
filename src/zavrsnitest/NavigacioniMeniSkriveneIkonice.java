package zavrsnitest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigacioniMeniSkriveneIkonice { 
	
	static WebDriver driver; 
	public NavigacioniMeniSkriveneIkonice (WebDriver driver) { 
		this.driver = driver;
	} 
	//Elements 
	//Web
	private static WebElement imageWebBoxClick () { 
		return driver.findElement(By.className("col-sm-6"));
	} 
	private static WebElement searchWebBox () { 
		return driver.findElement(By.id("nav-wb-url"));
	}
	
	//Texts
	private static WebElement booksToborrowImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[2]/div/center/div/a"));
	} 
	private static WebElement booksToborrow () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[2]/div/center/div/a"));
	} 
	private static WebElement openLibraryImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[4]/div/center/a"));
	} 
	private static WebElement openLibrary () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[4]/div/center/a"));
	} 
	private List<WebElement> featuredTexts () { 
		return driver.findElements(By.className("div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	} 
	private List<WebElement> topTexts () { 
		return driver.findElements(By.className("linx "));
	} 
	private List<WebElement> topOneTexts () { 
		return driver.findElements(By.className("linx linx-topped"));
	} 
	
	//Video
	private static WebElement tvNewsimg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[2]/div/center/div/a"));
	} 
	private static WebElement tvNews () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[2]/div/center/div/a")); 
	} 
	private static WebElement understandingImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[4]/div/center/div/a"));
	} 
	private static WebElement understanding () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[4]/div/center/div/a"));
	}
	private List<WebElement> featuredVideo () { 
		return driver.findElements(By.className("div.toprow:nth-child(3) > div:nth-child(1) > div:nth-child(1) a")); 
	} 
	private List<WebElement> topVideo () { 
		return driver.findElements(By.className("linx "));
	} 
	private List<WebElement> toponeVideo () { 
		return driver.findElements(By.className("linx linx-topped"));
	} 
	
	//Audio
	private static WebElement liveMusicAudioImg () { 
		return driver.findElement(By.className("stealth boxy-label")); 
	} 
	private static WebElement liveMusicAudio () { 
		return driver.findElement(By.className("stealth boxy-label"));
	} 
	private static WebElement libriVoxImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[4]/div/center/div/a"));
	} 
	private static WebElement libriVox () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[4]/div/center/div/a"));
	}
	private List<WebElement> featuredAudio () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[1]/div"));
	} 
	private List <WebElement> topAudio () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[3]/div")); 
	} 
	private List <WebElement> toponeAudio () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[5]/div")); 
	} 
	
	//Software
	private static WebElement internetArcadeImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[2]/div/center/div/a"));
	} 
	private static WebElement internetArcade () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[2]/div/center/div/a"));
	} 
	private static WebElement consoleImg () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[4]/div/center/div/a"));
	} 
	private static WebElement console () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[4]/div/center/div/a"));
	} 
	private List <WebElement> featuredSoftware () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[1]/div")); 
	} 
	private List <WebElement> topSoftware () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[3]/div"));
	} 
	private List <WebElement> topOneSoftware () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[5]/div"));
	} 
	
	//Image
	private static WebElement metImg() { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/div/a"));
	} 
	private static WebElement metMuseum () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/div/a"));
	} 
	private static WebElement brooklynImg() { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/div/a"));
	} 
	private static WebElement brooklynMuseum () { 
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/div/a"));
	} 
	private List <WebElement> featuredImage () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[1]/div")); 
	} 
	private List <WebElement> topImage () { 
		return driver.findElements(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[3]/div"));
	} 
	
	//Actions 
	//Web
	
	public void imgWebClickable () { 
		imageWebBoxClick().click();
	} 
	public void searchWebClickable () { 
		searchWebBox().click(); 
	} 
	public void searchWebSendKeys (String text) {
		searchWebBox().sendKeys(text, Keys.ENTER); 
	}
	
	//Texts
	public void booksToborrowImgClick () { 
		booksToborrowImg().click();
	} 
	public void booksToborrowClick () { 
		booksToborrow().click();
	} 
	public void openLibraryImgClick () { 
		openLibraryImg().click();
	} 
	public void openLibraryClick () { 
		openLibrary().click();
	} 
	public List<WebElement> getFeaturedTexts() {
		return featuredTexts();
	}
	public void clickFeaturedTexts (Integer index) {
		getFeaturedTexts().get(index).click();
	} 
	public List<WebElement> getTopTexts() { 
		return topTexts();
	} 
	public void clickTopTexts (Integer index) { 
		getTopTexts().get(index).click();
	} 
	public List<WebElement> getTopOneTexts() { 
		return topOneTexts();
	} 
	public void clickTopOneTexts (Integer index) { 
		getTopOneTexts().get(index).click();
	} 
	
	//Video 
	public void tvNewsImgClick () { 
		tvNewsimg().click();
	} 
	public void tvNewsClick () { 
		tvNews().click();
	} 
	public void understandingImgClick () { 
		understandingImg().click();
	} 
	public void understandingClick () { 
		understanding().click();
	} 
	public List<WebElement> getFeaturedVideo() {
		return featuredVideo();
	}
	public void clickFeaturedVideo (Integer index) {
		getFeaturedVideo().get(index).click();
	} 
	public List<WebElement> getTopVideo() { 
		return topVideo();
	} 
	public void clickTopVideo (Integer index) { 
		getTopVideo().get(index).click();
	} 
	public List<WebElement> getTopOneVideo() { 
		return toponeVideo();
	} 
	public void clickTopOneVideo (Integer index) { 
		getTopOneVideo().get(index).click();
	} 
	
	//Audio 
	public void liveMusicAudioImgClick () { 
		liveMusicAudioImg().click();
	} 
	public void liveMusicAudioClick () { 
		liveMusicAudio().click();
	} 
	public void libriVoxImgClick () { 
		libriVoxImg().click();
	} 
	public void libriVoxClick () { 
		libriVox().click();
	} 
	public List<WebElement> getFeaturedAudio() {
		return featuredVideo();
	}
	public void clickFeaturedAudio (Integer index) {
		getFeaturedAudio().get(index).click();
	} 
	public List<WebElement> getTopAudio() { 
		return topAudio();
	} 
	public void clickTopAudio (Integer index) { 
		getTopAudio().get(index).click();
	} 
	public List<WebElement> getTopOneAudio() { 
		return toponeAudio();
	} 
	public void clickTopOneAudio (Integer index) { 
		getTopOneAudio().get(index).click();
	} 
	
	//Software 
	public void internetArcadeImgClick () { 
		internetArcadeImg().click();
	} 
	public void internetArcadeClick () { 
		internetArcade().click();
	} 
	public void consoleImgClick () { 
		consoleImg().click();
	} 
	public void consoleClick () { 
		console().click();
	} 
	public List<WebElement> getFeaturedSoftware() {
		return featuredSoftware();
	}
	public void clickFeaturedSoftware (Integer index) {
		getFeaturedSoftware().get(index).click();
	} 
	public List<WebElement> getTopSoftware() { 
		return topSoftware();
	} 
	public void clickTopSoftware (Integer index) { 
		getTopSoftware().get(index).click();
	} 
	public List<WebElement> getTopOneSoftware() { 
		return topOneSoftware();
	} 
	public void clickTopOneSoftware (Integer index) { 
		getTopOneSoftware().get(index).click();
	} 
	
	//Image 
	public void metImgClick () { 
		metImg().click();
	} 
	public void metMuseumClick () { 
		metMuseum().click();
	} 
	public void brooklynImgClick () { 
		brooklynImg().click();
	} 
	public void brooklynMuseumClick () { 
		brooklynMuseum().click();
	} 
	public List<WebElement> getFeaturedImage() {
		return featuredImage();
	}
	public void clickFeaturedImage (Integer index) {
		getFeaturedImage().get(index).click();
	} 
	public List<WebElement> getTopImage() { 
		return topImage();
	} 
	public void clickTopImage (Integer index) { 
		getTopImage().get(index).click();
	} 

}
