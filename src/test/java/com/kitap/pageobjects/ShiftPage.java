package com.kitap.pageobjects;

import KITAP.SFPageBase;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class ShiftPage extends SFPageBase {


	    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
	    private WebElement ninesymbol;


	    @FindBy(xpath = "//*[@id=\"Shift\"]/div/lightning-formatted-rich-text/span/p/b")
	    private WebElement shifts;


	    public ShiftPage(WebDriver driver) {
	        super(driver);
	        PageFactory.initElements(driver, this);// Creates instance for all web elements
	    }
	
	
	public void clickninesymbol() {
        try {

            SFClick(ninesymbol);
        } catch (Exception e) {
            System.out.println("in catch");
        }
    }
	
	 public void entershift(String label, String data) throws Exception {

	        try {
	            setText(label, data);
	        } catch (Exception e) {
	            System.out.println("In catch" + label);
	        }
	    }
	 
	 public void clickshift() throws InterruptedException {

	        SFClick(shifts);

	        }
	 
	 public void clickNew(String lable) throws Exception {

	        clickSFbutton(lable);
	        waitForSFPagetoLoad();
   }
	 
	 public void setstarttime(String lable, String data) throws Exception {
	   try {
           setinput(lable, data);
       } catch (Exception e) {
           System.out.println("In catch" + lable);
       }
   }
	 
	 public void setendtime(String lable, String data) throws Exception {
		   try {
			   setinput(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 public void setstatus(String lable, String data) throws Exception {
		   try {
	           selectdropdown(lable, data);
	           waitForSFPagetoLoad();
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 public void settimeslottype(String lable, String data) throws Exception {
		   try {
	           selectdropdown(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	 public void enterworktypegroup(String label,String data) throws InterruptedException {
	    	try {
	        selectcombobox(label, data);      
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
	 
	 public void enterserviceterritory(String label,String data) throws InterruptedException {
	    	
	    	try {
	       selectcombobox(label, data);
	       
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
	 
	 public void enterserviceresource(String label,String data) throws InterruptedException {
	    	
	    	try {
	       selectcombobox(label, data);
	       
	      }
	    	 catch (Exception e)
			{
				System.out.println("In catch" );
			}

}
	 
	 public void setlabel(String lable, String data) throws Exception {
		   try {
	           settext1(lable, data);
	       } catch (Exception e) {
	           System.out.println("In catch" + lable);
	       }
	   }
	 
	  public void clicksave(String label) throws Exception {
          try {
              click(label);


          } catch (Exception e) {
              System.out.println("in catch" + label);
          }
      }
	 
	 
}