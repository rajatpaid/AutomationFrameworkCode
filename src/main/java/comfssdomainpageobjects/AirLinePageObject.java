package comfssdomainpageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import product_friegt_basepackage.TestActions;

public class AirLinePageObject extends TestActions {
	WebDriver driver;
	Logger log = Logger.getLogger(AirLinePageObject.class);
	public AirLinePageObject(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav__items ']")
	public WebElement master;
	
	@FindBy(xpath="//*[text()='Airline']")
	public WebElement airline_module;
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	public WebElement create_new;
	
	@FindBy(xpath="//input[@id='airlineName']")
	public WebElement airline_name;
	
	@FindBy(xpath="//input[@id='iata']")
	public WebElement iata;
	
	@FindBy(xpath="//input[@id='icao']")
	public WebElement icao;
	
	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div[2]/div/div/div/form/div[3]/div/div/span/button")
	public WebElement save_button;
	
	@FindBy(xpath="//span[text()='Airline Details']//parent::div")
	public WebElement airlinedetails;
	
	@FindBy(xpath="//div[text()='Indigo airline']")
	public WebElement indigoarilinetext;
	
	@FindBy(xpath="//div[text()='Transaction tax']")
	public WebElement chargetypename;
	
	
	
	public void clickOnMaterModule() {
		this.click(master);
	}
	
	public void clickOnAirlineModule() {
		this.click(airline_module);
	}
	
	public void clickOnCreateNew() {
		this.click(create_new);
	}
	public void enterAirlineName(String airlinename) {
		this.sendkeys(airline_name, airlinename);
	}
	public void enterIATACode(String Iatacode) {
		this.sendkeys(iata, Iatacode);
	}
	public void enterICAOCode(String icaocode) {
		this.sendkeys(icao, icaocode);
	}
	public void clickOnSaveButton() {
		this.click(save_button);
	} 
	
	public void enterAirlneDetails(String airlinename,String Iatacode,String icaocode) {
		this.sendkeys(airline_name, airlinename);
		this.sendkeys(iata, Iatacode);
		this.sendkeys(icao, icaocode);
		this.click(save_button);
		
	}
	/*
	 * verify airline details text is displayed.
	 * @Parameters:
	 * @return: string 
	 */
	public String isAirLineDetailsDisplayed() {
		this.waitForEle(airlinedetails);
			
		String 	airlinedetailstext= airlinedetails.getText();
		
		return airlinedetailstext;
		
	}
	public String isIndigiAirlLineDisplayed() {
		this.waitForEle(indigoarilinetext);	
		String 	IndigiAirlLinetext= indigoarilinetext.getText();
		return IndigiAirlLinetext;
	}
	public String isCompanyNameDisplayed() {
		this.waitForEle(chargetypename);
		String companyName= chargetypename.getText();
		return companyName;	
	}

}






