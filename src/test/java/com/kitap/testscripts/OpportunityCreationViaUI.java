package com.kitap.testscripts;


import java.util.Hashtable;    

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1444
 * @date: 22/07/2022
 * @Description: This test script covers the creation of an opportunityCreation via UI
 */

public class OpportunityCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void OpportunityCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("OpportunityCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"OpportunityCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        lightningloginpage.applauncher("Opportunity");
       
        opportunitypage.clicknewbutton("New");
        
        opportunitypage.clickprivate("Private");
        
        opportunitypage.setopportunityname("Opportunity Name",data.get("opportunitiesname"));
        
        opportunitypage.selectaccountname("Account Name",data.get("accountname"));
        
        opportunitypage.selectcustomertype("Type",data.get("type"));
        
        opportunitypage.selectlead("Lead Source",data.get("leadsource"));
        
        opportunitypage.setamount("Amount",data.get("amount"));
        
        opportunitypage.setnextstep("Next Step",data.get("nextstep"));
        
        opportunitypage.selectstage("Stage",data.get("stage"));
        
        opportunitypage.setdate("Close Date",data.get("date"));
        
        opportunitypage.selectcampaignsource("Primary Campaign Source",data.get("campaignsource")); 
        
        opportunitypage.setordernumber("Order Number",data.get("ordernumbers"));
        
        opportunitypage.setgeneratorname("Current Generator(s)",data.get("currentgenerators"));

        opportunitypage.settracknumber("Tracking Number",data.get("trackingid"));
        
        opportunitypage.setcompetitorname("Main Competitor(s)",data.get("competitors"));
        
        opportunitypage.selectdeliverystatus("Delivery/Installation Status",data.get("deliverystatus"));
        
        opportunitypage.setdescription("Description",data.get("Description"));
            
        opportunitypage.clicksavebutton("Save");
    }
}



