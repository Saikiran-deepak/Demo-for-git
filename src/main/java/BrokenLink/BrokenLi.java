package BrokenLink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLi {

	@Test
	public void demo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://edition.cnn.com/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println(elements.size());

		for (WebElement link : elements) {
			
			String URL = link.getAttribute("href");
			invalidLink.verifyLink(URL);
//			System.out.println(link);
//			System.out.println(link.getText());
		}
		
		invalidLink.getInvalidCount();
		driver.close();
	}
}
