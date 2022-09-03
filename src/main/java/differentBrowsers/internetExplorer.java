package differentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class internetExplorer {
	@Test
	public void internet() {
		System.setProperty("webdriver.ie.driver","E:\\Java\\Drivers\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.quit();
		
	}

}
