package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class ElementFetch {
	
	public WebElement getWebElement(String indentifierType, String indentifierValue) {
		switch(indentifierType) {
		      
			case "XPATH":
				return BaseTest.driver.findElement(By.xpath(indentifierValue));
				
			case "CSS":
				return BaseTest.driver.findElement(By.cssSelector(indentifierValue));
				
			case "ID":
				return BaseTest.driver.findElement(By.id(indentifierValue));
				
			case "NAME":
				return BaseTest.driver.findElement(By.name(indentifierValue));
				
			default:
				return null;
		}
	}
	
	public List<WebElement> getWebElements(String indentifierType, String indentifierValue) {
		switch(indentifierType) {
		      
			case "XPATH":
				return BaseTest.driver.findElements(By.xpath(indentifierValue));
				
			case "CSS":
				return BaseTest.driver.findElements(By.cssSelector(indentifierValue));
				
			case "ID":
				return BaseTest.driver.findElements(By.id(indentifierValue));
				
			case "NAME":
				return BaseTest.driver.findElements(By.name(indentifierValue));
				
			default:
				return null;
		}
	}
}
