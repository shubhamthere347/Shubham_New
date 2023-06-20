package test_;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.baseclass;
import base.utilityclass;
import pom.My_Customer_Page;
import pom.New_cust_Form;
import pom.home_page;
import pom.login_pom;

public class test_class extends baseclass{

	login_pom lp;
	home_page hp;
	My_Customer_Page mpc;
	New_cust_Form ncf;
	
	@Test(priority=1)
	public void login_validate() throws IOException, InterruptedException
	{
		 confi();
		lp =new login_pom(driver);
		hp=new home_page(driver);
		
		
	lp.enterMobile(utilityclass.fetchdt(1, 0));
    
	 lp.enterPassword(utilityclass.fetchdt(1, 1));
     
	 
	 lp.clickOnLogin();
	 
	 utilityclass.Screenshot(driver, "login");
	    hp.user_validation(utilityclass.fetchdt(1, 2));
	    utilityclass.Screenshot(driver, "uservali");
	    
	}
	@Test(priority=2)
	public void popvalidationafterclickon_PuncinButton() throws IOException
	{
		hp.punchin_popupValidation();
		utilityclass.Screenshot(driver, "popupvaldn");
		// button is not enable
	}
	
	@Test(priority=5)
	public void qppp_addcust_Validation() throws IOException
	{
		//qpopvalidationafterclickon_PuncinButton
		mpc = new My_Customer_Page(driver);
		hp.click_on_MyCust();
		mpc.clickonnewcust();
		
		ncf=new New_cust_Form(driver);
		ncf.enrnewCust(utilityclass.fetchdt(6, 0));
		ncf.enterrefname(utilityclass.fetchdt(6, 1));
		ncf.enterPernme(utilityclass.fetchdt(6, 2));
		ncf.entermobnum(utilityclass.fetchdt(6, 3));
		ncf.enteremail(utilityclass.fetchdt(6, 4));
		ncf.enterDesi(utilityclass.fetchdt(6, 5));
		
		ncf.clickonsavebutton();
		
		utilityclass.Screenshot(driver, "AddCustValidation");
	}
	

	
}
