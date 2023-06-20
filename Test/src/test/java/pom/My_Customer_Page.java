package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Customer_Page {

	@FindBy(xpath="//span[text()=\" New Customer \"]") private WebElement innewcust;

	public My_Customer_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonnewcust()
	{
		innewcust.click(); 
		
	}
}
