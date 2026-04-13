package com.zoho.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pom.CampaignPage;
import com.zoho.pom.HomePage;

public class nidhi extends BaseClass {
	@Test
	public void createcampin() throws InterruptedException {
		Reporter.log("created", true);
		HomePage h = new HomePage(driver);
		h.getCampaign().click();
		
		CampaignPage cp = new CampaignPage(driver);
		cp.getNewCampaignBt().click();
		
	

}
}
