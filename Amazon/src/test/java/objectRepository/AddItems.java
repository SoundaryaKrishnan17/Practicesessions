package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable.CommonFunction;

public class AddItems extends CommonFunction {
	
	public AddItems() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']")
	private WebElement all;
	
	@FindBy(xpath="//li//a[@data-menu-id='5']")
	private WebElement el;
	
	@FindBy(xpath="(//a[text()='Accessories & Supplies'])[1]")
	private WebElement ac;
	
	@FindBy(xpath="(//div[@class='s-main-slot s-result-list s-search-results sg-row']//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	private WebElement prod;
	
    @FindBy(xpath="(//a[@data-menu-id=\"7\"])[1]")
    private WebElement smart;
    
    @FindBy(xpath="(//a[text()='Smart Home Lighting'])[1]")
    private WebElement lighting;
    
    @FindBy(xpath="(//div[@class='bxc-grid__row   bxc-grid__row--light  '])[3]//img[@alt='smart strip lights']")
    private WebElement lights;
    
    @FindBy(xpath="(//div[@data-normaliseheight=\"false\"]//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	private WebElement items;
    
    @FindBy(xpath="//a[@data-menu-id=\"6\"]")
    private WebElement comp;
    
    @FindBy(xpath="//a[text()='Laptop Accessories']")
    private WebElement lapAcc;
    
    @FindBy(xpath="(//div[@class='s-main-slot s-result-list s-search-results sg-row']//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
    private WebElement clickPrd;
    
    @FindBy(xpath="(//div[text()='see all'])[1]")
    private WebElement seeAll;
    

	@FindBy(xpath="(//div[text()='Movies & Television'])[1]")
    private WebElement mo;
    
    @FindBy(xpath="(//a[text()='TV Shows'])[1]")
    private WebElement tv;
    
    @FindBy(xpath="(//ol[@role='list']//span[@class='a-truncate-cut'])[2]")
    private WebElement show;
    
    @FindBy(xpath="(//ul[@class=\"a-unordered-list a-nostyle a-horizontal a-spacing-none\"]//a[@class='a-size-base a-color-base a-link-normal a-text-normal'])[2]")
    private WebElement shows;
    
    @FindBy(xpath="//a[@data-menu-id=\"27\"]")
    private WebElement giftCard;
    
    @FindBy(xpath="//a[text()='All gift cards']")
    private WebElement allGift;
    
    @FindBy(xpath="((//div[@class='a-carousel-viewport'])[1]//span[@class='a-truncate-cut'])[3]")
    private WebElement random;
    
    
	public WebElement getAll() {
		return all;
	}

	public WebElement getEl() {
		return el;
	}

	public WebElement getAc() {
		return ac;
	}

	public WebElement getProd() {
		return prod;
	}
	
	public WebElement getSmart() {
		return smart;
	}

	public WebElement getLighting() {
		return lighting;
	}

	public WebElement getLights() {
		return lights;
	}

	public WebElement getItems() {
		return items;
	}
	
	public WebElement getComp() {
		return comp;
	}

	public WebElement getLapAcc() {
		return lapAcc;
	}

	public WebElement getClickPrd() {
		return clickPrd;
	}
	
	public WebElement getSeeAll() {
		return seeAll;
	}

	public WebElement getMo() {
		return mo;
	}

	public WebElement getTv() {
		return tv;
	}
	
	public WebElement getShow() {
		return show;
	}

	public WebElement getShows() {
		return shows;
	}
	
	public WebElement getGiftCard() {
		return giftCard;
	}

	public WebElement getAllGift() {
		return allGift;
	}

	public WebElement getRandom() {
		return random;
	}


}
