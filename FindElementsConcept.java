package XpathFinder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

WebDriver driver;	
		
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.get("https://www.ebay.com/");
		driver.get("");
		//1 To get the count of links on the page
		//2  get the text of each link on the pages
		
		List <WebElement> linklist =  driver.findElements(By.tagName("a"));
		
		//how many button 
		List <WebElement> buttonlist =  driver.findElements(By.tagName("button")); 
		
		
		// Size of link list
//		System.out.println(linklist.size());
		
		for(int i=0 ; i<=linklist.size(); i++)
		{
			String linkdata = linklist.get(i).getText();
			System.out.println(linkdata);
		}
		}
}


