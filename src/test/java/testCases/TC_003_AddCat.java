package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddNewCategires;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_003_AddCat extends BaseClass{

	@Test
	public void tc_003Add() {
		try {
			LoginPage lp=new LoginPage(driver);

			lp.setUserName(rb.getString("email")); // valid email, get it from properties file

			lp.setPassword(rb.getString("password")); // valid password, get it from properties file

			lp.clickLogin();
			HomePage hp=new HomePage(driver);
			hp.clickOnCatalog();
			hp.clickCategories();
			hp.AddNewCat();
			AddNewCategires ac=new AddNewCategires(driver);
			ac.CatageryName("Rajesh");
			ac.Description("Cool prodecut and useful for all");
			ac.MetaTitle("ShopsForVeryOne");
			ac.MetaDes("Usefaul fo kids and yougers");
			ac.MeatTag("Tages 120989");
			ac.SaveCat();
			MyAccountPage ma=new MyAccountPage(driver);
			boolean actal=	ma.isMyAccountPageExists();
			Assert.assertEquals(actal, true);
		}catch (Exception e) {
			Assert.fail();
		}
	}
}
