package com.kitap.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kitap.base.BaseTest;

import kitap.SFPageBase;


public class ReturnOrderListPage extends SFPageBase
{
    public  ReturnOrderListPage (WebDriver webDriver)
    {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="(//p[@class='slds-truncate'])[1]")
    private WebElement retunrOrder;

    public void clickninesymbol() throws InterruptedException {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    public void clickReturnOrder() throws InterruptedException {

        SFClick(retunrOrder);
        waitForSFPagetoLoad();
    }

    public void Newbutton() throws Exception {

        clickSFbutton("New");
        waitForSFPagetoLoad();
    }
    public void setCase(String data) throws InterruptedException {
        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Cases...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();
    }

    public void setAccount(String data) throws InterruptedException {
        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Accounts...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setPeople(String data) throws InterruptedException {
        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search People...']"));
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

    public void setContact(String data) throws InterruptedException {
        WebElement ele =driver.findElement(By.xpath("//input[@placeholder='Search Contacts...']"));
        ele.sendKeys(data);
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();

    }

    public void setSourceLocation() throws InterruptedException {
        WebElement ele=driver.findElement(By.xpath("(//span[text()='Source Location'])[2]//following::input[1]"));
        ele.sendKeys("test source location");
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();
    }

    public void setDestinationLocation() throws InterruptedException {
        WebElement ele=driver.findElement(By.xpath("//span[text()='Destination Location']//following::input[1]"));
        ele.sendKeys("test destination location");
        waitForSFPagetoLoad();
        ele.sendKeys(Keys.DOWN);
        ele.sendKeys(Keys.ENTER);
        waitForSFPagetoLoad();
    }

    public void setShipmenttype(String label,String data)
    {
        try{
            selectdropdown(label,data);
        }
        catch (Exception e)
        {
            System.out.println("in catch "+label);
        }

    }

    public void setAddress(String label, String data)
    {
        try{
            setinput(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setCity(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setStateorProvince(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setZiporPostal(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setCountry(String label, String data)
    {
        try{
            settext1(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setDate(String label, String data)
    {
        try{
            setText(label,data);
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void setDescription(String label, String data)
    {
        try{
            setinput(label,data);
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }

    }

    public void clicksave(String label)
    {
        try{
            click("Save");
            waitForSFPagetoLoad();
        }
        catch (Exception e)
        {
            System.out.println("In catch" +label);
        }
    }




}
