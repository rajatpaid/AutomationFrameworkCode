package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

//import Com.Product_Logistics_Frieght_.Forwarding.Com.TestActions;

//import com.p99soft.basepackage.TestActions;

public  class SignInPageObjects extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(SignInPageObjects.class);
	public SignInPageObjects(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//input[@id='userName']")
public WebElement user_id;

@FindBy(xpath="//input[@id='password']")
public WebElement pass_word;

@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
public WebElement login_button;

@FindBy(xpath="//img[@alt='no image']")
public WebElement profile;

@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div/ul/li[3]/span/code")
public WebElement admin_profile;

/*
 * verify super admin login functionality
 * @paramaters:user id, password
 * @return
 * 
 */
public void navigatesToURL(String url) {
this.navigateUrl(url);
}
public void enterUserId(String userid) {
this.sendkeys(user_id, userid);
}
public void enetrPassword(String password) {
	this.sendkeys(pass_word,password);
}
public void clickOnLoginButton() {
	this.click(login_button);
}

/*
 * verify profile name is displayed.
 * @Parameters:
 * @return: string 
 */

public String isProfileNameDisplayed() {
	String ActualdProfileText = null;
	log.info("Click on admin profile");
	try {
		this.click(profile);
		ActualdProfileText= admin_profile.getText();
	} catch (Exception e) {
	log.info("Failure to click on  admin profile");	
	}
	return ActualdProfileText;
	

	
}

}
