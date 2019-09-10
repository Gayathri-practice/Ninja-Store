package com.testCases.phptravels;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import com.pageObjects.phptravels.CheckoutPage;
import com.pageObjects.phptravels.HomePage;
import com.testUtilities.phptravels.Config;
import com.testUtilities.phptravels.DataProviderSource;

public class AddItemToBasketAndRemoveTest extends Config {

	public String username, password, itemNum;
	HomePage hp;
	CheckoutPage cp;
	
	@Factory(dataProvider="Item-details", dataProviderClass=DataProviderSource.class)
	public AddItemToBasketAndRemoveTest(String item) {
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
		hp.getSearch().sendKeys(itemNum);
	}
	
	@Test(priority=3)
	public void addItemToBasket()
	{
		hp.doAddtoCart().click();
		String addItemConfirmText=hp.getaddItemSuccMsg().getText();
		Boolean itemAddedConfirm=addItemConfirmText.contains("Success");
		Assert.assertTrue(itemAddedConfirm,"Item is added to basket");
	}
	
	@Test(dependsOnMethods= {"addItemToBasket"},priority=4)
	public void itemCheckout() throws InterruptedException
	{	
		hp.getcartButton().click();
		hp.doCheckout().click();		
		cp=new CheckoutPage(driver);
		cp.getemail().clear();
		cp.getpassword().clear();
		cp.getemail().sendKeys("gayathricse516@gmail.com");
		cp.getpassword().sendKeys("Sai@04baba");
		cp.doLogin().click();
		Thread.sleep(2000);
	}
	
	@Test(priority=5)
	public void itemCancel() {
		clickOn(driver,hp.getcartButton(),10);
		cp.doItemCancel().click();
	}
	
	@Test(priority=6)
	public void goHomePage()
	{
		cp.continueBttn().click();	
	}
	
	@Test(priority=7)
	public void closeWindow()
	{
		driver.close();
	}
}
