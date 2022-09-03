package Options;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SetbinaryChrome {
	//@Test
	public void versionTest() {
		System.setProperty("webdriver.gecko.driver", "E:\\Java\\Drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setBinary("E:\\Java\\Drivers\\ZZ_VersionTesting\\chromedriver_win32_89.0.4389.23\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
	}
	//@Test(priority = 1)
	public void acceptCertiicate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.cacert.org/");
		Thread.sleep(5000);
		driver.close();
	}
	//@Test(priority = 2)
	public void SETProxy() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		Proxy p = new Proxy();
	//	p.setProxyAutoconfigUrl("https://chercher.tech/postman/postman-proxy");
		p.setProxyAutoconfigUrl("https://www.facebook.com/");
		co.setProxy(p);
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
	//@Test(priority = 3)
	public void SetHeadlesss() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
	@Test(priority = 4)
	public void AddArguements() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-infobar");
		co.addArguments("--disable-notification");
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
	//@Test(priority = 5)
	public void SetUnHandledPrompt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}
	//@Test(priority = 6)
	public void pageLoadStrategy() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Java\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setPageLoadStrategy(PageLoadStrategy.EAGER);//None, Normal
		WebDriver driver= new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

}
