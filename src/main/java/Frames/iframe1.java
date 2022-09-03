package Frames;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframe1 {
	WebDriver driver = null;;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		/*
		 * WebDriver driver = new ChromeDriver(); IT will throw null pointer exception
		 * because it is initialized in global level
		 */
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void iframe() {
		driver.findElement(By.linkText("Button")).click();
		WebElement a = driver.findElement(By.className("entry-title"));
		Assert.assertEquals(a.getText(), "Button");

		/* to switch frame */
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		WebElement first = driver.findElement(By.xpath("//*[@class=\"widget\"]/button"));
		first.click();

		/* to go back to main frame */
		driver.switchTo().parentFrame();
		String text = driver.findElement(By.xpath("//*[@class=\"demo-list\"]/h2")).getText();
		System.out.println(text);
		assertEquals(text, "Examples");

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
