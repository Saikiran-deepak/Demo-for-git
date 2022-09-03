package WebTables;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.description.annotation.AnnotationList.Empty;

public class Population {
	WebDriver driver;

	// @Test
	public void test() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/world-population-by-year/");
		WebElement a = driver.findElement(By.xpath("//div[@class=\"table-responsive\"]"));
		List<WebElement> b = a.findElements(By.xpath("./table/thead/tr/th")); // using a( xpath) to a continue in b)
		int count = b.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			System.out.println("Column Names : " + b.get(i).getText());
		}

		List<WebElement> c = a.findElements(By.xpath("./table/tbody/tr"));
//		int rows=c.size();
//		System.out.println(rows);
//		for(int i=0 ; i<rows;i++) {
//			System.out.println("Rows : " + c.get(i).getText());
//			
//		} or use down
		for (WebElement row : c) {
			List<WebElement> cell = row.findElements(By.xpath("./td"));
			for (WebElement cells : cell) {
				System.out.println(cells.getText());
			}
		}
		driver.close();

	}

	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/world-population-by-year/");
		double a = 0, b = 0;
		String max = null;

		List<WebElement> column = driver
				.findElements(By.xpath("//table[@class=\"table table-hover table-condensed\"]/tbody/tr"));
		System.out.println("Col count : " + column.size());
		List<WebElement> rows = driver
				.findElements(By.xpath("//table[@class=\"table table-hover table-condensed\"]/thead/tr/th"));
		System.out.println("Row count : " + rows.size());

		for (int i = 1; i < column.size(); i++) {
			max = driver
					.findElement(
							By.xpath("//table[@class=\"table table-hover table-condensed\"]/tbody/tr[" + i + "]/td[3]"))
					.getText();
			// max=driver.findElement(By.xpath("html/body/div/div/div/div/div/table/tbody/tr["+i+"]/td[3]")).getText();

			System.out.println(max);
			if(max.isBlank()) {
				max = "00";
			}
			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = null;
			try {
				num = f.parse(max);
			} 
			catch (ParseException e) {
				// TODO Auto-generated catch block				
				e.printStackTrace();
			}
//			String z=max.replaceAll("[^a-zA-Z0-9]", "");
			max = num.toString();
			a = Double.parseDouble(max);
			if (a > b) {
				b = a;
			}
			}
		
		// String z=max.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(b);

		driver.close();
	}
}
