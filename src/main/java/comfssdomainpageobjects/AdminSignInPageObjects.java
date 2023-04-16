package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class AdminSignInPageObjects extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(AdminSignInPageObjects.class);

	public AdminSignInPageObjects(WebDriver driver) {
		super(driver);
		this.driver=driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[@id='userName']")
	public WebElement adminUserId;	

	@FindBy(xpath="//input[@id='password']")
	public WebElement adminPassword;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement adminLoginButton;

	@FindBy(xpath="//img[@alt='no image']")
	public WebElement admin_profile;

	@FindBy(xpath="//*[text()='ramesh@gmail.com']")
	public WebElement admin_email_text;

	@FindBy(xpath="//span[@class='ant-typography']//parent::code")
	public WebElement admin_role;

	@FindBy(xpath="//*[ text()='ramesh kk']")
	public WebElement user_name;

	/*
	 * verify admin enter user id.
	 * @Parameters:adiminuserid
	 * @return: No 
	 */

	public void enterAdminUserId(String adiminuserid) {
		this.sendkeys(adminUserId,adiminuserid);	
	}

	/*
	 * verify admin enter user password.
	 * @Parameters:adminpassword
	 * @return:No
	 */
	public void enterAdminUserPassword(String adminpassword) {
		this.sendkeys(adminPassword,adminpassword);
	}

	/*
	 * verify admin click on login button.
	 * @Parameters:No
	 * @return: No
	 */
	public void clickOnLoginButton() {
		this.click(adminLoginButton);
	}
	/*
	 * verify profile name is displayed.
	 * @Parameters:
	 * @return: string 
	 */
	public String isAdminProfileNameDisplayed() {
		String ActualdProfileText = null;
		log.info("Click on admin profile");
		try {
			this.click(admin_profile);
			ActualdProfileText= admin_email_text.getText();
		} catch (Exception e) {
			log.info("Failure to click on  admin profile");	
		}
		return ActualdProfileText;
	}
	/*
	 * verify admin text  is displayed.
	 * @Parameters:
	 * @return: string 
	 */
	public String isAdminRoleDisplayed() {
		String ActualText=null;
		try {
			ActualText= admin_role.getText();
		} catch (Exception e) {
			log.info("admin text is displayed");	
		}
		return ActualText;
	}
	public String isUserNameDisplayed() {
		
		String username=null;
		log.info("Click on admin profile");
		try {

			username= user_name.getText();
		} catch (Exception e) {
			log.info("Failure to click on  admin profile");	
		}
		return username;
				
	}
}

// test casess













