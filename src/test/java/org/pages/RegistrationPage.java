package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	WebDriver driver;
	
	@FindBy(css="#account-register > ul > li:nth-child(3) > a")
    private WebElement RegisterPg;
	
	@FindBy(id="input-firstname")
    private WebElement Fnamefield;
	
	@FindBy(id="input-lastname")
    private WebElement Lnamefield;         
	
    @FindBy(id="input-email")
    private WebElement emailfield;
    
    @FindBy(id="input-telephone")
    private WebElement Tphonefield;
    
    @FindBy(id="input-password")
    private WebElement Pwdfield;
    
    @FindBy(id="input-confirm")
    private WebElement ConfirmPwdfield;
    
    @FindBy(xpath="//*[@id='content']/form/fieldset[3]/div/div/label[1]/input")
    private WebElement SubscribeYBtn;
  
    @FindBy(xpath="//*[@id='content']/form/fieldset[3]/div/div/label[2]/input")
    private WebElement SubscribeNBtn;
    
    @FindBy(css="#content>form>div>div>input[type=checkbox]:nth-child(2)")
    private WebElement Ppolicy;
    
    @FindBy(css="#content>form>div>div>input.btn.btn-primary")
    private WebElement ContinueBtn;
    
    @FindBy(css="#content > h1")
    private WebElement SuccessMsg;
    
	public RegistrationPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
     }
	
	public boolean RegisterPageDisplay() {
		return RegisterPg.isDisplayed();
     }
	public void EnterFName(String FName) {
		Fnamefield.sendKeys(FName);
	}
	public void EnterLName(String LName) {
		Lnamefield.sendKeys(LName);
	}
	public void EnterEmail(String email) {
		emailfield.sendKeys(email);
	}
	public void EnterTphone(String PhoneNo) {
		Tphonefield.sendKeys(PhoneNo);
	}
	public void EnterPwd(String pwd) {
		Pwdfield.sendKeys(pwd);
	}
	public void reEnterPwd(String reEnterPwd) {
		ConfirmPwdfield.sendKeys(reEnterPwd);
	}
	public void ClickonSubscribeYBtn() {
		SubscribeYBtn.click();
	}
	public void ClickonSubscribeNBtn() {
		SubscribeYBtn.click();
	}
	public void ClickPpolicybox() {
		Ppolicy.click();
	}
	public void ClicksOnContinueBtn() {
		ContinueBtn.click();
	}
	public boolean SuccessMsgIsDisplay() {
		return SuccessMsg.isDisplayed();
	}
	
	
}

