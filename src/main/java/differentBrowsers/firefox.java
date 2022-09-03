package differentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
	@Test
	public void fire() {
		System.setProperty("webdriver.gecko.driver","E:\\Java\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
	}

}
