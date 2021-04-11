package XpathFinder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver;	
		
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
//		driver.get("https://www.spicejet.com/");
		
	driver.get("https://www.ebay.com/");
	    
		
		
//		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456");
		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).sendKeys("Mumbai");
		
//		driver.findElement(By.xpath("//input[contains(@id, 'ctl00_mainContent_ddl_destinationStation1_CTXT')]")).sendKeys("Goa");
		
		// Absoulte Xpath : is not recommanded
		//(//*[@id="passwd"]/div[1]/div/div[1]/input)
		//1. Performance issue
		//2. not reliable
		//3. can be change any time any future.
		
		
		// Dynamic id : Every time id will chage when we open the webpage.
		
				// Starts-with()
				//  id = test123    
				//  id = testdfdf3
			    
				// Ends-with()
		        //  id = 123test	
		        //  id = 466test 
		
		
		// How to solve this problem : 1) use contains
									// 2) use Starts-with()
		
//		driver.findElement(By.xpath("//input[contains(@id, 'test')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[starts-with(@id, 'test')]")).sendKeys("Test");
//		driver.findElement(By.xpath("//input[ends-with(@id, 'test')]")).sendKeys("dd");
		
		
		// for links: custom Xpath
		// All the link represented by link A
		
	driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
		
		
	}

}
