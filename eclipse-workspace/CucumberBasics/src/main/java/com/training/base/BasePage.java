package com.training.base;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	 WebDriver driver;
	public HashMap<String, By> ObjRep = new HashMap<String, By>();
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addObject(String logicalName, By by) {
		ObjRep.put(logicalName, by);
		
		
	}
	
	private WebElement getWebElement(String logicalName) {
		By by = ObjRep.get(logicalName);
		WebElement element = driver.findElement(by);
		return element;
		
	}
}
