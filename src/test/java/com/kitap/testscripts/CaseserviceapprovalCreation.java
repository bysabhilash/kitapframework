package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;
import com.kitap.utilities.ExtentManager;

import kitap.SFPageBase;

public class CaseserviceapprovalCreation extends BaseTest {

    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")

    public void CaseserviceapprovalCreation(Hashtable<String, String> data) throws Throwable {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("CaseserviceapprovalCreation", excel))) {

            throw new SkipException("Skipping the test " + "CaseserviceapprovalCreation".toUpperCase() + "as the Run mode is NO");
        }
        ExtentManager.log("Starting CaseserviceapprovalCreation ...");
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(data.get("username"), data.get("password"));
        casesserviceapproval.clickchildcase(SFPageBase.cases);
        casesserviceapproval.clickcaseservice("Case Service Codes");
        casesserviceapproval.clicknew("New");
        casesserviceapproval.setdescription("Description", "creating the cases service approval");
        casesserviceapproval.sethoursrequested("Hours Requested", data.get("Hours Requested"));
        casesserviceapproval.sethoursapproval("Labor Amount Requested", data.get("Labor Amount Requested"));
        casesserviceapproval.labouramountreq("Daikin Parts Amount Requested", data.get("Daikin Parts Amount Requested"));
        casesserviceapproval.labouramountapproval("Subcontractor Amount Requested", data.get("Subcontractor Amount Requested"));       
        casesserviceapproval.clicksave();       
        casesserviceapproval.clickcasenumber(SFPageBase.cases);        
        casesserviceapproval.clickparentnumber("Parent Case");
        casesserviceapproval.clickbutton();
        casesserviceapproval.clicksubmitapprovalbutton();
        casesserviceapproval.comments("Comments", "submitting for approval");
        casesserviceapproval.submit("Submit");
        casesserviceapproval.scrolling();
        casesserviceapproval.clickapprovalhistory("Approval History");
        casesserviceapproval.clickapprover("Eithne Shimasaki");        
        casesserviceapproval.clickuserdetail("User Detail");       
        casesserviceapproval.clicklogin();
        Thread.sleep(15000);
        casesserviceapproval.clicknotification("Notifications");
        casesserviceapproval.clickapprovalcase("Banu Ramamurthy is requesting approval for case");
        casesserviceapproval.clickapprovalstatus("Approve");
        casesserviceapproval.entercomments("Comments","approving the request");
        casesserviceapproval.Approve("Approve");
        casesserviceapproval.clicklogout("Log out as Eithne Shimasaki");
        
        

    }
}
