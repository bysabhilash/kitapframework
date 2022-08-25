package com.kitap.testscripts;

import java.util.Hashtable;   

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KT1461
 * @date: 19/07/2022
 * @Description: This test script covers the creation of an Contracts CreationVia UI
 */

public class ContractsCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void ContractsCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("ContractsCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"ContractsCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        lightningloginpage.applauncher("Contract");
       
        contractpage.clicknewbutton("New");
 
        contractpage.selectaccountname("Account Name",data.get("accountname"));
        
        contractpage.selectcustomersignedby("Customer Signed By",data.get("customersname"));
        
        contractpage.setcustomersigntitle("Customer Signed Title",data.get("customersignedtitle"));
        
        contractpage.setcustomersigndate("Customer Signed Date",data.get("customersigndate"));
        
        contractpage.selectpricebooks("Price Book",data.get("booknames"));
        
        contractpage.selectstatus("Status",data.get("status"));
        
        contractpage.setcontractsigndate("Contract Start Date",data.get("contractsigndate"));
        
        contractpage.setcontractterm("Contract Term (months)",data.get("months"));
 
        contractpage.selectownerexpiratonnotice("Owner Expiration Notice",data.get("expirationnotice")); 
        
        contractpage.selectsignedperson("Company Signed By",data.get("companysignedperson"));
        
        contractpage.setcompanysigneddate("Company Signed Date",data.get("companysigneddate"));

        contractpage.setbillingstreet("Billing Street",data.get("streetname"));
        
        contractpage.setbillingcity("Billing City",data.get("cityname"));
        
        contractpage.setbillingstate("Billing State/Province",data.get("state"));
        
        contractpage.setbillingcode("Billing Zip/Postal Code",data.get("billingcode"));
        
        contractpage.setbillingcountry("Billing Country",data.get("country"));
        
        contractpage.setspecialterms("Special Terms",data.get("terms"));
        
        contractpage.setdescription("Description",data.get("description"));
   
        contractpage.clicksavebutton("Save");
    }
}
