package Reusable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction implements IcommonFunction {

	public static WebDriver driver;
	
	
	public void launchChromeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		System.out.println("Launched");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}


	public void click(WebElement ac) {
		Actions acc = new Actions(driver);
		acc.click(ac).build().perform();
		
	}
	
	

	
	public void clickAll(WebElement al) {
		
		al.click();
	}

	
	public void clickEle(WebElement el) {
		el.click();
		
	}

	
//	public void clickAcc(WebElement acc) {
//		acc.click();
//	}

	
	public void clickPr(WebElement pr) {
		pr.click();
		
	}


	public void browserClose() {
		
		
	}

	
}