package WebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Part1 {
	WebDriver driver = null;

	@Test
	public void element() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\\\Java\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// Thread.sleep(10000);
		driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tr//th[2]")); // selecting particular row
		String a = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr[1]//td[2]")).getText(); // selecting
		System.out.println(a); // particular row

		// total tables
		List<WebElement> b = driver.findElements(By.xpath("//table[@class=\"dataTable\"]"));
		System.out.println(b.size());
		// total no of rows in table
		List<WebElement> c = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr"));
		System.out.println(c.size());
		// total no of columns in table
		List<WebElement> d = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr[1]//td"));
		System.out.println(d.size());

		// Data of specific row
		List<WebElement> e = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr[3]//td"));
		for (WebElement column : e) {
			System.out.println(column.getText());
		}
		// Data of specific column complete first column data
		List<WebElement> f = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody//tr//td[1]"));

		for (WebElement column : f) {
			System.out.println(column.getText());
		}

		// total table
		List<WebElement> g = driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tbody/tr"));
		for (WebElement column : g) {
			System.out.println(column.getText());
		}
		Thread.sleep(5000);
		driver.close();

	}

}
