package com.kitap.base;

import java.io.File;      
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.util.UserDataAttribute;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.kitap.pageobjects.AccountListPage;
import com.kitap.pageobjects.AlternativePaymentListPage;
import com.kitap.pageobjects.AssetPage;
import com.kitap.pageobjects.BankingManagementListPage;
import com.kitap.pageobjects.CampaignsPage;
import com.kitap.pageobjects.CardPaymentMethodListPage;
import com.kitap.pageobjects.CasesListPage;
import com.kitap.pageobjects.ChangeRequestListPage;
import com.kitap.pageobjects.ContactListPage;
import com.kitap.pageobjects.ContactRequestListPage;
import com.kitap.pageobjects.ContractsPage;
import com.kitap.pageobjects.EmailTemplatesListPage;
import com.kitap.pageobjects.EntitlementPage;
import com.kitap.pageobjects.FinanceTransactionListPage;
import com.kitap.pageobjects.HospitalManagementListPage;
import com.kitap.pageobjects.ImagesListPage;
import com.kitap.pageobjects.IncidentPage;
import com.kitap.pageobjects.LeadsListPage;
import com.kitap.pageobjects.LightningLoginPage;
import com.kitap.pageobjects.LocationGroupsListPage;
import com.kitap.pageobjects.Operatinghours;
import com.kitap.pageobjects.Opportunitypagelist;
import com.kitap.pageobjects.OrderListPage;
import com.kitap.pageobjects.PartyConsentListPage;
import com.kitap.pageobjects.PaymentLineInvoiceListPage;
import com.kitap.pageobjects.PaymentPage;
import com.kitap.pageobjects.ProblemsPage;
import com.kitap.pageobjects.ProcessExceptionListPage;
import com.kitap.pageobjects.ProductListPage;
import com.kitap.pageobjects.QuickTextListPage;
import com.kitap.pageobjects.RefundPage;
import com.kitap.pageobjects.ReturnOrderListPage;
import com.kitap.pageobjects.ScoreCardsListPage;
import com.kitap.pageobjects.SellersListPage;
import com.kitap.pageobjects.ServiceAppointmentListPage;
import com.kitap.pageobjects.ServiceContractListPage;
import com.kitap.pageobjects.ServiceTerritoriesListPage;
import com.kitap.pageobjects.ShiftPage;
import com.kitap.pageobjects.StreamingChannelsListPage;
import com.kitap.pageobjects.WorkOrdersListPage;
import com.kitap.pageobjects.WorkPlanTemplatesListPage;
import com.kitap.pageobjects.WorkStepTemplatesListPage;
import com.kitap.pageobjects.Worktype;
import com.kitap.utilities.ExcelReader;

import kitap.GetSFApps;
import kitap.HTTPClientWrapper;
import kitap.PageBase;

/*@author: KT1456 
@Date: 22/06/2022
@Description: All the test classes extend this base test , so as to carry forward the abstraction for page objects , webdriver setup and TEstNG level methods
*/

public class BaseTest implements PropertyReader {

	public static final Logger logger = LogManager.getLogger(BaseTest.class);

	private static final String InstalledVersionDetailPage = null;

	protected static WebDriver driver;

	protected static Actions action;
	protected LightningLoginPage lightningloginpage;
	protected AccountListPage accountlistpage;
	protected CampaignsPage campaignlistpage;
	protected Opportunitypagelist opportunitypage;
	protected LeadsListPage leadspage;
	protected ContactListPage contactpage;
	protected CasesListPage casespage;
	protected ProblemsPage problemspage;
	protected IncidentPage incidentpage;
	protected EntitlementPage entitlementpage;
	protected RefundPage refundpage;
	protected ContractsPage contractpage;
	protected AssetPage assetpage;
	protected PaymentPage paymentpage;
	protected AlternativePaymentListPage alternativepaymentlistpage;
	protected OrderListPage orderlistpage;
	protected ProductListPage productlistpage;
	protected ReturnOrderListPage returnorderlistpage;
	protected FinanceTransactionListPage financetransactionlistpage;
	protected WorkOrdersListPage workorder;
	protected PaymentLineInvoiceListPage paymentlineinvoicelistpage;
	protected ServiceAppointmentListPage serviceappointmentlistpage;
	protected ServiceTerritoriesListPage serviceterritorylistpage;
	protected ChangeRequestListPage changerequestlistpage;
	protected ProcessExceptionListPage processexceptionlistpage;
	protected ServiceContractListPage servicecontractlistpage;
	protected PartyConsentListPage partyconsentlistpage;
	protected QuickTextListPage quicktextlistpage;
	protected ShiftPage shiftpage;
	protected Operatinghours operatinghours;
	protected EmailTemplatesListPage emailTemplatesListPage;
	protected BankingManagementListPage bankingmanagement;
	protected Worktype worktype;
	protected CardPaymentMethodListPage cardpaymentmethodlistpage;
	protected ContactRequestListPage contactRequestListPage;
	protected LocationGroupsListPage locationGroupsListPage;
	protected ImagesListPage imageslistpage;
	protected ScoreCardsListPage scoreCardsListPage;
	protected SellersListPage sellerslistpage;
	protected WorkPlanTemplatesListPage workPlanTemplatesListPage;
	protected WorkStepTemplatesListPage worksteptemplateslistpage;
	protected StreamingChannelsListPage streamingchannelslistpage;
	protected HospitalManagementListPage hospitalmanagementlistpage;
	
