package com.kitap.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.WebElement; 
 import org.openqa.selenium.support.FindBy; 
 import org.openqa.selenium.support.PageFactory;

import KITAP.SFPageBase;
 
 public class AssetPage extends SFPageBase {
 
	  public AssetPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	  
	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
		
		@FindBy(xpath = "//*[@id=\"Asset\"]/div/lightning-formatted-rich-text/span/p/b")
		private WebElement clickassets;
			
		
	    	    
	    public void clickninesymbol() throws InterruptedException {
			SFClick(ninesymbol);
			 waitForSFPagetoLoad();
		}

	    public void clickasset() throws InterruptedException {
	    	
	    	SFClick(clickassets);
	    	waitForSFPagetoLoad();
	    }
	    
	    public void clicknewbutton(String label) throws Exception {

	    	clickSFbutton(label);

	    }
	    
	    public void setassetname(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setserialnumber(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setinstalldate(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setstatus(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setquantity(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setprice(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setdescription(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void selectaccountname(String label,String data) throws Exception {
	         selectcombobox(label, data);
	      }
	    
	     public void selectcontactperson(String label,String data) throws Exception {
	    	 selectcombobox(label, data);
	      }
	    
			
			  public void setasset(String label) throws Exception {
			  
			  click(label);
			  
			  }
			 
	    
	    public void setpurchasedate(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void setusageenddate(String label,String data) throws Exception {

	    	   setText(label,data);

	    }
	    
	    public void clicksavebutton(String label) throws Exception {

	    	clickSFbutton(label);
	    	   waitForSFPagetoLoad();

	    }
 }


