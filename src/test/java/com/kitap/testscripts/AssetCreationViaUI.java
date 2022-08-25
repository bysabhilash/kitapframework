package com.kitap.testscripts;

import java.util.Hashtable ; 

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class AssetCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void AssetCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("AssetCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"AssetCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        
        lightningloginpage.login(SFUserId, SFPassword);
        
        lightningloginpage.applauncher("Asset");
        		
	    assetpage.clickninesymbol();
		  
	    assetpage.setText("Search apps and items...",data.get("Data_searchbar"));
		  
	    assetpage.clickasset();
		 
        assetpage.clicknewbutton("New");
        
        assetpage.setassetname("Asset Name", data.get("assetname"));
        
        assetpage.setserialnumber("Serial Number",data.get("serialnumber"));
        
        assetpage.setinstalldate("Install Date",data.get("installdate"));
        
        assetpage.setstatus("Status",data.get("status"));
        
        assetpage.setquantity("Quantity", data.get("quantity"));
        
        assetpage.setprice("Price", data.get("price"));
		
        assetpage.setdescription("Description", data.get("description"));
		  
        assetpage.selectaccountname("Account",data.get("accountname"));
	        		  
        assetpage.selectcontactperson("Contact",data.get("contactperson"));
		  
        assetpage.setasset("Competitor Asset");
		  
        assetpage.setpurchasedate("Purchase Date", data.get("purchasedate"));
		  
        assetpage.setusageenddate("Usage End Date", data.get("enddate"));
		  
        assetpage.clicksavebutton("Save");
        
       
		
    }
}
