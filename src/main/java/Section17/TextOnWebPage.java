package Section17;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextOnWebPage {
	WebDriver driver;
	@Test
	public void placeHolder() {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String a=driver.findElement(By.xpath("//*[@class=\"_8eso\"]")).getText(); //Text
		String placeholder=driver.findElement(By.xpath("//*[@class=\"_6lux\"]/input")).getAttribute("placeholder");     //Place holder
		String button=driver.findElement(By.xpath("//*[@class=\"_6ltg\"]/button")).getText(); // button
		System.out.println("output" +a);
		System.out.println("place holder "+placeholder);
		System.out.println("button "+button);
		System.out.println();
		driver.close();
	}
}
