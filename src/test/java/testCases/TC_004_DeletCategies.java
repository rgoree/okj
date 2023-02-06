package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Categries;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_004_DeletCategies extends BaseClass {
	@Test
	public void Tc_004() {
		try {


			LoginPage lp=new LoginPage(driver);

			lp.setUserName(rb.getString("email")); // valid email, get it from properties file

			lp.setPassword(rb.getString("password")); // valid password, get it from properties file

			lp.clickLogin();
			Categries c=new Categries(driver);
			c.clickOnCatalog();
			c.clickCategories();
			c.ClickOnComp();
			c.DeleItem();
			c.AlertAccpect();
		}catch (Exception e) {
			Assert.fail();
		}
	}
}