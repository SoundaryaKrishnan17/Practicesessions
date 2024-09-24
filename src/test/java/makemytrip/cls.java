package makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cls {
public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver  driver= new EdgeDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-elements/#google_vignette");
	driver.manage().window().maximize();
	//WebElement drop = driver.findElement(By.tagName("select"));
	
	//Select d = new Select(drop);
//	Thread.sleep(2000);
//	d.selectByIndex(10);
//	d.selectByValue("IND");
//	Thread.sleep(2000);
//	d.selectByVisibleText("Italy");
//	boolean multiple = d.isMultiple();
//	System.out.println(multiple);
//	
//	List<WebElement> options = d.getOptions();
//	for(int i=options.size()-1;i>=0;i--) {
//		WebElement element = options.get(i);
//		String text = element.getText();
//		System.out.println(text);
//		
//	}
	WebElement down = driver.findElement(By.xpath("//ol[@id=\"selectable\"]"));
	Select d = new Select(down);
	d.selectByIndex(0);
	d.selectByIndex(1);
	d.selectByIndex(2);
	d.selectByIndex(3);
}
}
