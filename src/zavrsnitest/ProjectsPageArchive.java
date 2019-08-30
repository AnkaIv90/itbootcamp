package zavrsnitest; 

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPageArchive { 
	
	static WebDriver driver; 
	public ProjectsPageArchive (WebDriver driver) { 
		this.driver = driver;
	} 
	
	private List<WebElement> projectsList () { 
		return driver.findElements(By.cssSelector("div.col-sm-3"));
	} 
	//Actions 
	public List <WebElement> getnumberOfelementsProjectList () { 
	    return projectsList();
	} 
	public void numberOfelementsProjectList () { 
		getnumberOfelementsProjectList().size();
	}
}
