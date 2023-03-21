package comfssdomainpageobjects;

import org.apache.log4j.Logger;
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
	@FindBy(xpath="//span[text()='Branches']")
	public WebElement branchFolder;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	public WebElement create_new;
	
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
	
	@FindBy(xpath="//*[text()='Telangana ']")
	public WebElement state_dropdown;
	
	@FindBy(xpath="//div[@id='gstState']")
	public WebElement dropd;
	
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
	
	public void clickOnBranchFolder() {
		this.click(branchFolder);
	}
	public void clickOnCreateNew() {
		this.click(create_new);
	}
	public void enterBranchDetails(String branch,String loaction,String branchcode,String branchemail,String gstnumber ) throws InterruptedException {
		this.sendkeys(branch_name, branch);
		this.sendkeys(branch_location, loaction);
		this.sendkeys(branch_code,branchcode);
		this.sendkeys(branch_email, branchemail);
		this.sendkeys(gst_number, gstnumber);
		this.click(dropd);
		Thread.sleep(3000);
		this.click(state_dropdown);
		Thread.sleep(3000);
		this.click(save_button);

		//this.sendkeys(branchFolder, state);
	}
	public void enterGstState() throws InterruptedException {
		this.click(dropd);
		Thread.sleep(3000);
		this.click(state_dropdown);
		this.click(save_button);
		//this.dropdownhandle(state_dropdown, state);
	}
	
	public String isBranchDetailsTextDisplayed() {

		String branchdetailsText=branchdetailstext.getText();
		return branchdetailsText;
	}
	
	public String isCompanyNameDisplayed() {
		this.waitForEle(chargetypename);
		String companyName= chargetypename.getText();
		return companyName;	
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

}}
