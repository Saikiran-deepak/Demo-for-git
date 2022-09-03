package DataProviderPracties;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public  class ADataProvider {
	@DataProvider(name ="sai")
	public static Object [][] demo(Method h){
		String testname = h.getName();
		if("Test".equals(testname))
		{
			return new Object [][] {{"Saikiran"}};
		}
		else {
			return new Object [][] {{"deepak"}};
		}
		
	}
	@DataProvider(name="Deepak")
	public static Object [][] demo1(Method h) {
		String testname = h.getName();
		return	new Object [][] {{"saikiran"}};
	}

}
