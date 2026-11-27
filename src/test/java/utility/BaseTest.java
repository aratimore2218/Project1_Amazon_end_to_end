package utility;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenersLogic { 
		
		@BeforeMethod
		@Parameters("browser")
		
		public void launchBrowser(String nameofBrowser)
		{
			if(nameofBrowser.equals("chrome"))
		{

		driver= new ChromeDriver();
		
		System.out.println("lauching the chrome browser");
		}

		if(nameofBrowser.equals("edge"))
		{
		 driver= new EdgeDriver();
	     driver.manage().window().maximize();
	     System.out.println("lauching the Edge browser");
	  }
		if(nameofBrowser.equals("firefox"))
		{
		 driver= new FirefoxDriver();
	     System.out.println("lauching the Firefox browser");
		}
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     
	     driver.manage().window().maximize();
		 	driver.get("https://amazon.in");
	     
	  }

	    @AfterMethod
		public void quitBrowser()
		{
			driver.quit();
			System.out.println("quiting the browser");
			
		}
	}
