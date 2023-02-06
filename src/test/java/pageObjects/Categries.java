package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Categries extends BasePage{

	public Categries(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//a[normalize-space()='Catalog']")
	WebElement lnkCatalog;

	@FindBy(xpath = "//a[normalize-space()='Categories']")
	WebElement lnkCategories;


	@FindBy(xpath = "//input[@value='36']")
	WebElement clickOnComps;
	@FindBy(xpath = "//button[@type='button']")
	WebElement DeletItem;

	public void clickOnCatalog() {
		lnkCatalog.click();
	}

	public void clickCategories() {
		lnkCategories.click();
	}

	public void ClickOnComp() {
		clickOnComps.click();
	}
	public void DeleItem() {
		DeletItem.click();
	}
	public void AlertAccpect() {
		Alert a=driver.switchTo().alert();
		a.accept();
	}

}
