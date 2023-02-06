package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPageData;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_Add extends BaseClass{
	@Test
	public void Tc4() {
		
		LoginPage lp=new LoginPage(driver);

		lp.setUserName(rb.getString("email")); // valid email, get it from properties file

		lp.setPassword(rb.getString("password")); // valid password, get it from properties file

		lp.clickLogin();
		HomePage hp=new HomePage(driver);
		hp.clickOnCatalog();
		hp.clickCategories();
		hp.AddNewCat();
		hp.DatClick();
		AccountRegistrationPageData ac=new AccountRegistrationPageData(driver);
		ac.ClickParDrop();
		ac.ParDrop("Cameras");
		ac.Filtertxt("Good for healths");
		ac.CboxStores();
		ac.CboxTop();
		ac.txtColumn("2");
		ac.DropStatus(1);

	}
}
