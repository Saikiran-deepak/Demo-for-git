package differentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicallyOpenBrowser{
	WebDriver driver = null;

	@Parameters("browser")
	@BeforeMethod
	public void browser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\Java\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			
		} 
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
		} 
		else{
			System.setProperty("webdriver.ie.driver","E:\\Java\\Drivers\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}	
	}

	@Test
	public void test1() {

		driver.get("https://www.facebook.com/");
	}
	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
