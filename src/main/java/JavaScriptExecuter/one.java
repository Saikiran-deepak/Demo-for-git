package JavaScriptExecuter;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// java script is used to make the website interactive
// java script can change the content off html page dynamically
/** Java script Executer: it allows you to run pure javascript code 
 * irrespective of the selenium anguage binding( java ,c#,python) you are using**/
/** JavascriptExecuter is an interface which have two methods
 * executeScript() and executeAsyncScript().
**/

/** when Selenium wont work try java script executer **/
public class one {
	WebDriver driver = null;

    @Test		
    public void Login() 					
    {		
    	System.setProperty("webdriver.chrome.driver",
				"E:\\\\Java\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
        		
        //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        		
        //Launching the Site.		
        driver.get("http://demo.guru99.com/V4/");
			
        //Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);					

        		
      //Navigate to new Page i.e to generate access page. (launch new url)		
      js.executeScript("window.location = 'http://demo.guru99.com/'");	
     WebElement submit = driver.findElement(By.xpath("//input[@value=\"Submit\"]"));
      js.executeScript("arguments[0].click", submit );
     // js.executeScript("arguments[0].value='fwfvfev'", submit ); to enter text
    }		
}
