package ElementVisibility;

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

public class visibilityElement {
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

	@Test(enabled = false)
	public void CheckVisibility() throws InterruptedException {
		driver.findElement(By.linkText("Toggle")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));
		driver.findElement(By.xpath("//*[@id=\"effect\"]/h3")).isDisplayed();
		driver.findElement(By.xpath("//button[@id=\"button\"]")).click();

		boolean find = driver.findElement(By.xpath("//*[@id=\"effect\"]/h3")).isDisplayed();
		// driver.findElement(By.xpath("//*[@id=\"effect\"]/h3")).click();
		System.out.println(find);

	}

	@Test(enabled = false)
	public void enabled() throws InterruptedException {
		boolean a = driver.findElement(By.linkText("Resizable")).isEnabled();
		System.out.println(a);

	}

	@Test
	public void selected() throws InterruptedException {
		driver.findElement(By.linkText("Checkboxradio")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]")));

		WebElement b = driver.findElement(By.xpath(
				"//label[@class=\"ui-checkboxradio-label ui-corner-all ui-button ui-widget ui-checkboxradio-radio-label\"][3]"));
		b.click();
		Thread.sleep(5000);

		System.out.println(b.isSelected()); // do again

	}

	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		driver.quit();
	}

}
