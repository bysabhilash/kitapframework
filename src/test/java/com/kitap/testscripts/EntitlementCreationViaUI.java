package com.kitap.testscripts;

import java.util.Hashtable ;


import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class EntitlementCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void EntitlementCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("EntitlementCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"EntitlementCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        entitlementpage.clickninesymbol();
        
        entitlementpage.setText("Search apps and items...",data.get("Data_searchbar"));
        
        entitlementpage.Entitlement();
        
        entitlementpage.clicknewbutton("New");
        
        entitlementpage.setEntitlename("Entitlement Name", data.get("entitlementnames"));
        
        entitlementpage.settype("Type", data.get("type"));
        
        entitlementpage.setaccountname("Account Name",data.get("accountname"));
        
        entitlementpage.setassetname("Asset Name",data.get("assetname"));
        
        entitlementpage.clickincident("Per Incident");
        
        entitlementpage.setcasesentitlement("Cases Per Entitlement",data.get("cases"));
        
        entitlementpage.setstartdate("Start Date", data.get("startdate"));
        
        entitlementpage.setenddate("End Date", data.get("enddate"));
		
        entitlementpage.setremainingcases("Remaining Cases", data.get("remainingcases"));
		  
        entitlementpage.clicksavebutton("Save");

    }
}