	public static String SFBaseURL; 

	protected static PageFactory pageFactory = null;
	protected Properties staticData = getStaticData();
	protected URL huburl = null;
	protected static EmailUtils emailUtils;

	public static String env;
	public static String SFUserId;
	public static String SFPassword;
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\sales_data.xlsx");
	

	
	final String SFAPIUSERNAME_UAT ="bysani@gmail.com"; 

	final String SFAPITOKEN_UAT = "I9AIshlr6hhpSvjnLIVjIcaC";

	final String SFAPIPASSWORDSTRING_UAT = "Jasper@143";

	
	final String SFAPIPASSWORD_UAT = SFAPIPASSWORDSTRING_UAT + SFAPITOKEN_UAT;

	final String SFAPILOGINURL_UAT = "https://login.salesforce.com";

	final String SFAPIGRANTSERVICE = "/services/oauth2/token?grant_type=password";
	
	final String SFAPICLIENTID_UAT = "3MVG9wt4IL4O5wvJDX6vb.R03mGn9j3rLMzlv7pROG43Wb.GneMhap2V3StPGK5igTw5lcXWH3FraHmVA6r9N";

	
	final String SFAPICLIENTSECRET_UAT = "6F05BBA5798E268DB8D5706913D359787E43A97285F4968934DEA67125028F2D";

	@BeforeSuite(alwaysRun = true)
	@Parameters({ "browserType" })
	public void setupWebDriver(@Optional("edge") String browserType) throws IOException, InterruptedException {
		
		readConfigJsonFile();

		if ((driver == null)) {
			logger.info("setupWebDriver()");
			driver = WebDriverFactory.createInstance(huburl, browserType);
			action = new Actions(driver);
			pageFactory = new PageFactory(driver);

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			System.out.println("Window width: " + driver.manage().window().getSize().getWidth());
			System.out.println("Window height: " + driver.manage().window().getSize().getHeight());
			
		}
	}
	
	/*@author: KT1456 
	@Date: 22/06/2022
	@Description: Here the commonly used Test data is read from the config.json file
			       UAT stands for User Acceptance Testing and is a short hand for the
			      environment name. Similarly it can be PROD, Sandbox etc
	*/

