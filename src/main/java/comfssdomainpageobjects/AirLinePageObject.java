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

	@FindBy(xpath="//span[text()='Airlines']//parent::div")
	public WebElement airlines_text;

	@FindBy(xpath="//button[@type='button' and @class='ant-btn ant-dropdown-trigger']")
	public WebElement export;

	@FindBy(xpath="//span[text()='Master']//parent::a")
	public WebElement master_link;

	@FindBy(xpath="//span[text()='Name']")
	public WebElement name_label;

	@FindBy(xpath="//span[text()='IATA']")
	public WebElement iata_label;

	@FindBy(xpath="//span[text()='ICAO']")
	public WebElement icao_label;

	@FindBy(xpath="//span[text()='Country']")
	public WebElement country_label;

	@FindBy(xpath="//div[text()='Admin Card']")
	public WebElement admin_cardText;

	@FindBy(xpath="//span[text()='Airlines']")
	public WebElement airlines_link;

	@FindBy(xpath="//button[@class='ant-btn ant-dropdown-trigger']")
	public WebElement exportas;

	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[1]/i")
	public WebElement excelformat; 

	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[2]")
	public WebElement csvformat;

	@FindBy(xpath="//*[@id=\"root\"]/section/section/main/div[2]/div/div/div/div[3]/div[2]/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[1]/td[6]/span/i[1]")
	public WebElement editicon;

	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	public WebElement popup_Ok_button;

	@FindBy(xpath="//span[text()='Airline Update']//parent::a")
	public WebElement airline_update_text;

	@FindBy(xpath="//button[@type='submit']")
	public WebElement upadte_button;

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

	public String isCreateNewOptionDispleyed() {
		String createnewtext=create_new.getText();
		return createnewtext;
	}

	public String isAilinesTextDispleyed() {
		String airlinetext=airlines_text.getText();
		return airlinetext;
	}

	public String isExportAsOtionDispleyed() {
		String filteroption=export.getText();
		return filteroption;
	}

	public String isMasterLinkDispleyed() {
		String matserlink=master_link.getText();
		return matserlink;
	}

	public void clickOnMasterLink() {
		this.click(master);
	}

	public String isNameLabelDisplayed() {
		String namelabel= name_label.getText();
		return namelabel;
	}

	public String isIataLabelDisplayed() {
		String IataLabel= iata_label.getText();
		return IataLabel;
	}

	public String isIcaoLabelDisplayed() {
		String IcaoLabel=icao_label.getText();
		return IcaoLabel;
	}

	public String isCountryLabelDisplayed() {
		String coulntryLabel=country_label.getText();
		return coulntryLabel;
	}

	public String isAdminCardTextDisplayed() {
		String admincardtext=admin_cardText.getText();
		return admincardtext;
	}
	public String isSaveButtonTextDisplayed() {
		String SaveButtonText=save_button.getText();
		return SaveButtonText;
	}
	public void clickOnAirlinesLink() {
		this.click(airlines_link);

	}
	public void clickOnExportDropdown() {
		this.click(exportas);
	}
	public void clickOnExcelFormat() {
		this.click(excelformat);
	}
	public void clickOnCsvFormat() {
		this.click(csvformat);
	}
	public void clickOnEditIcon() {
		this.click(editicon);	
	}
	public void clickOnConformationPopUp() {
		this.click(popup_Ok_button);	
	}
	public String isAirLineUpdateTextDisplayed() {
		this.waitForEle(airline_update_text);
		String 	airlinedupadatetext= airline_update_text.getText();
		return airlinedupadatetext;
	}
	public String isUpadateButtonDisplayed() {
		String 	updatebutton= upadte_button.getText();
		return updatebutton;
	}
	public void clickOnUpdateButton() {
		this.click(airline_update_text);
	}
}






