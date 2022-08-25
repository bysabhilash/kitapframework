package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

public class CasesCreationViaUI extends BaseTest {
	
	@Test(dataProviderClass=com.kitap.utilities.TestUtil.class,dataProvider="dp")

	public void CasesCreationViaUI(Hashtable<String,String> data) throws Exception {
		
		if(!(com.kitap.utilities.TestUtil.isTestRunnable("CasesCreationViaUI", excel))){
			
			throw new SkipException("Skipping the test "+"CasesCreationViaUI".toUpperCase()+ "as the Run mode is NO");
		}
			
        lightningloginpage.openHomepage(SFBaseURL);
        lightningloginpage.login(SFUserId, SFPassword);
        lightningloginpage.applauncher("Case");
        casespage.clicknew("New");
        casespage.setStatus("Status",data.get("status"));
        casespage.setPriority("Priority",data.get("priority"));
        casespage.setCaseOrigin("Case Origin",data.get("caseorigin"));
        casespage.setAccountname("Account Name",data.get("accountname"));
        casespage.setcontactperson("Contact Name",data.get("contactname"));    
        casespage.setType("Type",data.get("type"));
        casespage.setCaseReason("Case Reason",data.get("casereason"));
        casespage.setWebEmail("Web Email",data.get("WebEmail"));
        casespage.setWebCompany("Web Company",data.get("Webcompany"));
        casespage.setWebName("Web Name",data.get("Webname"));
        casespage.setWebPhone("Web Phone",data.get("Webphone"));
        casespage.setProduct("Product",data.get("product"));
        casespage.setPotentialityLiability("Potential Liability",data.get("potentiality"));
        casespage.setEngineeringReqNumber("Engineering Req Number",data.get("EngineeringReqNumber"));
       // casespage.setSlaViolation("SLA Violation",data.get("violation"));
        casespage.setSubject("Subject",data.get("subject"));
        casespage.setDescription("Description",data.get("Description"));
        casespage.setInternalCommands("Internal Comments",data.get("InternalComments"));
        casespage.clicksave("Save");

    }
}
