package com.zoho.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pom.CampaignPage;

public class Darshan extends BaseClass{

	@Test
	public void createcampin() throws InterruptedException {
		Reporter.log("created", true);
		CampaignPage cp = new CampaignPage(driver);
		cp.getNewCampaignBt().click();		

}}
