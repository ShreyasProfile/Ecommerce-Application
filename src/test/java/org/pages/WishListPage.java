package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseUtility;

public class WishListPage {
     WebDriver driver;
 	BaseUtility bu = new BaseUtility(); 
  @FindBy(xpath="//*[@id='wishlist-total']/span")
  private WebElement WishListLink;
  
  @FindBy(xpath="//*[@id='content']/div[2]/div[4]/div/div[3]/button[2]")
  private WebElement WishListBtnOfProduct;
  
  @FindBy(css=" .list-inline>li:nth-child(3)>a>span")
  private WebElement WishListLinkShowCount;
  
  @FindBy(xpath="//*[@id='common-home']/div[1]")
  private WebElement MsgShows;

  @FindBy(xpath="//*[@id='account-wishlist']/ul/li[3]/a")
  private WebElement WishListPage;
  
  @FindBy(xpath="//*[@id='content']/h2")
  private WebElement WishListProductADD;

        public WishListPage(WebDriver driver) {
           this.driver= driver;
          PageFactory.initElements(driver, this);
        }
  
    public boolean WishListIsDisplay() {
   	   return WishListLink.isDisplayed();
   }
    
    public void ScrollForProductDisplay() {
        bu.ScrollByActions(driver, 0, 200);
   }
    public boolean WishListBtnOfProductIsDisplay() {
      	 return WishListBtnOfProduct.isDisplayed();
      }
    public void ClickOnWishListBtnOfProduct() {
     	 WishListBtnOfProduct.click();
     }
    public boolean ProductCountIsDisplay() {
     	 return WishListLinkShowCount.isDisplayed();
     }
    public boolean ErrorMsgIsDisplay() {
    	 return MsgShows.isDisplayed();
    }
    public boolean SuccessMsgIsDisplay() {
   	 return MsgShows.isDisplayed();
   }
    public void ClicksOnWishListLink() {
    	BaseUtility bu = new BaseUtility();
    	bu.clickByJS(driver, WishListLink);   
    	
    }
    public boolean WishListPageIsDisplay() {
    	return WishListPage.isDisplayed();
    }
    public boolean ProductShowsOnWishListPage() {
    	return WishListProductADD.isDisplayed();
    }
}
