package com.testUtilities.phptravels;

import org.testng.annotations.DataProvider;

public class DataProviderSource {

	@DataProvider(name="Item-details")
	public Object[][] getLoginDetails(){
		return new Object[][] {{"iMac"},
							   {"Nikon D300"}};
	}
}
