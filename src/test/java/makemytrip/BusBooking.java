package makemytrip;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BusBooking {

	static WebDriver driver;
	
	@DataProvider(name="test-data")
	public Object[][] dataProvFun(){
		return new Object[][] {{"Mumbai", "Delhi"}};
	} 
		
	@BeforeClass

	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\MakeMytrip\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}



//	@Test
//	public void method1User_close_the_advertisementpopup() {
//
//		try {
//			WebElement frame = driver.findElement(By.xpath("//iframe[@title=\"notification-frame-~10cb45141\"]"));
//
//			driver.switchTo().frame(frame);
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//		} catch (Exception e) {
//			driver.findElement(By.xpath("//a[@class='close']")).click();
//			System.out.println("notification close");
//		}
//	}

	
	@Test(priority=1)
	public void user_clicks_on_buses() throws InterruptedException {
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='menu_Buses']")).click();
		
	}
	
	
	@Test(priority=3)
	public void user_clicks_on_travel_date() {
		try {
		WebElement traveldate=driver.findElement(By.xpath("//input[@id='travelDate']"));
		traveldate.click();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@Test(priority=4)
	public void user_selects_date() {
		try {
	//driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
	WebElement clickDate=driver.findElement(By.xpath("//div[contains(text(),'December')]//ancestor::div[@class='DayPicker-Month']//div[text()='1']"));
	clickDate.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
}
		
	 @Test(dataProvider="test-data", priority=2)
	 public void user_enters_from_address_and_to_address(String name, String name1)throws InterruptedException {	
		driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(4000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'"+name+"')])[1]")).click();
		System.out.println("From address:" +name);
	 
		 
		WebElement e =driver.findElement(By.xpath("//input[@title='To']")); 
		e.sendKeys(name1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[contains(text(),'"+name1+"')])[1]")).click();
		Thread.sleep(4000);
		System.out.println("To adress:" +name1);
		}
		
		
	
	@Test(priority=0)
	public void user_close_username_popup() {
		try {
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



@Test(priority=5)
public void user_clicks_on_search() throws InterruptedException {
	try {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='primaryBtn font24 latoBold widgetSearchBtn']")).click();
	driver.findElement(By.xpath("(//div[text()='Select Seats'])[1]")).click();
	Thread.sleep(6000);
	WebElement seat = driver.findElement(By.xpath("(//div[@class='sc-brqgnP kdmEsR']//div[@class='makeAbsolute'])[13]"));
	seat.click();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	


@AfterClass

@Test(priority=6)
public void user_clicks_on_Continuebutton() throws InterruptedException {
	try {
	Thread.sleep(6000);
	WebElement ele = driver.findElement(By.xpath("//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']//span"));
	Actions acc = new Actions(driver);
	acc.moveToElement(ele).build().perform(); 
	ele.click();
	 
	}catch(Exception e) {
	  e.printStackTrace();
	   }
	
}
}


