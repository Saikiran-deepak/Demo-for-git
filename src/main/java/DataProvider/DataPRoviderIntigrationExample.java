package DataProvider;

import org.testng.annotations.Test;

public class DataPRoviderIntigrationExample {
	@Test(dataProvider = "TestType",dataProviderClass=DataProviderSource.class)
	public void IntegrationLevel(String data) {
		System.out.println("IntegrationLevel testing : Data(" + data +")");
	}
}
