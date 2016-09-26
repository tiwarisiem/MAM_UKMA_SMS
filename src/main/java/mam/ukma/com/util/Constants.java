package mam.ukma.com.util;

public class Constants {

	/*--- Login Page Web Element Locators using XPaths --- */
	public static final String USERNAME_XPATH = "//input[@id='MainContent_tbUserName']";
	public static final String PASSWORD_XPATH = "//input[@id='MainContent_tbPassword']";
	public static final String LOGIN_BUTTON_XPATH = "//input[@id='MainContent_btnLogin']";
	public static final String LOGIN_ERRORMSG = "//span[@id='MainContent_lblErrorMessage']";
	
	/*--- Search Job Page Web Element Locators using XPaths --- */
	public static final String WORKSTREAM_XPATH = "//select[@id='MainContent_ddlWorkStreams']";
	public static final String WORKTYPE_XPATH = "//select[@id='MainContent_ddlWorkTypes']";
	public static final String JOBSTATUS_XPATH = "//select[@id='MainContent_ddlWorkStatuses']";
	public static final String REFERENCENO_XPATH = "//input[@id='MainContent_tbReferenceNumber']";
	public static final String METERPOINTREFNO_XPATH = "//input[@id='MainContent_tbMPRN']";
	public static final String JOBCOORFINATOR_XPATH = "//select[@id='MainContent_ddlCoordinator']";
	public static final String SEARCHJOB_BUTTON_XPATH = "//input[@id='MainContent_btnSearchIncludeCoordinator']";
	
	/*--- Work Stream Page Web Element Locators using XPaths --- */
	public static final String JOBMENU_XPATH = "//*[@id='NavigationMenu']/ul/li[2]/a";
	public static final String NEWJOBMENU_XPATH = "//*[@id='NavigationMenu:submenu:12']/li[2]/a";
	public static final String SELECTWORKSTREAM_XPATH = "//select[@id='MainContent_ddlWorkStreams']";
	public static final String METERWORKTYPE_XPATH = "//select[@id='MainContent_ddlMeterWorkTypes']";
	public static final String CONVERTERWORKTYPE_XPATH = "//select[@id='MainContent_ddlConverterWorkTypes']";
	public static final String METERAMRWORKTYPE_XPATH = "//select[@id='MainContent_ddlMeterAMRWorkTypes']";
	public static final String CONVERTERAMRWORKTYPE_XPATH = "//select[@id='MainContent_ddlConverterAMRWorkTypes']";
	public static final String NEXTBUTTON_WORKSTREAM_XPATH = "//input[@id='MainContent_btnNext']";
	
	/*--- Meter Point Page Web Element Locators using XPaths --- */
	public static final String MPRN_XPATH = "//input[@id='tbMPRN']";
	public static final String PRESSURETIER_XPATH = "//select[@id='MainContent_wucMeterPoint1_ddlPressureTier']";
	public static final String MICROBUSINESS_XPATH = "//select[@id='MainContent_wucMeterPoint1_ddlMicroBusiness']";
	public static final String ADD1_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbBuildingNameNumber']";
	public static final String ADD2_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbSubBuildingNameNumber']";
	public static final String POSTTOWN_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbPostTown']";
	public static final String POSTCODE_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbPostCode']";
	public static final String TITLE_XPATH = "//select[@id='MainContent_wucMeterPoint1_ddlTitles']";
	public static final String SURNAME_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbSurName']";
	public static final String TELEPHONE1_XPATH = "//input[@id='MainContent_wucMeterPoint1_tbTelephone1']";
	public static final String SAVEANDNEXTBUTTON_XPATH = "//input[@id='MainContent_wucMeterPoint1_btnSave']";
	public static final String LOGGEDJOBS_XPATH = "//a[@id='MainContent_wucMeterPoint1_lbtnMeterPointLoggedJobs']";
	public static final String METERPOINT_ERRORMSG_XPATH = "//span[@id='MainContent_wucMeterPoint1_lblMessage']";


}
