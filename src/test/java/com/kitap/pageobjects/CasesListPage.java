package com.kitap.pageobjects;

import org.openqa.selenium.By; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kitap.SFPageBase;

public class CasesListPage extends SFPageBase {
	
	 public CasesListPage(WebDriver webDriver) {
		    super(webDriver);
		    PageFactory.initElements(driver, this);
	  }

	public void enterCases(String label,String data) throws Exception {

		try {
			setText(label, data);
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	public void clicknew(String label) throws Exception {

		clickSFbutton(label);
		waitForSFPagetoLoad();
	}
	
	
	 public void setAccountname(String label,String data) throws Exception {
		 
		 selectcombobox(label, data);

	    }
	 
	 public void setcontactperson(String label,String data) throws Exception
	    {

		 selectcombobox(label, data);
	    }



	public void setStatus(String label,String data) throws Exception {

		try{
			selectOption(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}



	public void setPriority(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
			
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}


	public void setCaseOrigin(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setType(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setCaseReason(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setWebEmail(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setWebCompany(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}


	public void setWebName(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}


	public void setWebPhone(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setProduct(String label,String data) throws Exception {

		try{
			selectdropdown(label,data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setEngineeringReqNumber(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setPotentialityLiability(String label,String data) throws Exception {

		selectdropdown(label, data);
		
	}

	public void setSlaViolation(String label,String data) throws Exception {

		try{
			selectdropdown1(label,data);
			waitForSFPagetoLoad();
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setSubject(String label,String data) throws Exception {

		try {
			settext1(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}

	public void setDescription(String label,String data) throws Exception {

		try {
			setinput(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}


	public void setInternalCommands(String label,String data) throws Exception {

		try {
			setinput(label, data);
		}
		catch (Exception e)
		{
			System.out.println("In catch" +label);
		}
	}
	
	public void clicksave(String label) throws Exception {

		click(label);
		waitForSFPagetoLoad();
	}
	



}