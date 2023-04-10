package com.product_logistic_friegt_forwarding;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import comfssdomainpageobjects.AdminSignInPageObjects;
import comfssdomainpageobjects.AirLinePageObject;
import comfssdomainpageobjects.BranchesPageObject;
import comfssdomainpageobjects.ChargeTypeObjects;
import comfssdomainpageobjects.ChargeUnitObjects;
import comfssdomainpageobjects.MasterModuleObject;
import comfssdomainpageobjects.ServiceTypeObjects;
import comfssdomainpageobjects.SignInPageObjects;
import comfssdomainpageobjects.TaxTypePageObjects;
import product_friegt_basepackage.TestBase;
import utility.Constants;
import utility.ExpectedValue;

@Listeners({com.product_logistic_friegt_forwarding.Itestlistners.class})
public class Producr_Frieght_Adda_Scenarios extends TestBase{

	public AdminSignInPageObjects signinpage;
	public  AirLinePageObject airline;
	public BranchesPageObject branch;
	public ServiceTypeObjects service;
	public ChargeTypeObjects charge;
	public ChargeUnitObjects unit;
	public TaxTypePageObjects tax;
	Logger log = Logger.getLogger(Producr_Frieght_Adda_Scenarios.class);

	/*
	 * This test case verifies admin login functionality
	 * @Parameters:
	 * @return: 
	 */
	
    /*
//   * This test case verifies admin login functionality
//   * @Parameters:
//   * @return: 
//   */
    @Test(priority=0,description="This testcase verifies admin login functionality",enabled=true)
    public void verifyAdminLoginFunctionality() throws InterruptedException {
        adminLogin();
        Assert.assertEquals(signinpage.isAdminProfileNameDisplayed(),Constants.ExpectedProfilEText); 
        Assert.assertEquals(signinpage.isAdminRoleDisplayed(), Constants.ExpectedadminroleText);
        Assert.assertEquals(signinpage.isUserNameDisplayed(),Constants.ExpectedusernameText);    
    }
    /*
     * This test case verifies create a airline
     * @Parameters:
     * @return: 
     */
    @Test(priority=1,description="This testcase verifies create a airline",enabled=false)
    public void verifyCreateAirline(){
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        airline.clickOnCreateNew();
        airline.enterAirlneDetails(Constants.airlinename, Constants.airlineiata,Constants.airlineicao);  
        Assert.assertEquals(ExpectedValue.airlinedetails,airline.isAirLineDetailsDisplayed());
        Assert.assertEquals(ExpectedValue.airlinenametext,airline.isIndigiAirlLineDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,airline.isCompanyNameDisplayed());
    }
    
