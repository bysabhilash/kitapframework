package com.kitap.pageobjects;

import java.util.List;    


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KITAP.SFPageBase;

public class EntitlementPage extends SFPageBase{
	 public EntitlementPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }
	 
	   @FindBy(xpath = "//div[@class='slds-icon-waffle']")
		private WebElement ninesymbol;
	 
	   @FindBy(xpath="//*[@id=\"Entitlement\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement clickEntitlement;

	    public void clickninesymbol() throws InterruptedException {
			SFClick(ninesymbol);
			 waitForSFPagetoLoad();
		}
	    
	    public void Entitlement() throws InterruptedException {
	    	
	    	SFClick(clickEntitlement);
	    	waitForSFPagetoLoad();

	    }
	    
	    public void clicknewbutton(String label) throws Exception {

	    	clickSFbutton(label);
	    	waitForSFPagetoLoad();
	    }

	    public void setEntitlename(String label,String data) throws Exception {

	    	setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }
		public void settype(String label,String data) throws Exception {

	    	   selectdropdown(label,data);
	    	   waitForSFPagetoLoad();
	    }
		 public void setaccountname(String label,String data) throws Exception {
			  selectcombobox(label, data);
			  waitForSFPagetoLoad();
	   }
		 
		 public void setassetname(String label,String data) throws Exception {
			 selectcombobox(label, data);
			  waitForSFPagetoLoad();
	   }
		 
		 public void clickincident(String label) throws Exception {

		    	click(label);
		    	   waitForSFPagetoLoad();

      }
	    public void setcasesentitlement(String label,String data) throws Exception {

	    	   settext1(label,data);
	    	   waitForSFPagetoLoad();

	    } 	   
	    public void setstartdate(String label,String data) throws Exception {

	    	   setinput(label,data);
	    	   waitForSFPagetoLoad();

	    }

		
		  public void setenddate(String label,String data) throws Exception {
		  
		  setinput(label,data);
		  waitForSFPagetoLoad();
		  
		  }
		    
	    public void setremainingcases(String label,String data) throws Exception {

	    	settext1(label,data);
	    	   waitForSFPagetoLoad();

	    }
	    public void clicksavebutton(String label) throws Exception {

	    	click(label);
	    	   waitForSFPagetoLoad();

	    }


}
