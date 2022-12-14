package com.kitap.testscripts;

import org.json.JSONObject;  
import org.testng.annotations.Test;

import com.kitap.base.BaseTest;

import kitap.HTTPClientWrapper;


/**
 * @author KT1456
 * @date: 15/06/2021
 * @purpose: This test covers the creation of an account via APIs 👼
 */

public class AccountCreationViaAPIs extends BaseTest {

	@Test(priority = 1)
	public void LoginAndFetch() throws Exception {

		String uri = "/sobjects/Account/";
		// create the JSON object containing the new account details.
		JSONObject accountdata = new JSONObject();
		accountdata.put("Name", "AccountCreated_ByAPIs at " + lightningloginpage.getCurrentDateTimeStamp());

		JSONObject responseObject = HTTPClientWrapper.create_sObject(uri, accountdata);
		String accountID = responseObject.getString("id");
		System.out.println("Account created as : " + accountID);
	}
}