	private void readConfigJsonFile() {
		{ 

			try {

				String sPath = new java.io.File(".").getCanonicalPath();
				Log.info("Path: " + sPath);
				File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
						+ "resources" + File.separator + "config.json");
				String salesforce_Lighteningenv = "Salesforce_Lightening";

				Log.info("Reading Environment variables from json file");

				env = (env == null) ? salesforce_Lighteningenv : env;

				SFBaseURL = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.homePage");
				SFUserId = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.userId");
				SFPassword = (String) JsonPath.read(jsonFile, "$.environments." + env + ".UAT.passwd");

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
	

	public void openHomepage(String homepageURL) {
		driver.get(homepageURL);

		System.out.println("Opened URL : " + homepageURL);
	}

	protected void writeDynamicJsonFile(String path, String value) {
		try {

			String sPath = new java.io.File(".").getCanonicalPath();
			Log.info("Path: " + sPath);
			File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "dynamicdata.json");

			Log.info("Writing URL variables to json file");

			DocumentContext doc = JsonPath.parse(jsonFile).

					set(path, value);

			JsonObject jsonObj = new GsonBuilder().create().toJsonTree(doc.json()).getAsJsonObject();
			FileWriter file = new FileWriter(jsonFile);
			String a = jsonObj.toString();
			file.write(a);
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String readDynamicJsonFile(String path) {
		try { 

			String sPath = new java.io.File(".").getCanonicalPath();
			Log.info("Path: " + sPath);
			File jsonFile = new File(sPath + File.separator + "src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "dynamicdata.json");

			Log.info("Reading variables from json file");
			return (String) JsonPath.read(jsonFile, path);

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	@BeforeTest(alwaysRun = true)
	public void cleanTestSetup() {
		driver.manage().deleteAllCookies();
	}

	@BeforeClass(alwaysRun = true)
	protected void setUp() throws MessagingException {

		
		HTTPClientWrapper.SFLogin_API(SFAPILOGINURL_UAT, SFAPIGRANTSERVICE, SFAPICLIENTID_UAT, SFAPICLIENTSECRET_UAT,
				SFAPIUSERNAME_UAT, SFAPIPASSWORD_UAT);
		

		lightningloginpage = (LightningLoginPage) pageFactory.getPageObject(LightningLoginPage.class.getName());
		accountlistpage = (AccountListPage) pageFactory.getPageObject(AccountListPage.class.getName());
		campaignlistpage = (CampaignsPage)pageFactory.getPageObject(CampaignsPage.class.getName());
		opportunitypage = (Opportunitypagelist)pageFactory.getPageObject(Opportunitypagelist.class.getName());
		leadspage = (LeadsListPage)pageFactory.getPageObject(LeadsListPage.class.getName());
		casespage = (CasesListPage)pageFactory.getPageObject(CasesListPage.class.getName());
		contactpage = (ContactListPage)pageFactory.getPageObject(ContactListPage.class.getName());
		problemspage = (ProblemsPage)pageFactory.getPageObject(ProblemsPage.class.getName());
		incidentpage = (IncidentPage)pageFactory.getPageObject(IncidentPage.class.getName());
		entitlementpage = (EntitlementPage)pageFactory.getPageObject(EntitlementPage.class.getName());
		refundpage = (RefundPage)pageFactory.getPageObject(RefundPage.class.getName());
		contractpage = (ContractsPage)pageFactory.getPageObject(ContractsPage.class.getName());
		assetpage = (AssetPage)pageFactory.getPageObject(AssetPage.class.getName());
		paymentpage = (PaymentPage)pageFactory.getPageObject(PaymentPage.class.getName());
		alternativepaymentlistpage = (AlternativePaymentListPage)pageFactory.getPageObject(AlternativePaymentListPage.class.getName());
		orderlistpage = (OrderListPage)pageFactory.getPageObject(OrderListPage.class.getName());
		productlistpage = (ProductListPage)pageFactory.getPageObject(ProductListPage.class.getName());
		returnorderlistpage = (ReturnOrderListPage)pageFactory.getPageObject(ReturnOrderListPage.class.getName());
		financetransactionlistpage  = (FinanceTransactionListPage)pageFactory.getPageObject(FinanceTransactionListPage.class.getName());
		paymentlineinvoicelistpage  = (PaymentLineInvoiceListPage)pageFactory.getPageObject(PaymentLineInvoiceListPage.class.getName());
		serviceappointmentlistpage  = (ServiceAppointmentListPage)pageFactory.getPageObject(ServiceAppointmentListPage.class.getName());
		serviceterritorylistpage   = (ServiceTerritoriesListPage)pageFactory.getPageObject(ServiceTerritoriesListPage.class.getName());
		changerequestlistpage = (ChangeRequestListPage)pageFactory.getPageObject(ChangeRequestListPage.class.getName());
		processexceptionlistpage = (ProcessExceptionListPage)pageFactory.getPageObject(ProcessExceptionListPage.class.getName());
		servicecontractlistpage = (ServiceContractListPage)pageFactory.getPageObject(ServiceContractListPage.class.getName());
		partyconsentlistpage = (PartyConsentListPage)pageFactory.getPageObject(PartyConsentListPage.class.getName());
		workorder  = (WorkOrdersListPage)pageFactory.getPageObject(WorkOrdersListPage.class.getName());
		quicktextlistpage = (QuickTextListPage)pageFactory.getPageObject(QuickTextListPage.class.getName());
		shiftpage = (ShiftPage)pageFactory.getPageObject(ShiftPage.class.getName());
		operatinghours = (Operatinghours)pageFactory.getPageObject(Operatinghours.class.getName());
		emailTemplatesListPage = (EmailTemplatesListPage)pageFactory.getPageObject(EmailTemplatesListPage.class.getName());
		worktype = (Worktype)pageFactory.getPageObject(Worktype.class.getName());
		bankingmanagement = (BankingManagementListPage)pageFactory.getPageObject(BankingManagementListPage.class.getName());
		cardpaymentmethodlistpage = (CardPaymentMethodListPage)pageFactory.getPageObject(CardPaymentMethodListPage.class.getName());
		imageslistpage = (ImagesListPage)pageFactory.getPageObject(ImagesListPage.class.getName());
		streamingchannelslistpage = (StreamingChannelsListPage)pageFactory.getPageObject(StreamingChannelsListPage.class.getName());
		sellerslistpage = (SellersListPage)pageFactory.getPageObject(SellersListPage.class.getName());
		worksteptemplateslistpage = (WorkStepTemplatesListPage)pageFactory.getPageObject(WorkStepTemplatesListPage.class.getName());
		contactRequestListPage = (ContactRequestListPage)pageFactory.getPageObject(ContactRequestListPage.class.getName());
		scoreCardsListPage = (ScoreCardsListPage)pageFactory.getPageObject(ScoreCardsListPage.class.getName());
		locationGroupsListPage = (LocationGroupsListPage)pageFactory.getPageObject(LocationGroupsListPage.class.getName());
		workPlanTemplatesListPage = (WorkPlanTemplatesListPage)pageFactory.getPageObject(WorkPlanTemplatesListPage.class.getName());
		hospitalmanagementlistpage = (HospitalManagementListPage)pageFactory.getPageObject(HospitalManagementListPage.class.getName());
	}                                                           
	
	/*@author: KT1456 
	@Date: 22/06/2022
	@Description:  Method for taking screenshots on  failure of the test case
																					
	*/


	@AfterMethod(alwaysRun = true)
	public void tearDownandCaptureScreenShot(Method method, ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
				String currentdatetime = simpleDateFormat.format(new Date());
				File source = captureScreenShot();
				FileUtils.copyFile(source, new File(System.getProperty("user.dir")
						+ "/target/surefire-reports/FailedScreenShots/" + result.getName() + currentdatetime + ".png"));
				Reporter.log("Screenshot taken");
			} catch (Exception e) {

				Reporter.log("Exception while taking screenshot " + e.getMessage());
			}
		}
		logger.info("*************");
		logger.info("Ending Test  ---->" + method.getName());

	}

	public File captureScreenShot() {
		return new PageBase(driver).takeScreenshot();
	}

	@AfterClass(alwaysRun = true)
	public void deleteAllCookies() {
		
		HTTPClientWrapper.SFLogout_API();

		
		try {

			String originalHandle = driver.getWindowHandle();

			for (String handle : driver.getWindowHandles()) {
				if (!handle.equals(originalHandle)) {
					driver.switchTo().window(handle);
					driver.close();
				}
			}

			driver.switchTo().window(originalHandle);

		} catch (Exception e) {

			Reporter.log("Error while closing child windows" + e.getMessage());

		}

		logger.info("Clearing all browser cookies...");
		driver.manage().deleteAllCookies();

	}

	@AfterSuite(alwaysRun = true)
	public void quitWebDrivers() {
		logger.info("terminateWebDrivers()");
		try {
			driver.close();
			driver.quit();
			
			driver = null;
		} catch (Exception e) {
			
			driver = null;
			logger.error("Error quitting driver");
			e.printStackTrace();
		}
	}

	@Override
	public Properties getStaticData() { 
		if (staticData == null) {
			staticData = new Properties();
			InputStream input = null;

			try {
				String filename = "staticdata.properties";
				input = BaseTest.class.getClassLoader().getResourceAsStream(filename);
				if (input != null) {
					
					staticData.load(input);
				}
			} catch (IOException ex) {
				TestNGCustomReporter.logbr("error loading staticdata.properties" + ex.getMessage());
			} finally {
				if (input != null) {
					try {
						input.close();
					} catch (IOException e) {
						TestNGCustomReporter.logbr(("error loading staticdata.properties") + e.getMessage());
					}
				}
			}
		}
		return staticData;
	}

	
	public String getURL(String appname) { 
		GetSFApps getSfApps = new GetSFApps();
		return getSfApps.getAppNavURL(appname);

	}

}
