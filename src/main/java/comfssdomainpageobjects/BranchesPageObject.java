package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class BranchesPageObject extends TestActions {
	
	WebDriver driver;
	Logger log = Logger.getLogger(BranchesPageObject.class);

	public BranchesPageObject (WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//strong[text()='krishna Tranport and Logistics company']//parent::h3")
	public WebElement comany_name;
	
	@FindBy(xpath="//span[text()='Branches']")
	public WebElement branchFolder;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	public WebElement create_new;
	
	@FindBy(xpath="//button[@type='button' and @class='ant-btn ant-dropdown-trigger']")
	public WebElement exportAs;
	
	@FindBy(xpath="//span[text()='Master']//parent::a")
	public WebElement masterLink;
	
	@FindBy(xpath="//span[text()='Branches']//parent::a")
	public WebElement branchesLink;
	
	@FindBy(xpath="(//span[text()='Branches'])[2]")
	public WebElement branchesTitle;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-round']")
	public WebElement btfilter;
	
	@FindBy(xpath="(//span[text()='Branches'])[2]")
	public WebElement branches_text  ;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement branch_name;
	
	@FindBy(xpath="//input[@id='location']")
	public WebElement branch_location;
	
	@FindBy(xpath="//input[@id='branchCode']")
	public WebElement branch_code;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement branch_email;
	
	@FindBy(xpath="//input[@id='gstNumber']")
	public WebElement gst_number;
	
	@FindBy(xpath="//div[@id='gstState']")
	public WebElement dropGSTState;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save_button;
	
	@FindBy(xpath="//span[text()='Branch Details']//parent::a")
	public WebElement branchdetailstext;
	
	@FindBy(xpath="//div[text()='Transaction tax']")
	public WebElement chargetypename;
	
	@FindBy(xpath="//div[text()='Vijayawada']")
	public WebElement vijayawada_branch;
	
	@FindBy(xpath="//div[text()='India']")
	public WebElement validate_India;
	
	@FindBy(xpath="//*[@class='ant-btn ant-btn-primary']")
	public WebElement btCreateNew;
	
	@FindBy(xpath="//a[@href='/admin/branch/branch-table']")
	public WebElement branch_Card;
	
	@FindBy(id="branchCode")
	public WebElement branch_Code;

	@FindBy(id="gstNumber")
	public WebElement branch_gstNo;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-dashed']")
	public WebElement addAddress;
	
	@FindBy(id="address[1][addressLine1]")
	public WebElement branch_address;
	
	@FindBy(id="address[1][phone]")
	public WebElement branch_phoneNo;
	
	@FindBy(id="address[1][city]")
	public WebElement branch_city;
	
	@FindBy(id="address[1][postalCode]")
	public WebElement branch_zipcode;
	
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[1]")
	public WebElement btSave;
	

	@FindBy(xpath="//li[text()='Maharashtra']")
	public WebElement stateMaharashtra;

	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[4]")
	public WebElement addressType_dropdown;
	
	@FindBy(xpath="//li[text()='Primary Address']")
	public WebElement primaryAddressType;
	
	@FindBy(xpath="(//div[@class='ant-select-selection__rendered'])[5]")
	public WebElement country_dropdown;

	@FindBy(xpath="//li[text()='INDIA']")
	public WebElement country_India;
	
	@FindBy(xpath="//span[text()='Name']")
	public WebElement name_label;
	
	@FindBy(xpath="//span[text()='Company']")
	public WebElement company_label;
	
	@FindBy(xpath="//span[text()='Location']")
	public WebElement location_label;
	
	@FindBy(xpath="//span[text()='Branch Code']")
	public WebElement branchCode_label;
	
	@FindBy(xpath="//span[text()='GST State']")
	public WebElement gstState_label;
	
	@FindBy(xpath="//span[text()='GST Number']")
	public WebElement gstNumber_label;
	
	@FindBy(xpath="//span[text()='Address']")
	public WebElement address_label;
	
	@FindBy(xpath="//label[text()='Email']")
	public WebElement email_label;
	
	@FindBy(xpath="//span[text()='Save']")
	public WebElement saveButton_label;
	
	@FindBy(xpath="//span[text()='Cancel']")
	public WebElement cancelButton_label;
	
	@FindBy(xpath="//button[@type='button' and @class='ant-btn ant-dropdown-trigger']")
	public WebElement export;
	
	@FindBy(xpath="//span[text()='Edit']")
	public WebElement editButton;
	
	@FindBy(xpath="//span[text()='Close']")
	public WebElement closeButton;
			
    @FindBy(xpath="(//div[text()='Mumbai'])[2]")
	public WebElement mumbaiBranchtext;
			
	public void clickOnBranchCard() {
		this.click(branch_Card);
	}
	
	public void clickCreateNew() {
		this.click(btCreateNew);
	}
	
	public void clickOnMasterLink() {
		this.click(masterLink);
	}
	
	public void clickOnBranchesLink() {
		this.click(branchesLink);
	}
	
	//-----Methods related to the Branches Page----//
	
	public String isCreateNewButtonTextDisplayed() {
		String branchCreateNewButtonText=btCreateNew.getText();
		return branchCreateNewButtonText;
	}
	public String isExportAsButtonTextDisplayed() {
		String branchExportAsButtonText=exportAs.getText();
		return branchExportAsButtonText;
	}
	public String isFilterButtonTextDisplayed() {
		String branchFilterButtonText=btfilter.getText();
		return branchFilterButtonText;
	}
	public String isMasterLinkTextDisplayed() {
		String branchMasterLinkText=masterLink.getText();
		return branchMasterLinkText;
	}
	
	public String isBranchesLinkTextDisplayed() {
		String branchBranchesLinkText=branchesLink.getText();
		return branchBranchesLinkText;
	}
	
	//-----Methods related to the Branches Create Page----//
	
		public String isBranchNameTextDisplayed() {
			String branchNameText=name_label.getText();
			return branchNameText;
		}
		
		public String isBranchCompanyTextDisplayed() {
			String branchCompanyText=company_label.getText();
			return branchCompanyText;
		}
		
		public String isBranchLocationTextDisplayed() {
			String branchLocationText=location_label.getText();
			return branchLocationText;
		}
		
		public String isBranchCodeTextDisplayed() {
			String branchCodeText=branchCode_label.getText();
			return branchCodeText;
		}
		
		public String isBranchGSTstateTextDisplayed() {
			String branchGSTstateText=gstState_label.getText();
			return branchGSTstateText;
		}
		
		public String isBranchGSTNumberTextDisplayed() {
			String branchGSTNumberText=gstNumber_label.getText();
			return branchGSTNumberText;
		}
		
		public String isBranchAddressTextDisplayed() {
			String branchAddressText=address_label.getText();
			return branchAddressText;
		}
		
		public String isBranchAddAddressButtonTextDisplayed() {
			String branchAddAddressButtonText=addAddress.getText();
			return branchAddAddressButtonText;
		}
		public String isBranchEmailTextDisplayed() {
			String branchEmailText=email_label.getText();
			return branchEmailText;
		}
		
		public String isBranchSaveButtonTextDisplayed() {
			String branchSaveButtonText=saveButton_label.getText();
			return branchSaveButtonText;
		}
		
		public String isBranchCancelButtonTextDisplayed() {
			String branchCancelButtonText=cancelButton_label.getText();
			return branchCancelButtonText;
		}
		
	public void enterBranchDetails(String name, String location,String code,String email,String gstNo) {
		this.sendkeys(branch_name, name);
		this.sendkeys(branch_location, location);
		this.sendkeys(branch_Code, code);
		this.sendkeys(branch_email, email);
		this.sendkeys(branch_gstNo, gstNo);
	}
	
	public void clickOnAddAddress() {
		this.click(addAddress);
	}
	
	public void enterBranchAddressDetails(String address, String phoneNo,String city, String zipcode) throws InterruptedException {
		this.sendkeys(branch_address, address);
		this.sendkeys(branch_phoneNo, phoneNo);
		this.sendkeys(branch_city, city);
		this.sendkeys(branch_zipcode, zipcode);
	}
	
	public void clickOnSave() {
		this.click(btSave);
	}

	public void selectgstState() throws InterruptedException {
		this.click(dropGSTState);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dropGSTState);
		Thread.sleep(500);
		this.click(stateMaharashtra);
	}
	
	public void selectAddressType()  {
		this.click(addressType_dropdown);
		this.click(primaryAddressType);
	}
	
	public void selectCountry()  {
		this.click(country_dropdown);
		this.click(country_India);
	}
	
	public void clickOnBranchFolder() {
		this.click(branchFolder);
	}
	public void clickOnCreateNew() {
		this.click(create_new);
	}
//	public void enterBranchdetails(String branch,String loaction,String branchcode,String branchemail,String gstnumber ) throws InterruptedException {
//		this.sendkeys(branch_name, branch);
//		this.sendkeys(branch_location, loaction);
//		this.sendkeys(branch_code,branchcode);
//		this.sendkeys(branch_email, branchemail);
//		this.sendkeys(gst_number, gstnumber);
//		this.click(dropd);
//		Thread.sleep(3000);
//		this.click(state_dropdown);
//		Thread.sleep(3000);
//		this.click(save_button);
//		//this.sendkeys(branchFolder, state);
//	}
//	
	
	
	//Branches details Page Methods
	public String isBranchDetailsTextDisplayed() {
		String branchdetailsText=branchdetailstext.getText();
		return branchdetailsText;
	}
	
	public String isMumbaiBranchTextDisplayed() {
		String mumbaiBranchText=mumbaiBranchtext.getText();
		return mumbaiBranchText;
	}
	
	public String isBranchEditButtonTextDisplayed() {
		String branchEditButtonText=editButton.getText();
		return branchEditButtonText;
	}
	
	public String isBranchCloseButtonTextDisplayed() {
		String branchCloseButtonText=closeButton.getText();
		return branchCloseButtonText;
	}
	
	public String isBranchNameDisplayed() {
		this.waitForEle(vijayawada_branch);
		String companyName= vijayawada_branch.getText();
		return companyName;	
	}

	public String isUserIndiaDisplayed() {

		String india=null;
		log.info("branch email is displayed ");
		try {

			india=validate_India.getText();
		} catch (Exception e) {
			log.info("branch email is not displayed");	
		}
		return india;

	}
	public String isCreateNewOptionDispleyed() {
		String createnewtext=btCreateNew.getText();
		return createnewtext;
	}



	public String isExportAsOtionDispleyed() {
		String filteroption=export.getText();
		return filteroption;
	}
	
	public String isCompanyNameDisplayed() {
		this.waitForEle(comany_name);
		String companyName= comany_name.getText();
		return companyName;	
	}
}