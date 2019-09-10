package com.pageObjects.phptravels;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	By searchTxtBox=By.xpath("//input[@placeholder='Search']");
	By addToCart=By.xpath("//*[@class='button-group']/child::button[1]");
	By addItemSuccMsg=By.xpath("//*[@class='alert alert-success alert-dismissible']");
	By cartButton=By.cssSelector("#cart");
	By checkout=By.xpath("//*[@class='text-right']/child::a[2]");
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getSearch()
	{
		return driver.findElement(searchTxtBox);
	}
	public WebElement doAddtoCart()
	{
		return driver.findElement(addToCart);
	}
	public WebElement getaddItemSuccMsg()
	{
		return driver.findElement(addItemSuccMsg);
	}
	public WebElement getcartButton()
	{
		return driver.findElement(cartButton);
	}
	public WebElement doCheckout()
	{
		return driver.findElement(checkout);
	}
	
}
