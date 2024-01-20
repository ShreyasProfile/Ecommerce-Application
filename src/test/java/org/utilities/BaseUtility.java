package org.utilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	public void waitForUrlContains(WebDriver driver, int time, String text) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.urlContains(text));
	}
	public void waitForTitleContains(WebDriver driver, int time, String text) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.titleContains(text));
	}
	public void switchToFrame(WebDriver driver, int time, WebElement ele) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
	}
	public boolean isAlertPresent(WebDriver driver, int time) {
		try {
			WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	public ArrayList<String> getAllSelectedOptionsText(WebElement ele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ele);
		for(int i=0; i<sel.getAllSelectedOptions().size(); i++) {
//			WebElement option1 = sel.getAllSelectedOptions().get(i);
//			String text = option1.getText();
//			ar.add(text);
			ar.add(sel.getAllSelectedOptions().get(i).getText());
		}
		return ar;
	}
	public void selectByVisibleText(WebElement ele,String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	//create 2 more methods: value, index
	public WebElement getSelectedOption(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getFirstSelectedOption();
	}
	public String getSelectedOptionText(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getFirstSelectedOption().getText();
	}
	public List<WebElement> getAllOptions(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getOptions();
	}
	public int getNumberOfOptions(WebElement ele) {
		Select sel = new Select(ele);
		return sel.getOptions().size();
	}
	public ArrayList<String> getAllOptionsText(WebElement ele) {
		ArrayList<String> ar = new ArrayList<String>();
		Select sel = new Select(ele);
		//List<WebElement> list = sel.getOptions();
		for(int i=0; i<sel.getOptions().size(); i++) {

			ar.add(sel.getOptions().get(i).getText());
		}
		return ar;
	}
	public void waitForAttributeContains(WebDriver driver,int time,WebElement ele,String attribute,String value) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.attributeContains(ele, attribute, value));
	}
	public void scrollByPageDown(WebDriver driver, int numOfTimes) {
		for(int i=1; i<=numOfTimes; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		}
	}
	public void scrollByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	public void clickByJS(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	}
	public void clickByActions(WebDriver driver, WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}
	public void ScrollByActions(WebDriver driver, int x,int y) {
		Actions act = new Actions(driver);
		act.scrollByAmount(x,y).perform();
	}
	public void waitForVisibilitByWebElement(WebDriver driver,int time,WebElement ele) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	

}
