package com.kitap.testscripts;
import java.util.Hashtable;
import org.testng.SkipException;
import org.testng.annotations.Test;
import com.kitap.base.BaseTest;

/*
 * @KTV1362
 * @date: 25/08/2022
 * @Description: This test script covers the creation of an hospital management via UI
 */

public class HospitalManagementCreationViaUI extends BaseTest {
    @Test(dataProviderClass = com.kitap.utilities.TestUtil.class, dataProvider = "dp")
    public void HospitalManagementCreationViaUI(Hashtable<String, String> data) throws Exception {

        if (!(com.kitap.utilities.TestUtil.isTestRunnable("HospitalManagementCreationViaUI", excel))) {

            throw new SkipException("Skipping the test " + "HospitalManagementCreationViaUI".toUpperCase() + "as the Run mode is NO");
        }
        lightningloginpage.openHomepage(SFBaseURL);

        lightningloginpage.login(SFUserId, SFPassword);

        hospitalmanagementlistpage.clickninesymbol();

        hospitalmanagementlistpage.enterHospitalManagement("Search apps and items...", data.get("Data_searchbar"));

        hospitalmanagementlistpage.clickHospitalManagement();

        hospitalmanagementlistpage.clickNew("New");

        hospitalmanagementlistpage.setHospitalName("Hospital Name", data.get("Hospital Name"));

        hospitalmanagementlistpage.setServices("Services", data.get("Services"));

        hospitalmanagementlistpage.setDoctorName("Doctor Name", data.get("Doctor Name"));

        hospitalmanagementlistpage.setConsultationFees("Consultation Fees", data.get("Consultation Fees"));

        hospitalmanagementlistpage.setTelephone("Telephone", data.get("Telephone"));

        hospitalmanagementlistpage.setPatientName("Patient Name", data.get("Patient Name"));

        hospitalmanagementlistpage.setPatientAddress("Patient Address", data.get("Patient Address"));

        hospitalmanagementlistpage.setEmail("Email", data.get("Email"));

        hospitalmanagementlistpage.setZipCode("Zip Code", data.get("Zip Code"));

        hospitalmanagementlistpage.setPhone("Phone", data.get("Phone"));

        hospitalmanagementlistpage.setCity("City", data.get("City"));
        
        hospitalmanagementlistpage.setdate("Date", data.get("date")); 

        hospitalmanagementlistpage.setState("State", data.get("State"));

        hospitalmanagementlistpage.enterExistingPatient("Existing Patient", data.get("Existing Patient"));

        hospitalmanagementlistpage.setPaymentMode("Payment Mode", data.get("Payment Mode"));

        hospitalmanagementlistpage.savebutton("Save");


    }
}
