package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElements {
	WebDriver driver=null;
	@Test
	public void element() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Java\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freecrm.com/");
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class=\'btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left\']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("Saikiran");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("deepak");
		driver.close();

}
}
