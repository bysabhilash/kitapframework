package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 23/08/2022
 * @Description: This test script covers the creation of an email templates via UI
 */

public class EmailTemplatesCreationViaUI extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void EmailTemplatesCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("EmailTemplatesCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "EmailTemplatesCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }

        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        emailTemplatesListPage.clickninesymbol();

        emailTemplatesListPage.enteremailtemplates("Search apps and items...", data.get("Data_searchbar"));

        emailTemplatesListPage.clickemailtemplates();

        emailTemplatesListPage.clicknewemailtemplate("New Email Template");

        emailTemplatesListPage.setemailtemplatename("Email Template Name", data.get("emailtemplatename"));

        emailTemplatesListPage.setDescription("Description", data.get("description"));

        emailTemplatesListPage.setrelatedentitytype("Related Entity Type", data.get("relatedentitytype"));

        emailTemplatesListPage.setfolder("Folder", data.get("folder"));

        emailTemplatesListPage.setsubject("Subject", data.get("subject"));

       emailTemplatesListPage.savebutton("Save");

    }
}
