package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import KITAP.SFPageBase;


public class AlternativePaymentListPage extends SFPageBase
{

    public AlternativePaymentListPage(WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()='Alternative Payment Methods']")
    private WebElement alternativepayments;

    public void clickninesymbol() throws InterruptedException
    {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    public void clickAlternativepayments() throws InterruptedException
    {

        SFClick(alternativepayments);
        waitForSFPagetoLoad();
    }

    public void Newbutton() throws Exception
    {

        clickSFbutton("New");
        waitForSFPagetoLoad();
    }

    public void setNickname(String label,String data) throws Exception
    {

        try{
        setinput(label,data);
    }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
   }

   public void setRegisterdEmail(String label, String data)
   {
       try {
           settext1(label,data);
       }
       catch (Exception e)
       {
           System.out.println("in catch" +label);
       }
   }

    public void setAccount(String data) throws InterruptedException {
        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setStatus(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setProcessingmode(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setAutopay(String label)
    {
        try{
            click(label);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setGatewayToken(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setGatewayTokenDetails(String label,String data)
    {
        try {
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setCompanyname(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setStreet(String label,String data)
    {
        try {
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setCity(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setState(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setPostalCode(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setcountry(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setComments(String label,String data)
    {
        try {
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setMACAddress(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setIPAddress(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setPhone(String label,String data)
    {
        try {
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void setAuditEmail(String label,String data)
    {
        try {
            settext1(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("in catch" +label);
        }
    }

    public void clicksave(String label)
    {
        try{
            click(label);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }

}
