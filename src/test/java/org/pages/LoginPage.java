package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     WebDriver driver;
  @FindBy(id="input-email")
  private WebElement mailfield ;
  
  @FindBy(id="input-password")
  private WebElement passwordfield;
  
  @FindBy(xpath="//*[@id='content']/div/div[2]/div/form/input")
  private WebElement LoginPbtn;

  @FindBy(id="account-account")
  private WebElement AccPage ;
  
  @FindBy(xpath="//*[@id='account-account']/ul/li[1]/a/i")
  private WebElement HomePageicon ;
  
  @FindBy(xpath="//*[@id='content']/div/div[2]/div/form/div[2]/a")
  private WebElement forgottpwdLink ;
  
  @FindBy(css="#account-login>div>i")
  private WebElement errormsg;
  
  @FindBy(css=".breadcrumb>li:nth-child(3)>a")
  private WebElement forgettPage;
  
     public LoginPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
     }
  
     public void EnterEmailaddress() {
     	mailfield.sendKeys("sk1@gmail.com");
     }
     public void Enterpasswordfield() {
    	 passwordfield.sendKeys("789456");
     }
     public void ClickOnLoginBtn() {
    	 LoginPbtn.click();
     }
     public boolean AccPageIsDisplay() {
    	 return AccPage.isDisplayed();
     }
     public void HomePageIconOnAccPage() {
    	 //for redirect to home page
    	 HomePageicon.click();
       }
     public void LoginAddress(String email) {
      	mailfield.sendKeys(email);
      }
     public void LoginPassword(String password) {
    	 passwordfield.sendKeys(password);
       }
     public boolean errorMsgIsDisplay() {
    	 return errormsg.isDisplayed();
       }
     public boolean forgottLinkIsDisplay() {
    	 return forgottpwdLink.isDisplayed();
       }
     public void ClickOnforgottLink() {
    	 forgottpwdLink.click();
       }
     public boolean forgettPageIsDisplay() {
    	 return forgettPage.isDisplayed();
       }
}
