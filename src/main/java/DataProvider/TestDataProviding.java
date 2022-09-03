package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProviding {
	@Test(dataProvider = "data")
	public void testData(int actual, int expected) {
		int actualvalue = actual+20;
		Assert.assertEquals(actualvalue, expected);
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{100,120},
			{120,140},
			{140,160},
			{160,180},
			{180,200},
			
		};
	}
	@DataProvider(name = "data")
	public Object[][] getData1(){
		return new Object[][] {
			{10,20},
			{20,40},
			{40,60},
			{160,180},
			{180,200},
			
		};
	}
}
