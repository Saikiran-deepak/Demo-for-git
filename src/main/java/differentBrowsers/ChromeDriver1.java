package differentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeDriver1 {
	@Test
	public static void test() {
	System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
}