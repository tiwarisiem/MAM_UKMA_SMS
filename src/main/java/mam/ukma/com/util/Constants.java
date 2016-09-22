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
	
	/*--- Top Menu Web Element Locators using XPaths --- */
	public static final String JOBMENU_XPATH = "//a[@id='NavigationMenu']/ul/li[2]/a";
	public static final String NEWJOBMENU_XPATH = "//a[@id='NavigationMenu:submenu:12']/li[2]/a";

}
