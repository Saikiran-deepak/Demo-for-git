package AlertsAndPopUP;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	WebDriver driver;
	@Test
	public void Test() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		deleteIT();
		
	}
	public void deleteIT() {
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("abcdef");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		acceptIT();
	}
	public void acceptIT() {
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.close();
		
	}
	
	@Test
	public void TestPopup() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[contains(text(),\"Click Here\")]")).click();
		newWindow();
		
		
	}
	public void newWindow() {
		String parent=driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		Iterator<String> c=b.iterator();
		while(c.hasNext()) {
			String child=c.next();
			 if(!parent.equalsIgnoreCase(child))			
	            {    		
	                    // Switching to Child window
	                    driver.switchTo().window(child);	                                                                                                           
	                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                				                    
	                    driver.findElement(By.name("btnLogin")).click();			
	                                 
				// Closing the Child Window.
	                    driver.close();	
	            }	
		}
		driver.switchTo().window(parent);
		driver.close();
		
		
		
	}
}
