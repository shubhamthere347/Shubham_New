package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	//configure browser
	public WebDriver driver;
	
	public void confi()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\com_Velo_fliipkart\\BrowserDrivers\\chromedriver.exe");
		
		    driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		           //open application in browser
		     driver.get("https://testffc.nimapinfotech.com/");

	
}
}
