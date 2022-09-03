package DataProviderPracties;

import java.awt.print.Printable;

import org.testng.annotations.Test;

public class ATestClass {
	@Test(dataProvider = "sai", dataProviderClass = ADataProvider.class)
	public void Test(String sai) {
		System.out.println("hi" + sai + "how are you");
	}
	
	@Test(dataProvider="Deepak",dataProviderClass = ADataProvider.class)
	public void test(String Deepak) {
		System.out.println("hi "+Deepak+" how are you");
	}
}
