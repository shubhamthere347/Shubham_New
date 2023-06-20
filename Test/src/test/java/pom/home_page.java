package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.utilityclass;


public class home_page {

	
	@FindBy (xpath="//div[@class=\"kt-header__topbar-user\"]") private WebElement user;
	
	@FindBy (xpath="//button[@type=\"button\"]") private WebElement punchinbutton;
	
	@FindBy (xpath="//span[text()=\"My Customers\"]") private WebElement cust;
	
	
	public home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void user_validation(String expusername) throws IOException
	{
		String username = user.getText();
		
		Assert.assertEquals(username,expusername);
	          System.out.println(username);
		
	}
	
	public void punchin_popupValidation()
	{
		boolean buttonval =punchinbutton.isEnabled();
		System.out.println(buttonval);
//     	SoftAssert a=new SoftAssert();
//	
//		a.assertEquals(buttonval, true);
		Assert.assertEquals(buttonval, true);
		
	}
	
	public void click_on_MyCust()
	{
		cust.click();
	}
	
}
