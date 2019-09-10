package com.pageObjects.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	public WebDriver driver;
	
	By product = By.xpath("//*[@id='ShopifyMainNav']/child::ul[2]/li[2]");
	MainPage(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getProduct() {
		return driver.findElement(product);
	}

}
