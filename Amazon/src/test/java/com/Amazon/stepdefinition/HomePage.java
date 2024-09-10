package com.Amazon.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Reusable.CommonFunction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.AddItems;

public class HomePage extends CommonFunction{
	
	CommonFunction co = new CommonFunction();
	AddItems ad = new AddItems();
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {	
	    
	}

	@Given("user launch application {string}")
	public void user_launch_application(String url) {	
		
		driver.get(url);
	}

	@Then("user validate the home page")
	public void user_validate_the_home_page() {
		WebElement d=driver.findElement(By.id("nav-logo"));
		String text1=d.getText();
		System.out.println("home page validated: "+text1);
				
	    
	}

	@Given("user clicks on All")
	public void user_clicks_on_All() {
		
	 //WebElement all = co.driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
	// all.click();
		co.clickAll(ad.getAll());
	    
	}
    
	@When("user selects Electronics")
	public void user_selects_Electronics() throws InterruptedException {
		Thread.sleep(5000);
		//WebElement el = co.driver.findElement(By.xpath("//li//a[@data-menu-id='5']"));	
		//el.click();
		co.clickEle(ad.getEl());
	    
	}

	@And("user selects Accessories and supplies")
	public void user_selects_Accessories_and_supplies() throws InterruptedException {
		Thread.sleep(5000);
		//WebElement ac = co.driver.findElement(By.xpath("(//a[text()='Accessories & Supplies'])[1]"));
		//co.click(ac);
		co.click(ad.getAc());
		
	    
	}
	
	@And("user clicks on any of the product")
	public void user_clicks_on_any_of_the_product() {
	   //WebElement prod = co.driver.findElement(By.xpath("(//span[@data-component-type=\"s-search-results\"]//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
	   //prod.click();
		co.clickPr(ad.getProd());
	}
	
	@When("user clicks on smart home")
	public void user_clicks_on_smart_home() throws InterruptedException {
		try {
		Thread.sleep(5000);
		co.click(ad.getSmart());
		}catch (Exception e) {
	}
	}

	@When("user selects smart home lighting")
	public void user_selects_smart_home_lighting() throws InterruptedException {
		Thread.sleep(5000);
		
		co.click(ad.getLighting());
		
	}

	@When("user selects smart home by category strip lighting")
	public void user_selects_smart_home_by_category_strip_lighting() {
		co.click(ad.getLights());
	    
	}

	@When("user clicks on item")
	public void user_clicks_on_item() {
		co.click(ad.getItems());
	    
	}
	
	@When("user clicks on computers")
	public void user_clicks_on_computers() throws InterruptedException {
		
		try {
			Thread.sleep(5000);
		co.click(ad.getComp());
		}catch (Exception e) {
		}
	    
	}

	@When("user selects laptop accessories")
	public void user_selects_laptop_accessories() throws InterruptedException {
		Thread.sleep(5000);
		co.click(ad.getLapAcc());
	    
	}

	@When("user clicks on products")
	public void user_clicks_on_products() {
		co.click(ad.getProd());
	    
	}
	
	@When("user clicks on see all")
	public void user_clicks_on_see_all() throws InterruptedException {
		try {
		Thread.sleep(5000);
		co.click(ad.getSeeAll());
		}catch (Exception e) {
			
		}
	    
	}

	@When("user selects movies and television")
	public void user_selects_movies_and_television() throws InterruptedException {
		try {
		Thread.sleep(5000);
		co.click(ad.getMo());
		}catch (Exception e) {
		}
	    
	}

	@When("user selects tv shows")
	public void user_selects_tv_shows() throws InterruptedException {
		Thread.sleep(5000);
		co.click(ad.getTv());
	   
	}

	@When("user clicks on shows")
	public void user_clicks_on_shows() throws InterruptedException {
		Thread.sleep(5000);
		co.click(ad.getShow());
	    
	}

	@When("user selects any of the show")
	public void user_selects_any_of_the_show() throws InterruptedException {
		try {
		Thread.sleep(5000);
		co.click(ad.getShows());
	}catch (Exception e) {
	}
	    
	}
      
	@When("user clicks on gift cards")
	public void user_clicks_on_gift_cards() throws InterruptedException {
		try {
		Thread.sleep(5000);
		co.click(ad.getGiftCard());
		}catch (Exception e) {
		}
	    
	}

	@When("user selects all gift cards")
	public void user_selects_all_gift_cards() throws InterruptedException {
		Thread.sleep(5000);
		co.click(ad.getAllGift());
	    
	}

	@When("user clicks on random card")
	public void user_clicks_on_random_card() {
		co.click(ad.getRandom());
	   
	}

	public void teardown() {
		 
        driver.quit();
    } 
   
}



