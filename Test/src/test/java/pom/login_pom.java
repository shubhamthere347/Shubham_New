package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pom {
	
	@FindBy(xpath="//input[@id=\"mat-input-0\"]") private WebElement id;
	
	@FindBy(xpath="//input[@id=\"mat-input-1\"]") private WebElement password;
	
	@FindBy(xpath="//button[@id=\"kt_login_signin_submit\"]") private WebElement signin;
	

	
	public login_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobile(String mob)
	{
		id.sendKeys(mob);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() throws InterruptedException
	{  
		Thread.sleep(15000);
		signin.click();
	}


}
