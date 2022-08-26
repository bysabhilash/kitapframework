package com.kitap.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import kitap.SFPageBase;

      /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
     */
public class StreamingChannelsListPage extends SFPageBase {

          public StreamingChannelsListPage(WebDriver webDriver) {
              super(webDriver);
              PageFactory.initElements(driver, this);
          }
          @FindBy(xpath = "//div[@class='slds-icon-waffle']")
          private WebElement ninesymbol;

          @FindBy(xpath="//b[normalize-space()=\"Streaming Channels\"]")
          private WebElement clickStreamingChannels;

          /*
     @KTV1296
     @date: 22/08/2022
     @Description: This page object covers methods for all the fields in the Streaming channels
    */
          public void clickninesymbol() throws InterruptedException {
              SFClick(ninesymbol);
              waitForSFPagetoLoad();
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
     */

          public void enterStreamingChannels(String label, String targetvalue) throws Exception {

              try {

                  setText(label,targetvalue);
                  waitForSFPagetoLoad();
              }
              catch (Exception e)
              {
                  System.out.println("In catch" +label);
              }
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
     */

          public void clickStreamingChannels() throws InterruptedException {

              SFClick(clickStreamingChannels);
              waitForSFPagetoLoad();
          }

     /*
      @KTV1296
      @date: 22/08/2022
      @Description: This page object covers methods for all the fields in the Streaming channels
     */

          public void Newbutton() throws Exception {

              clickSFbutton("New");
              waitForSFPagetoLoad();
          }
          /*
           @KTV1296
           @date: 22/08/2022
           @Description: This page object covers methods for all the fields in the Streaming channels
          */
          public void ChannelName(String label, String targetvalue) throws Exception {

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
      @Description: This page object covers methods for all the fields in the Streaming channels
     */

          public void Description(String label, String targetvalue) throws Exception {

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
      @Description: This page object covers methods for all the fields in the Streaming channels
     */

          public void clicksavebutton(String label) throws Exception {

              click(label);
              waitForSFPagetoLoad();

          }
      }
