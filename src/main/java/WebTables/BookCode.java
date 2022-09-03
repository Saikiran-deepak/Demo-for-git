package WebTables;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookCode {
WebDriver driver;
	@Test
	public void element() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\JAVA Files Dont delete\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		String tableStock=this.findTableByColimnName(driver,"Group").getText();
		System.out.println(tableStock);
		driver.quit();

}
	public WebElement findTableByColimnName(WebDriver driver,String columnName) {
		
		List<WebElement> tables=getTable(driver);
		WebElement table=getTableWithColumnNames(columnName,tables);
		if(table==null) throw new NoSuchElementException("no table found");
		
		return table;
		
	}
	
	private WebElement getTableWithColumnNames(String expectedColumns,List<WebElement> tables) {
		WebElement table = null;
		for(int i=0;i<tables.size();i++) {
			String actualColumnNames=getColumnNames(tables.get(i));
			System.out.println(actualColumnNames);
			Boolean isMatch=isColumnNamesMatch(expectedColumns, actualColumnNames);
			if(isMatch) {
				table = tables.get(i);
				break;
			}
		}
		return table;
		
	}
	private String getColumnNames(WebElement table) {
		String columnNames =null;
		WebElement firstRow = table.findElement(By.tagName("tr"));
		List<WebElement> columns = firstRow.findElements(By.tagName("th"));
		for(int columnCount=0;columnCount<columns.size();columnCount++) {
			columnNames = columnNames + ";" +columns.get(columnCount).getText().trim();
		}
		return columnNames;
		}
	
	
	private Boolean isColumnNamesMatch(String expectedColumns, String actualColumns) {
		Boolean isMatched = false;
		actualColumns = actualColumns.toLowerCase();
		expectedColumns = expectedColumns.toLowerCase();
		if(actualColumns!= "" && actualColumns.contains(expectedColumns)) {
			isMatched =true;
		}
		return isMatched;
	}
	
	private List<WebElement> getTable(WebDriver driver){
		return driver.findElements(By.xpath("//table[@class=\"dataTable\"]"));
	}
}
