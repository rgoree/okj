package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCategires extends BasePage{
		public AddNewCategires(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		@FindBy(xpath = "//input[@id='input-name1']")
	WebElement txtCategoryName;
	@FindBy(xpath = "//div[@role='textbox']")
	WebElement txtDescription;
	@FindBy(xpath = "//input[@id='input-meta-title1']")
	WebElement txtMetaTagTitle;
	@FindBy(xpath = "//textarea[@id='input-meta-description1']")
	WebElement txtMetaTagDescription;
	@FindBy(xpath = "//textarea[@id='input-meta-keyword1']")
	WebElement MetaTagKeywords;
	@FindBy(xpath = "//i[@class='fa fa-save']")
	WebElement save;
	public void CatageryName(String cat) {
		txtCategoryName.sendKeys(cat);
	}
	public void Description(String des) {
		txtDescription.sendKeys(des);
	}
	public void MetaTitle(String mt) {
		txtMetaTagTitle.sendKeys(mt);
	}
	public void MetaDes(String md) {
		txtMetaTagDescription.sendKeys(md);
	}
	public void MeatTag(String mt) {
		MetaTagKeywords.sendKeys(mt);
	}
	public void SaveCat() {
		save.click();
	}
}
