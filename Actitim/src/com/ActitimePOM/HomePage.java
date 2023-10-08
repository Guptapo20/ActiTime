package com.ActitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//decration
	@FindBy (xpath="//div[.='Tasks']")
	private WebElement taskstab;
	
	@FindBy (id="logoutLink")
	private WebElement lgoutlink;
	//initillation
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getTaskstab() {
		return taskstab;
	}
	public WebElement getLgoutlink() {
		return lgoutlink;
	}
	
	}
	


