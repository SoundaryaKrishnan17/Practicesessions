//package PageObjects;
//
//import org.openqa.selenium.WebDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class WebPage {
//	
//	
//	
//	public WebPage() {
//		PageFactory.initElements(Baseclass.driver, this);
//		
//	}
//	
//	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
//	public WebElement btnAll;
//	
//   @FindBy(xpath="//li//a[@data-menu-id='5']")
//   public WebElement btnElectronics;
//
//	
//   @FindBy(xpath="(//ul[@class='hmenu hmenu-visible hmenu-translateX'])[1]//a[text()='Accessories & Supplies']")
//   public WebElement btnAccessories;
//
//   @FindBy(xpath="//a[@data-menu-id='7']")
//	public WebElement btnSmartHome;
//	
//	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//li//a[text()='Smart Home Lighting']")
//	public WebElement btnSmartHomeLighting;
//	
//	@FindBy(xpath="//div[@data-cel-widget='osa_browse_banner_1']//img[@alt='smart strip lights']")
//	public WebElement btnStrip;
//	
//	@FindBy(xpath="(//div[@data-normaliseheight=\"false\"]//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
//	public WebElement btnItem;
//
//	
//	
//	public void clickOnAll() {
//	btnAll.click();
//	}
//	
//	public void clickElectronics() {
//		btnElectronics.click();
//		
//	}
//	
//	
//	public void clickAccessories() {
//		btnAccessories.click();
//	}
////	
////	public void selectItems() {
////		clickitem.click();
////	}
//	
//	
//	public void clickSmartHome() {
//		btnSmartHome.click();
//		
//	}
//
//	public void clickSmartHomeLighting() {
//		btnSmartHomeLighting.click();
//	}
//
//	public void clickStrip() {
//		btnStrip.click();
//	}
//
//	public void clickItem() {
//		btnItem.click();
//	}
//	}
//
//		
//
//
//
package objectRepository;


