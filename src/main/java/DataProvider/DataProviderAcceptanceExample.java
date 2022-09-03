package DataProvider;

import org.testng.annotations.Test;

public class DataProviderAcceptanceExample {
	@Test(dataProvider = "TestType",dataProviderClass=DataProviderSource.class)
	public void AcceptanceLevel(String data) {
		System.out.println("Acceptance testing : Data(" + data +")");
	}
	
}
