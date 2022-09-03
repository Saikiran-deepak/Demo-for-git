package DataProviderPracties;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvidingBoolean {
	@Test(dataProvider = "getData")
	public void dataString(double actual, double expected) {
		assertEquals(actual, expected);
		
	}
	@DataProvider
	public Object[][] getData(){
	return new Object[][] {
		{15.20,15.20},
	};
	}
}
