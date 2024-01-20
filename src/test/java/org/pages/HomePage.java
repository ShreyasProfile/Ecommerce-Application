package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
     WebDriver driver;
  @FindBy(css="#logo>a>img")
  private WebElement appLogo;
  
  @FindBy(id="search")
  private WebElement searchBar;
  
  @FindBy(id="form-currency")
  private WebElement Curreny;
  
  @FindBy(id="menu")
  private WebElement catagoriesBar;
  
  @FindBy(css=".list-inline>li>span")
  private WebElement contactNo;
  
  @FindBy(css=".dropdown>a")
  private WebElement myAccount;
  
  @FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[1]/a")
  private WebElement registerbtn;
  
  @FindBy(xpath="//*[@id='top-links']/ul/li[2]/ul/li[2]/a")
  private WebElement loginbtn;
  
  @FindBy(css=".list-inline>li:nth-child(3)>a")
  private WebElement WishList;
  
  @FindBy(css=".list-inline>li:nth-child(4)>a")
  private WebElement ShoppingCart;
   
  @FindBy(css=".list-inline>li:nth-child(5)>a")
  private WebElement Checkout;
  
  @FindBy(xpath="//*[@id='content']/h1")
  private WebElement RegisterPage;
  
  @FindBy(xpath="//*[@id='content']/div/div[2]/div/h2")
  private WebElement LoginPage;
  
        public HomePage(WebDriver driver) {
           this.driver= driver;
          PageFactory.initElements(driver, this);
        }
  
    public boolean AppLogoIsDisplay() {
    	 return appLogo.isDisplayed();
    }
    public boolean SearchBarIsDisplay() {
   	 return searchBar.isDisplayed();
   }
    public boolean CurrenyIsDisplay() {
   	 return Curreny.isDisplayed();
   }
    public boolean catagoriesBarIsDisplay() {
   	 return catagoriesBar.isDisplayed();
   }
    public boolean contactNoIsDisplay() {
   	 return contactNo.isDisplayed();
   } 
    public boolean myAccountIsDisplay() {
   	 return myAccount.isDisplayed();
   }
    public boolean WishListIsDisplay() {
   	 return WishList.isDisplayed();
   }
    public boolean ShoppingCartIsDisplay() {
      	 return ShoppingCart.isDisplayed();
      }
    public boolean CheckoutIsDisplay() {
      	 return Checkout.isDisplayed();
      }
    public void ClicksOnMyAccount() {
      myAccount.click();
    }
    public void ClicksOnRegisterBtn() {
    	registerbtn.click();
    }
    public boolean RegisterpageIsDisplay() {
    	return RegisterPage.isDisplayed();
    }
    public void ClicksOnLoginBtn() {
    	loginbtn.click();
    }
    public boolean LoginpageIsDisplay() {
    	return LoginPage.isDisplayed();
    	
    }
}
