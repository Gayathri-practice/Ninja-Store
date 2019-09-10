package com.testCases.phptravels;

import java.io.IOException;

import org.testng.annotations.Test;

import com.testUtilities.phptravels.Config;

public class DocumentTest extends Config {
	
	@Test
	public void landingPage() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
}
