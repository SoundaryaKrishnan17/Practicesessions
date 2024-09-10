//package PageObjects;
//
//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Baseclass {
//	
//	public static WebDriver driver;
//	private static FluentWait<WebDriver> wait;
//	
//	
//	public static void browserLaunch() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		//WebDriverWait wait = new WebDriverWait(driver, 30);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
//    public static void clickOnAll(WebElement e) {
//     	e.click();
//	}
//	
//	public static void selectDep(WebElement e){
//		e.click();
//	}
//
//   public static void selectMenu(WebElement e){
// 	
//	   e.click();
//		//try {
//			
//			//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(me));
//		
////		element.click();
////		}catch (Exception e) {
////			e.printStackTrace();
////			
////		}
////		Thread.sleep(6000);
////		Actions acc = new Actions(driver);
////		acc.moveToElement(me).click().build().perform();
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		js.executeScript("arguments[0].click();", me);
//		
////		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li//a[text()='Computer Components']")));
//   }	
//		
//
//	
//	
////	public static void checkItem(String xpath) {
////		WebElement ch = driver.findElement(By.xpath(xpath));
////		ch.click();
////		checkItem("(//div[@class='s-main-slot s-result-list s-search-results sg-row']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]");
////	}
//	
//	public void smartHome(WebElement e){
//		e.click();
//	}
//	
//	public void smartHomeLighting(WebElement e) {
//		
//		e.click();
//	}
//	
//	
//
//	public void stripLighting(WebElement e) {
//		e.click();
//		
//	}
//	
//	public void selectItem(WebElement e) {
//		e.click();
//		
//	}
//}
package objectRepository;


