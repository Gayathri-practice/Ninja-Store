package com.pageObjects.phptravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {

	public WebDriver driver;
	By email=By.cssSelector("#input-email");
	By password=By.cssSelector("#input-password");
	By login=By.cssSelector("#button-login");
	By addrConfirm=By.cssSelector("#button-payment-address");
	By shippingAddrConfirm=By.cssSelector("#button-shipping-address");
	By shippingMethodConfirm=By.cssSelector("#button-shipping-method");
	By shippingRate=By.xpath("//div[@id='collapse-shipping-method']//label");
	By paymentMethodWarning=By.xpath("//div[@id='collapse-payment-method'] //div[@class='alert alert-warning alert-dismissible']");
	By contactUsLink=By.partialLinkText("contact us");
	By paymentRadioBttn=By.xpath("//div[@id='collapse-payment-method']//label");
	By acceptTC=By.xpath("//input[@type='checkbox']");
	By paymentMethodConfirm=By.cssSelector("#button-payment-method");
	By confirmOrder=By.cssSelector("#button-confirm");
	By Checkout=By.xpath("//span[contains(text(),'Checkout')]");
	By itemCancel = By.xpath("//button[@title='Remove']");
	By continueBttn = By.xpath("//a[@class='btn btn-primary']");
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement doLogin()
	{
		return driver.findElement(login);
	}
	public WebElement getaddrConfirm()
	{
		return driver.findElement(addrConfirm);
	}
	public WebElement getshippingAddrConfirm()
	{
		return driver.findElement(shippingAddrConfirm);
	}
	public WebElement getshippingMethodConfirm()
	{
		return driver.findElement(shippingMethodConfirm);
	}
	public WebElement getshippingRate()
	{
		return driver.findElement(shippingRate);
	}
	public WebElement getacceptTC()
	{
		return driver.findElement(acceptTC);
	}
	public WebElement getpaymentMethodConfirm()
	{
		return driver.findElement(paymentMethodConfirm);
	}
	public WebElement getconfirmOrder()
	{
		return driver.findElement(confirmOrder);
	}
	public WebElement getPaymentWarning()
	{
		return driver.findElement(paymentMethodWarning);
	}
	public WebElement getpaymentRadioBttn()
	{
		return driver.findElement(paymentRadioBttn);
	}
	public WebElement getcontactUsLink()
	{
		return driver.findElement(contactUsLink);
	}
	public WebElement doCheckOut()
	{
		return driver.findElement(Checkout);
	}
	public WebElement doItemCancel() {
		return driver.findElement(itemCancel);
	}
	public WebElement continueBttn() {
		return driver.findElement(continueBttn);
	}
}
