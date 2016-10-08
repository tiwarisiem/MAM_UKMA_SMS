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
	public static final String JOBMENU_XPATH = "//*[@id='NavigationMenu']/ul/li[2]/a";
	public static final String NEWJOBMENU_XPATH = "//*[@id='NavigationMenu:submenu:12']/li[2]/a";
	public static final String METERPOINTMENU_XPATH = ".//*[@id='NavigationMenu']/ul/li[4]/a";

	/*--- Work Stream Page Web Element Locators using XPaths --- */
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

	/*--- Job Details Page Web Element Locators using XPaths --- */
	public static final String SUPPLIER_XPATH = "//select[@id='ddlGasSuppliers']";
	public static final String EXISTINGMSN_XPATH = "//input[@id='MainContent_tbExistingMeterSerialNumber']";
	public static final String SAVEJOBBUTTON_XPATH = "//input[@id='MainContent_btnSave']";

	public static final String JD_WORKSTREAM_XPATH = "//span[@id='MainContent_lblWorkStream']";
	public static final String CONTRACTOR_XPATH = "//select[@id='MainContent_ddlContractors']";
	public static final String COORDINATOR_XPATH = "//select[@id='MainContent_ddlCoordinators']";
	public static final String JD_APPOINTMENTDATE_XPATH = "//input[@id='MainContent_tbAppointmentDate']";
	public static final String JD_APPOINTMENTTIME_XPATH = "//select[@id='MainContent_ddlAppointmentTimes']";
	public static final String JD_METERWORKTYPE_XPATH = "//span[@id='MainContent_lblMeterWorkType']";
	public static final String JD_SELECTMETERLINK_XPATH = "//a[@id='MainContent_lbNewMeterCode']";
	public static final String JD_NEWMETERMSN_XPATH = "//input[@id='MainContent_tbNewMeterSerialNumber']";
	public static final String JD_NEWMETERYOM_XPATH = "//input[@id='MainContent_tbNewMeterYearofManufacturer']";
	public static final String JD_NEWMREADINGINDEX_XPATH = "//input[@id='MainContent_tbNewMeterReadingIndex']";
	public static final String JD_NEWMETERLOCATION_XPATH = "//select[@id='MainContent_ddlNewMeterLocation']";
	public static final String JD_ENGINEER_XPATH = "//select[@id='MainContent_ddlEngineers']";
	public static final String JD_ATTENDEDDATE_XPATH = "//input[@id='MainContent_tbAttendedDate']";
	public static final String JD_ATTENDEDTIME_XPATH = "/input[@id='MainContent_tbAttendedTime']";
	public static final String JOBCONFIRMATIONMSG_XPATH = "//*[@id='MainContent_lblMessage']";
	public static final String JD_RESCHEDULEBTN_XPATH = "//input[@id='MainContent_btnReschedule']";
	public static final String JD_COMPLETEBTN_XPATH = "//input[@id='MainContent_btnComplete']";
	public static final String JD_ABORTBTN_XPATH = "//input[@id='MainContent_btnAbort']";
	public static final String JD_CANCELBTN_XPATH = "//input[@id='MainContent_btnCancel']";
	public static final String JD_CHANGEWRKTYPEBTN_XPATH = "//input[@id='MainContent_btnChangeWorkType']";
	public static final String JD_CLEARAPPOINTMENTBTN_XPATH = "//input[@id='MainContent_btnResetAppointmentDate']";
	public static final String JD_RESCHEDULEDATE_XPATH = "//input[@id='MainContent_tbAppointmentDateRecshedule']";
	public static final String JD_RESCHEDULETIME_XPATH = "//select[@id='MainContent_ddlAppointmentTimesReschedule']";
	public static final String JD_RESCHEDULEDBY_XPATH = "//*[@name='ctl00$MainContent$rblRescheduleBy']";
	public static final String JD_RESCHEDULESAVEBTN_XPATH = "//input[@id='MainContent_btnSaveRescheduleJob']";
	public static final String JD_VALMSGRESCHEDULE_XPATH ="//*[@id='MainContent_llbErrorMessageRecshedule']";
	
	/*--- MeterPoint Search Page Web Element Locators using XPaths --- */
	public static final String METERPOINT_REFNO_XPATH = "//input[@id='MainContent_tbMPRN']";
	public static final String SEARCHBUTTON_METERPOINT_XPATH = "//input[@id='MainContent_btnSearch']";
	public static final String EDITBUTTON_METERPOINT_XPATH = "//input[@id='MainContent_gvMeterPointList_ibtnDetails_0']";
	public static final String EDITBUTTON_VIEWTRANSACTION_XPATH = "//input[@id='MainContent_gvMeterPointList_ibtnTransactions_0']";
	public static final String EDITBUTTON_MARKETPARTICIPANTS_XPATH = "//input[@id='MainContent_gvMeterPointList_ibtnMarketParticipants_0']";
	public static final String EDITBUTTON_VIEWASSETS_XPATH = "//input[@id='MainContent_gvMeterPointList_ibtnAssets_0']";

}
