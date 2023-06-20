package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_cust_Form {
	
	@FindBy (xpath="//input[@placeholder=\"Lead/Customer Name*\"]") private WebElement cname;
	@FindBy (xpath="//input[@placeholder=\"Ref No.\"]") private WebElement refname;
	@FindBy (xpath="//input[@placeholder=\"Contact Person Name\"]") private WebElement pname;
	@FindBy (xpath="//input[@placeholder=\"Mobile Number\"]") private WebElement mnum;
	@FindBy (xpath="//input[@placeholder=\"Email\"]") private WebElement email;
	@FindBy (xpath="//input[@placeholder=\"Contact Person Designation\"]") private WebElement desi;
	@FindBy (xpath="//button[@mattooltip=\"Save changes\"]") private WebElement savebutton;
	
	public New_cust_Form(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enrnewCust(String cnme)
	{
		cname.sendKeys(cnme);
	}
	public void enterrefname(String refern)
	{
		refname.sendKeys(refern);
	}
	public void enterPernme(String pnname)
	{
		pname.sendKeys(pnname);
	}
	public void entermobnum(String Mobnum)
	{
		mnum.sendKeys(Mobnum);
	}
	public void enteremail(String mail)
	{
		email.sendKeys(mail);
	}	
	public void enterDesi(String designation)
	{
		desi.sendKeys(designation);
	}
	
	public void clickonsavebutton()
	{
		savebutton.click();
	}
}
