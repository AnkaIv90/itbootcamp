package zavrsnitest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigacioniMeniLinks { 
	
	   static WebDriver driver;
	    public NavigacioniMeniLinks(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    // Elements
	    private static WebElement aboutLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(1) a"));
	    }
	    private static WebElement contactLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(2) a"));
	    }
	    private static WebElement blogLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(3) a"));
	    }
	    private static WebElement projectsLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(4) a"));
	    }
	    private static WebElement helpLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(5) a"));
	    }
	    private static WebElement donateLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(6) a"));
	    }
	    private static WebElement jobsLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(7) a"));
	    }
	    private static WebElement volunteerLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(8) a"));
	    }
	    private static WebElement peopleLink () {
	        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(9) a"));
	    }
	    
	    // Actions
	    public void clickAboutLink() {
	        aboutLink().click();
	    }
	    public void clickContactLink() {
	        contactLink().click();
	    }
	    public void clickBlogLink() {
	        blogLink().click();
	    }
	    public void clickProjectsLink() {
	        projectsLink().click();
	    }
	    public void clickHelpLink() {
	        helpLink().click();
	    }
	    public void clickDonateLink() {
	        donateLink().click();
	    }
	    public void clickJobsLink() {
	        jobsLink().click();
	    }
	    public void clickVolunteerLink() {
	        volunteerLink().click();
	    }
	    public void clickPeopleLink() {
	        peopleLink().click();
	    }
}
