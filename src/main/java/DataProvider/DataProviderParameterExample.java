package DataProvider;

import org.testng.annotations.Test;

public class DataProviderParameterExample {
	@Test(dataProvider = "ScenarioData",dataProviderClass=DataProviderSource.class)
	public void scenario1(String ScenarioData) {
		System.out.println("SCenario testing: Data (" + ScenarioData + ")");
	}
	@Test(dataProvider = "ScenarioData",dataProviderClass=DataProviderSource.class)
	public void scenario2(String scenrioData) {
		System.out.println("SCenario testing1: Data (" + scenrioData + ")");
	}
	@Test(dataProvider = "ScenarioData",dataProviderClass=DataProviderSource.class)
	public void commonscenario(String scenrioData) {
		System.out.println("SCenario testing2: Data (" + scenrioData + ")");
	}
}
