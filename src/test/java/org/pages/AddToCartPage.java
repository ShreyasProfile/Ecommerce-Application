package org.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class AddToCartPage {
     WebDriver driver;
  @FindBy(xpath="//*[@id='content']/div[2]/div[2]/div/div[3]/button")
  private WebElement AddToCartBtn;
  
  @FindBy(xpath="//*[@id='common-home']/div[1]")
  private WebElement AddToCartSuccessMsg;
  
  @FindBy(css="#cart>button")
  private WebElement CartBtnblock;
  
  @FindBy(xpath="//*[@id='top-links']/ul/li[4]/a")
  private WebElement ShoppingCartLink;
  
  @FindBy(xpath="//*[@id='checkout-cart']/ul/li[2]/a")
  private WebElement ShoppingCartPage;
  
  @FindBy(css=".table-responsive>table>thead>tr>td")
  private List<WebElement>ShoppingCartProductDetails;
 
  @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
  private WebElement Logoutbtn;
  
  @FindBy(xpath="//*[@id=\"top-links\"]/ul/li[4]/a/span")
  private WebElement CartBtnLink;
  
  @FindBy(xpath="//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]")
  private WebElement DeleteBtn;

        public AddToCartPage(WebDriver driver) {
           this.driver= driver;
          PageFactory.initElements(driver, this);
        }
  
    public void ClickOnAddToCartBtnOfProduct() {
    	AddToCartBtn.click();
    }
    public boolean CartBtnblockIsDisplay() {
    	return CartBtnblock.isDisplayed();
    }
    public boolean AddToCartSuccessMsgIsDisplay() {
    	return AddToCartSuccessMsg.isDisplayed();
    }
    public void ClicksOnShoppingCartLink() {
       BaseUtility bu = new BaseUtility();
       bu.clickByJS(driver, ShoppingCartLink);	
    }
    public boolean ShoppingCartPageisDisplay() {
    	return ShoppingCartPage.isDisplayed();
    }
    public void ShoppingCartProductDetailsDisplay() {
    	 
    }
    public void ClicksonLogoutbtn() {
    	Logoutbtn.click();
    }
    public void ClicksonCartBtnLink() {
    	CartBtnLink.click();
    }
    public void ClicksonDeleteBtn() {
    	DeleteBtn.click();
    }
    
}