    @Test(priority=2,description="This testcase verifies airline home page displayed ",enabled=false)
    public void verifyAirlineHomePageDiaplayed() {
        adminLogin();
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    @Test(priority=3,description="This testcase verifies airline create page displayed ",enabled=false)
    public void verifyAirlineCreateFiledsDisplayed() {
        adminLogin();
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        airline.clickOnCreateNew();
        Assert.assertEquals(ExpectedValue.airlinenamelabel,airline.isNameLabelDisplayed());
        Assert.assertEquals(ExpectedValue.airlineiatalabel,airline.isIataLabelDisplayed());
        Assert.assertEquals(ExpectedValue.airlineiacolabel,airline.isIcaoLabelDisplayed());
        Assert.assertEquals(ExpectedValue.countrylabel,airline.isCountryLabelDisplayed());
    }
    @Test(priority=4,enabled=false)
    public void verifyAdminNavigatesFromAilinepageToMastaerPage() {
        adminLogin(); 
        clickOnMasterModule();
      airline=new AirLinePageObject(driver);
      airline.clickOnAirlineModule();
        airline.clickOnCreateNew();
        airline.clickOnMasterLink();
        Assert.assertEquals(ExpectedValue.admincardtext,airline.isAdminCardTextDisplayed());
      airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        airline.clickOnCreateNew();
        airline.clickOnAirlineLink();
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    @Test(priority=5,enabled=false)
    public void verifySaveButtonFunctionality() {
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        airline.clickOnCreateNew();
        airline.enterAirlneDetails(Constants.airlinename, Constants.airlineiata,Constants.airlineicao);  
        Assert.assertEquals(ExpectedValue.savebuttontext,airline.isSaveButtonTextDisplayed());
        Assert.assertEquals(ExpectedValue.airlinedetails,airline.isAirLineDetailsDisplayed());
        Assert.assertEquals(ExpectedValue.airlinenametext,airline.isIndigiAirlLineDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,airline.isCompanyNameDisplayed());
    }
    @Test(priority=6,enabled=false)
    public void verifyDownloadAirlinesDetialsInExcelFormat() throws InterruptedException {
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        Thread.sleep(3000);
        airline.clickOnExportDropdown();
        Thread.sleep(3000);
        airline.clickOnExcelFormat();
    }
    @Test(priority=7,enabled=false)
    public void verifyDownloadAirlinesDetialsInCsvFormat() throws InterruptedException {
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        Thread.sleep(3000);
        airline.clickOnExportDropdown();
        airline.clickOnCsvFormat(); 
    }
    
    @Test(priority=8,enabled=false)
    public void verifyUpdateDetailsPageDisplayed() throws InterruptedException {
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        Thread.sleep(3000);
        airline.clickOnEditIcon();
        airline.clickOnConformationPopUp();
        Assert.assertEquals(ExpectedValue.airlinrupadteText,airline.isAirLineUpdateTextDisplayed());
        Assert.assertEquals(ExpectedValue.updatebutton,airline.isUpadateButtonDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,airline.isCompanyNameDisplayed());
    }
    @Test(priority=9,enabled=false)
    public void verifyUpdateExistingAirlineDetails() throws InterruptedException {
        adminLogin(); 
        clickOnMasterModule();
        airline=new AirLinePageObject(driver);
        airline.clickOnAirlineModule();
        Thread.sleep(3000);
        airline.clickOnEditIcon();
        airline.clickOnConformationPopUp();
        airline.enterIATACode(Constants.airlineiata);
        airline.clickOnUpdateButton();
        //Assert.assertEquals(ExpectedValue.airlinrupadteText,airline.isAirLineUpdateTextDisplayed());
        Assert.assertEquals(ExpectedValue.updatebutton,airline.isUpadateButtonDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,airline.isCompanyNameDisplayed());
        
    }
    /*
     * This test case verifies create a branch
     * @Parameters:
     * @return: 
     */
    @Test(priority=10,description="This testcase verifies create a branches ",enabled=false)
    public void verifyCreateBranches() throws InterruptedException {
    adminLogin();
        clickOnMasterModule();
    branch=new BranchesPageObject(driver);
        branch.clickOnBranchFolder();
        branch.clickOnCreateNew();
        branch.enterBranchDetails(Constants.branchname,Constants.branchloaction,Constants.branchcode,Constants.branchemail,Constants.gstnumber);
        Assert.assertEquals(ExpectedValue.branchdetailstext,branch.isBranchDetailsTextDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,branch.isCompanyNameDisplayed());
        Assert.assertEquals(ExpectedValue.branchnametext,branch.isBranchNameDisplayed());
        Assert.assertEquals(ExpectedValue.airlinenametext,airline.isIndigiAirlLineDisplayed());
    }
    /*
     * This test case verifies CreateServiceType
     * @Parameters:servicename,servicecode.
     * @return: No
     */
    @Test(priority=11,description="This testcase verifies create a service type ",enabled=false)
    public void verifyCreateServiceType() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        service= new ServiceTypeObjects(driver);
        service.clickOnServiceTypeFolder();
        service.clickOnCreateNewOption();
        service.enterServiceTypeDetails(Constants.servicename, Constants.servicecode);  
        Assert.assertEquals(ExpectedValue.companyname,service.isCompanyNameDisplayed());
        Assert.assertEquals(ExpectedValue.servicetypedetailstext,service.isServiceTypeDetailsTextDisplayed());
        Assert.assertEquals(ExpectedValue.servicetypetext,service.isServiceTypeTextDisplayed());
    }
    /*
     * This test case verifies create a ChargeType
     * @Parameters:
     * @return: No
     */
    @Test(priority=12,description="This testcase verifies create a charge type ",enabled=false)
    public void veriyCreateChargeType() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        charge= new ChargeTypeObjects(driver);
        charge.clickOnChargeTypeFolder();
        charge.clickOnCreateNewOption();
        charge.enterChargeTypeDetails(Constants.chargetypename,Constants.chargetypecode);
        Assert.assertEquals(ExpectedValue.chargetypedetailstext,charge.isChargeTypeDetailsPgageDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,charge.isCompanyNameDisplayed());
        Assert.assertEquals(ExpectedValue.chargecode,charge.isChargeCodeDisplayed());
        Assert.assertEquals(ExpectedValue.chargetypename,charge.isChargetypediplayed());
    }
    /*
     * This test case verifies create a ChageUnit
     * @Parameters:
     * @return: 
     */
    @Test(priority=13,description="This testcase verifies create a charge unit ",enabled=false)
    public void verifyCreateChageUnit() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        unit= new ChargeUnitObjects(driver);
        unit.clickOnChargeUnitFolder();
        unit.clickOnCreateNew();
        unit.enterChargeUnitDetails(Constants.chargeunitname,Constants.chargeunitcode);
        Assert.assertEquals(ExpectedValue.chargeunitdetailstext,unit.isChargeUnitDetailsTextDisplayed());
        Assert.assertEquals(ExpectedValue.chargeunitname,unit.isChargeUnitNameDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,unit.isCompanyNameDisplayed()); 
    }
    /*
     * This test case verifies create a TaxType
     * @Parameters:
     * @return: 
     */
    @Test(priority=14,description="This testcase verifies create a taxtype ",enabled=false)
    public void verifyCreateTaxType() {
        adminLogin();
        clickOnMasterModule();
        tax=new TaxTypePageObjects(driver);
        tax.clickOnTaxTypeFolder();
        tax.clickOnCreateNewOption();
        tax.enterTaxTypeDetails(Constants.taxtype,Constants.taxtypedescription);
        Assert.assertEquals(ExpectedValue.companyname,unit.isCompanyNameDisplayed()); 
        Assert.assertEquals(ExpectedValue.taxtypedetailstext,tax.isTaxTypeDetailsTextDisplayed()); 
    }
    @Test(priority=16,description="This testcase verifies Airline Page",enabled=true)
    public void validateAirliePage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());   
    }
    @Test(priority=17,description="This testcase verifies Breadcrumb",enabled=true)
    public void navigatefrom_AirlinePage_To_MasterPage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickOnMasterLink();
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    public void validateCreateAirlinePage() {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickCreateNew();
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    
    @Test(priority=18,description="This testcase verifies Airline Create functionality",enabled=true)
    public void vereifyIsAirlineCreate() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickCreateNew();
        airline.enterAirlineDetails(Constants.airlineName,Constants.airlineIATA,Constants.airlineICAO);
    }
    
    @Test(priority=19,description="This testcase verifies Breadcrumb",enabled=true)
    public void navigatefrom_AirlineCreatePage_To_MasterPage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickCreateNew();
        airline.clickOnMasterLink();
    }
    
    @Test(priority=20,description="This testcase verifies Breadcrumb",enabled=true)
    public void navigatefrom_AirlineCreatePage_To_AirlinePage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickCreateNew();
        airline.clickOnAirlineLink();
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    
    @Test(priority=21,description="This testcase verifies Airline Filter functionality",enabled=true)
    public void verifySearchAirline() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.enterAirlineNameOnFilter(Constants.searchMumbaiAirlines);
    }
    
    @Test(priority=22,description="This testcase verifies Airline download functionality",enabled=true)
    public void verifyDownloadAirline() {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.selectdownloadOptions();
}
    
    @Test(priority=23,description="This testcase verifies Airline update functionality",enabled=true)
    public void updateAirline() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.updateAirlineDetails();
        Assert.assertEquals(ExpectedValue.updatebutton,airline.isUpadateButtonDisplayed());
        Assert.assertEquals(ExpectedValue.companyname,airline.isCompanyNameDisplayed());
    }
    
    @Test(priority=24,description="This testcase verifies Breadcrumb",enabled=true)
    public void navigatefrom_AirlineUpdatePage_To_MasterPage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickOnEditIcon();
        airline.clickOnMasterLink();
    }
    
    @Test(priority=25,description="This testcase verifies Breadcrumb",enabled=true)
    public void navigatefrom_AirlineUpdatePage_To_AirlinePage() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.clickOnEditIcon();
        airline.clickOnAirlineLink();
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.createnewtext,airline.isCreateNewOptionDispleyed());
        Assert.assertEquals(ExpectedValue.airlinestext,airline.isAilinesTextDispleyed());
        Assert.assertEquals(ExpectedValue.filtertext,airline.isExportAsOtionDispleyed());
    }
    
    @Test(priority=26,description="This testcase verifies Airline update functionality",enabled=true)
    public void verifyViewAirline() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.viewAirlineDetails();
    }
    
    @Test(priority=27,description="This testcase verifies Airline Filter functionality",enabled=true)
    public void verifyReloadAirlineDetails() throws InterruptedException {
        adminLogin();
        clickOnMasterModule();
        airline = new AirLinePageObject(driver);
        airline.clickAirline();
        airline.enterAirlineNameOnFilter(Constants.searchMumbaiAirlines);
        airline.clickOnReloadSymbol();
    }
    
        
    public void clickOnMasterModule() {
        MasterModuleObject master= new MasterModuleObject(driver);
        master.clickOnMaterModule();
    }
    public void adminLogin() {
        signinpage= new AdminSignInPageObjects(driver);
        signinpage.navigateUrl(Constants.URL) ; 
        signinpage.enterAdminUserId(Constants.Username); 
        signinpage.enterAdminUserPassword(Constants.Password); 
        signinpage.clickOnLoginButton();     
    }}
    /*
//   * @Test public void google() { driver.get("https://www.google.com/");
//   * driver.findElement(By.xpath("q")).sendKeys("873687"); }
//   */
//}
///*
// * airline.enterAirlineName(Constants.airlinename);
// * airline.enterIATACode(Constants.airlineiata);
// * airline.enterICAOCode(Constants.airlineicao); airline.clickOnSaveButton();
// */
















