package com.kitap.testscripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import java.util.Hashtable;

public class QuickTextCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void QuickTextCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("QuickTextCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "QuickTextCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        quicktextlistpage.clickninesymbol();
        quicktextlistpage.enterQuicktext("Search apps and items...", data.get("Data_searchbar"));
        quicktextlistpage.clickQuickText();
        quicktextlistpage.clickNewQuickText("New Quick Text");
        quicktextlistpage.setQuickTextName("Quick Text Name",data.get("Quick Text Name"));
        quicktextlistpage.RelatedTo("Related To",data.get("Choose"));
        quicktextlistpage.Field("Field",data.get("Field"));
        quicktextlistpage.clickInsert("Insert");
        quicktextlistpage.selectCategory("Category",data.get("Category"));
        quicktextlistpage.clickInclude("Include in selected channels");
        quicktextlistpage.clicksave("Save");
    }
}
