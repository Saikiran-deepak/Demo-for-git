package MyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one {
	WebDriver driver;
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/Atom/Web%20Delelopment/MyPersonal%20Site/index.html");
		driver.findElement(By.xpath("//a[@href=\"inputs.html\"]")).click();
	}
}
