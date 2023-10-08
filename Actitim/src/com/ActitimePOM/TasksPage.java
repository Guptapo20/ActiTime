package com.ActitimePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	//decleration
	@FindBy (xpath="//div[.='Add New']")
	private WebElement addnew;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement Newcustomer;
	
	@FindBy(xpath= "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custname;
	@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement Createdesp;
	@FindBy (xpath="//div[.='Create Customer']")
	private WebElement createcust;

	//initillation
	public TasksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnew() {
		return addnew;
	}

	public WebElement getNewcustomer() {
		return Newcustomer;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCreatedesp() {
		return Createdesp;
	}

	public WebElement getCreatecust() {
		return createcust;
	}
	
	

}
