package org.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
     WebDriver driver;
 
  @FindBy(xpath="//*[@id='search']/input")
  private WebElement searchBar;

  @FindBy(xpath="//*[@id='search']/span")
  private WebElement searchBtn;
  
  @FindBy(xpath="//*[@id='content']/div[3]")
  private WebElement searchResult;
  
  @FindBy(xpath="//*[@id='content']/p[2]")
  private WebElement errorProductMsg;
  
        public SearchPage(WebDriver driver) {
           this.driver= driver;
          PageFactory.initElements(driver, this);
        }
  
    public boolean SearchBarIsDisplay() {
   	    return searchBar.isDisplayed();
   }
    public void SearchBar(String Product) {
      	 searchBar.sendKeys(Product);
      }
    public void ClickonSearchBtn() {
     	 searchBtn.click();
     }
    public boolean ProductIsDisplay() {
    	return searchResult.isDisplayed();
    }
    public boolean ProducterrorMsgIsDisplay() {
    	return errorProductMsg.isDisplayed();
    }
}
