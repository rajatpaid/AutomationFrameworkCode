package com.product_logistic_friegt_forwarding;

import org.testng.Assert;
import org.testng.annotations.Test;

import comfssdomainpageobjects.AdminSignInPageObjects;
import comfssdomainpageobjects.BranchesPageObject;
import comfssdomainpageobjects.MasterModuleObject;
import product_friegt_basepackage.TestBase;
import utility.Constants;
import utility.ExpectedValue;

public class BranchCardTestCases extends TestBase {
	AdminSignInPageObjects signinpage;
	BranchesPageObject branch;
	
	@Test(priority=1,description="This testcase verifies Branch page displayed ",enabled=true)
	public void verifyBranchesPage() {
		adminLogin();
		clickOnMasterModule();
		branch = new BranchesPageObject(driver);
		branch.clickOnBranchCard();
	     Assert.assertEquals(ExpectedValue.createNewButtonLabel,branch.isCreateNewButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.exportAsButtonLabel,branch.isExportAsButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.filterButtonLabel,branch.isFilterButtonTextDisplayed());
		Assert.assertEquals(ExpectedValue.masterlinkLabel,branch.isMasterLinkTextDisplayed());
		Assert.assertEquals(ExpectedValue.branchesLinkLabel,branch.isBranchesLinkTextDisplayed());
	}
	
	
	  @Test(priority = 2, description ="This testcase verifies airline create page displayed ", enabled = true)
	  public void verifyBranchCreatePageDisplayed() { 
          adminLogin();
	  clickOnMasterModule();
	  branch = new BranchesPageObject(driver);
	  branch.clickOnBranchCard();
	  branch.clickCreateNew();
	  Assert.assertEquals(ExpectedValue.branchnameLabel,branch.isBranchNameTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchCompanyLabel,branch.isBranchCompanyTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchLocationLabel,branch.isBranchLocationTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchCodeLabel,branch.isBranchCodeTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchEmailLabel,branch.isBranchEmailTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchGSTNoLabel,branch.isBranchGSTNumberTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchStateLabel,branch.isBranchGSTstateTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchAddressLabel,branch.isBranchAddressTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchAddAddressButtonLabel,branch.isBranchAddAddressButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchSaveButtonLabel,branch.isBranchSaveButtonTextDisplayed());
	  Assert.assertEquals(ExpectedValue.branchCancelButtonLabel, branch.isBranchCancelButtonTextDisplayed()); }
	  @Test(priority=4,description="This testcase verifies Breadcrumb",enabled= true) 
	  public void navigateFromBranchesPageToMasterPage() { 
	  adminLogin();
	  clickOnMasterModule(); 
	  branch = new BranchesPageObject(driver);
	  branch.clickOnBranchCard(); 
	  branch.clickOnMasterLink();
	  Assert.assertEquals(ExpectedValue.adminCardLabel,branch.isAdminCardTextDisplayed());
	  }
	  
	  @Test(priority=5,description="This testcase verifies Breadcrumb",enabled=true)
	  public void navigateFromBranchesCreatePageToMasterPage() {
	  adminLogin(); clickOnMasterModule();
	  branch = new BranchesPageObject(driver);
	  branch.clickOnBranchCard();
	  branch.clickCreateNew();
	  branch.clickOnMasterLink(); 
	  Assert.assertEquals(ExpectedValue.adminCardLabel,branch.isAdminCardTextDisplayed());
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
}
}