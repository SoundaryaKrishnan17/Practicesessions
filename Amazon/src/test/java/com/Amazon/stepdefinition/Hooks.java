package com.Amazon.stepdefinition;

import Reusable.CommonFunction;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	CommonFunction co = new CommonFunction();
	
	@Before
	public void browserStart() {
		co.launchChromeBrowser();

}
	@After
	public void browserClose() {
		co.browserClose();
	}
}
