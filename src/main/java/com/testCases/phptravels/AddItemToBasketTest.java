package com.testCases.phptravels;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.pageObjects.phptravels.CheckoutPage;
import com.pageObjects.phptravels.HomePage;
import com.testUtilities.phptravels.Config;
import com.testUtilities.phptravels.DataProviderSource;

public class AddItemToBasketTest extends Config {

	public String username, password, itemNum;
	HomePage hp;
	CheckoutPage cp;
	
	@Factory(dataProvider="Item-details", dataProviderClass=DataProviderSource.class)
	public AddItemToBasketTest(String item) {
		this.itemNum = item;
	}
	
	@Test(priority=1)
	public void landingPage() throws IOException, InterruptedException
	{
		driver=initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test(priority=2)
	public void productSearch()
	{
		hp=new HomePage(driver);
		if(itemNum.equals("iMac")) {
			hp.getSearch().sendKeys(itemNum);
			System.out.println("iMac Scenario");
		}
		else {
			hp.getSearch().sendKeys(itemNum);
			System.out.println("Nokia Scenario");
		}
		
	}
	
	@Test(priority=3)
	public void addItemToBasket()
	{
		hp.doAddtoCart().click();
		String addItemConfirmText=hp.getaddItemSuccMsg().getText();
		Boolean itemAddedConfirm=addItemConfirmText.contains("Success");
		Assert.assertTrue(itemAddedConfirm,"Item is added to basket");
	}
	
	@Test(priority=4, enabled = false)
	public void closeWindow()
	{
		driver.close();
	}
}
