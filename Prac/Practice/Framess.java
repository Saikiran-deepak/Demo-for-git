package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Framess {
	WebDriver driver;

	@Test
	public void FRAME() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/");
		Actions a = new Actions(driver);
		WebElement b = driver.findElement(By.xpath("//a[contains(text(),\"Tester’s Hub\")]"));
		a.moveToElement(b).build().perform();

		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[contains(text(),\"Demo Testing Site\")]")).click();
		// a.moveToElement(driver.findElement(By.xpath("//body[@data-rsssl=\"1\"]"))).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),\"Tabs\")]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		driver.findElement(By.xpath("//a[@class=\"button tiny_button button_pale regular_text\"]")).click();
		

		
		System.out.println(driver.switchTo().frame(0).getTitle());
		driver.findElement(By.xpath("//*[@tabindex=\"0\"]")).click();
		driver.findElement(By.xpath("//*[@tabindex=\"-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-7\"]")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//li[@id=\"Re-Size Accordion\"]")).click();
		System.out.println(driver.switchTo().frame(1).getTitle());
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//li[@id=\"Toggle Icons\"]")).click();
	

	}
}
