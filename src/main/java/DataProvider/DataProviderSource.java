package DataProvider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {

	@DataProvider(name = "ScenarioData")
	public static Object[][] getScenarioData(Method method) {
		String testcase = method.getName(); // it will return test case name
		if ("scebario".equals(testcase)) {
			return new Object[][] { { "Scenario1 data" } };

		} else if ("scebario2".equals(testcase)) {
			return new Object[][] { { "Scenario2 data" } };
		} else {
			return new Object[][] { { "common Scenario data" } };
		}
	}

	@DataProvider(name = "TestType")
	public static Object[][] getTestTypeData(ITestContext contest) {
		String testName = contest.getName(); // it will return actual test case method
		if ("IntegrationLevel".equals(testName)) {
			return new Object[][] { { "integration test data" } };

		} else if ("AcceptanceLevel".equals(testName)) {
			return new Object[][] { { "acceptance test data" } };
		} else {
			return new Object[][] { { "common test data" } };
		}
	}
}
