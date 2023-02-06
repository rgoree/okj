package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPageData extends BasePage {

	public AccountRegistrationPageData(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-parent']")
	WebElement DropParent;
	@FindBy(xpath = "//input[@id='input-filter']")
	WebElement txtFilters;
	@FindBy(xpath = "//label[normalize-space()='Default']")
	WebElement CboxStores;
	@FindBy(xpath = "//input[@id='input-top']")
	WebElement CboxTop;
	@FindBy(xpath = "//input[@id='input-column']")
	WebElement txtColumn;
	@FindBy(xpath = "//select[@id='input-status']")
	WebElement DropStatus;
	public void ClickParDrop() {
		DropParent.click();
	}

	public void ParDrop(String selDrop) {
		if(selDrop.equals("Cameras")) {
			driver.findElement(By.xpath("//a[normalize-space()='Cameras']")).click();
		}else if(selDrop.equals("Components")) {
			driver.findElement(By.xpath("//a[normalize-space()='Components']")).click();
		}
	}
	public void Filtertxt(String st) {
		txtFilters.sendKeys(st);
	}
	public void CboxStores() {
		CboxStores.click();	
	}
	public void CboxTop() {
		CboxTop.click();
	}
	public void txtColumn(String st) {
		txtColumn.sendKeys(st);
	}
	public void DropStatus(int a) {
		Select drpEny = new Select(driver.findElement(By.xpath("//select[@id='input-status']")));
		drpEny.selectByIndex(a);
	}

}

