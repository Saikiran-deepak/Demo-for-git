package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excel_REad {
	WebDriver driver;

	@Test
	public  void loginTest() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://auth.geeksforgeeks.org/");
		String username = getExcelData("Sheet1", 0, 0);
		String password = getExcelData("Sheet1", 0, 0);
		driver.findElement(By.xpath("//input[@placeholder=\"Username or email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
	}
		
		public String getExcelData(String sheetname, int row, int cell)
				throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("E:\\jee-2019-09\\selenium.regular\\src\\main\\java\\Excel\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
			return data;

	}
}
