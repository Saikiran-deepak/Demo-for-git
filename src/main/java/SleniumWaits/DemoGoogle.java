package SleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGoogle {

	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement a=driver.findElement(By.xpath("//input[@name=\"q\"]"));
		a.sendKeys("selenium");
		Thread.sleep(5000);  // if we remove sleep it will throw no such element exception
		WebElement b=driver.findElement(By.xpath("//li[@role=\"presentation\"][4]"));
		b.click();
		driver.close();
	}
}
