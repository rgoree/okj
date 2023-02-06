package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//a[normalize-space()='Catalog']")
	WebElement lnkCatalog;

	@FindBy(xpath = "//a[normalize-space()='Categories']")
	WebElement lnkCategories;
	@FindBy(xpath = "//div[@class='pull-right']//a[@class='btn btn-primary']")   // Login link added in step6
	WebElement AddNew;
	@FindBy(xpath = "//a[normalize-space()='Data']")
	WebElement DataClick;

	// Action Methods
	public void clickOnCatalog() {
		lnkCatalog.click();
	}

	public void clickCategories() {
		lnkCategories.click();
	}
	public void AddNewCat()    // added in step6
	{
		AddNew.click();
	}
	public void DatClick()    // added in step6
	{
		DataClick.click();
	}



}
