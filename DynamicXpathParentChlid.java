/*
 * Open https://ui.cogmento.com/tasks this link
 * Add username and password
 * then click on checkbox using blow Dynamic Xpath
 * //a[text()='Demo']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']
 * used here Preceding-sibling and find out xpath
 * 
 * */

package XpathFinder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathParentChlid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver" , "V:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/tasks");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("virajawati96@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Each@123");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		
		
		driver.findElement(By.xpath("//a[text()='Demo']//parent::td//preceding-sibling::td//div[@class='ui fitted read-only checkbox']")).click();
	}

}
