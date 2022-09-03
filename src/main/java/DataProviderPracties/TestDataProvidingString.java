package DataProviderPracties;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvidingString {
	@Test(dataProvider = "getData")
	public void testData(String actual, String expected) {
		String actualvalue = actual;
		Assert.assertEquals(actualvalue, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{"kiran","kiran"},
			
		};
	}
}
