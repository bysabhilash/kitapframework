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
        ExtentManager.log("Starting CasesWarrantyClaimCreation ...");
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(data.get("username"), data.get("password"));
        casesserviceapproval.clickchildcase(SFPageBase.cases);
        Thread.sleep(2000);
        casesserviceapproval.clickcaseservice("Case Service Codes");
        casesserviceapproval.clicknew("New");
      //  casesserviceapproval.selectunit("AAH Label");
        Thread.sleep(2000);
        casesserviceapproval.setdescription("Description", "creating the cases service approval");
        casesserviceapproval.sethoursrequested("Hours Requested", data.get("Hours Requested"));
        casesserviceapproval.sethoursapproval("Labor Amount Requested", data.get("Labor Amount Requested"));
        casesserviceapproval.labouramountreq("Daikin Parts Amount Requested", data.get("Daikin Parts Amount Requested"));
        casesserviceapproval.labouramountapproval("Subcontractor Amount Requested", data.get("Subcontractor Amount Requested"));
       /* casesserviceapproval.daikinpartamountrequest("Additional Materials Amount Requested", data.get("Additional Materials Amount Approved"));
        casesserviceapproval.daikinpartamountapproved("Hours Approved", data.get("Hours Approved"));
        casesserviceapproval.subcontractamountrequest("Labor Amount Approved", data.get("Labor Amount Approved"));
        casesserviceapproval.subcontractamountapproved("Daikin Parts Amount Approved", data.get("Daikin Parts Amount Approved"));
        casesserviceapproval.materialsamountrequest("Subcontractor Amount Approved", data.get("SubContractor Amount Approved"));
        casesserviceapproval.materialsamountapproved("Additional Materials Amount Approved", data.get("Additional Materials Amount Approved"));*/
        Thread.sleep(5000);
        casesserviceapproval.clicksave();
        Thread.sleep(2000);
        casesserviceapproval.clickcasenumber(SFPageBase.cases);
        Thread.sleep(2000);
        casesserviceapproval.clickparentnumber("Parent Case");
        casesserviceapproval.clickbutton();
        casesserviceapproval.clicksubmitapprovalbutton();
        casesserviceapproval.comments("Comments", "submitting for approval");
        casesserviceapproval.submit("Submit");
        System.out.println("saved");
        casesserviceapproval.scrolling();
        casesserviceapproval.clickapprovalhistory("Approval History");
        casesserviceapproval.clickapprover("Eithne Shimasaki");
        Thread.sleep(2000);
        casesserviceapproval.clickuserdetail("User Detail");
        Thread.sleep(10000);
        casesserviceapproval.clicklogin();
        Thread.sleep(20000);
        casesserviceapproval.clicknotification("Notifications");
        casesserviceapproval.clickapprovalcase("Banu Ramamurthy is requesting approval for case");
        casesserviceapproval.clickapprovalstatus("Approve");
        casesserviceapproval.entercomments("Comments","approving the request");
        casesserviceapproval.Approve("Approve");
        casesserviceapproval.clicklogout("Log out as Eithne Shimasaki");
        Thread.sleep(5000);
    /*    casesserviceapproval.clickninesymbol();
        Thread.sleep(5000);
        casesserviceapproval.clickwarranty();
       casesserviceapproval.clickparentcases(data.get("casenumber"));
        casesserviceapproval.clickedit();
        casesserviceapproval.scroll();
        casesserviceapproval.scrolltoele();
        casesserviceapproval.selectstatus("Status", data.get("Status"));*/
        

    }
}
