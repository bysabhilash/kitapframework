package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

    /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in salesforce of sellers
     */

public class SellersListPage extends SFPageBase {

    public SellersListPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='slds-icon-waffle']")
    private WebElement ninesymbol;

    @FindBy(xpath="//b[normalize-space()=\"Sellers\"]")
    private WebElement sellers;
     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in salesforce of sellers
     */

    public void clickninesymbol() throws InterruptedException {
        SFClick(ninesymbol);
        waitForSFPagetoLoad();
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
    */
    public void enterSellers(String label, String data) throws Exception {

        try {
            setText(label, data);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
    */
    public void ClickSellers() throws InterruptedException {

        SFClick(sellers);
        waitForSFPagetoLoad();
    }

    /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in salesforce of sellers
    */
    public void Newbutton() throws Exception {

        clickSFbutton("New");
        waitForSFPagetoLoad();
    }

    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
        */
    public void selectParty(String label, String targetvalue) throws Exception {
        try {
            selectcombobox(label, targetvalue);
        } catch (Exception e) {
            System.out.println("Sent values as " + targetvalue);
        }
    }
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
        */
    public void setName(String label, String targetvalue) throws Exception {

        try {
            setinput(label, targetvalue);
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
        */
    public void sellerType(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }

    /*
  @KTV1296
  @date: 22/08/2022
  @Description: This page object covers methods for all the fields in salesforce of sellers
 */
    public void sellerTier(String lable, String data) throws Exception {
        try {
            selectdropdown(lable, data);
        } catch (Exception e) {
            System.out.println("In catch" + lable);
        }
    }
    /*
         @KTV1296
         @date: 22/08/2022
         @Description: This page object covers methods for all the fields in salesforce of sellers
        */
    public void SalesAmount(String label, String targetvalue) throws Exception {
        try {
            setinput(label, targetvalue);
            waitForSFPagetoLoad();
        } catch (Exception e) {
            System.out.println("In catch" + label);
        }
    }

    /*
    @KTV1296
    @date: 22/08/2022
    @Description: This page object covers methods for all the fields in salesforce of sellers
   */
    public void clicksavebutton(String label) throws Exception {

        click(label);
        waitForSFPagetoLoad();

    }

}

