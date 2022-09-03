package Listeners;

import org.testng.Assert;
import org.testng.IReporter;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoListenersTest implements IReporter{
	@Test
	public void test() {
		System.out.println("hi i am test");
	}
	@Test(dataProvider = "dataprovider")
	public void testGetData(String s) {
		System.out.println("hi i am test"+s);
	}
	@Test
	public void testThree() {
		Assert.assertEquals(5, 7);
	}
	@Test
	public void testFour() {
		System.out.println("hi i am testfour");
		throw new SkipException(null);
	}
	@DataProvider
	public Object [] dataprovider(){
		return new Object [] {"A","B"};
	}
}
