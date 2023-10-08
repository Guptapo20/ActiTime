package com.ActimeGenericLebary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ActitimePOM.LoginPage;

public class BaseClass {
	FileLibrary f=new FileLibrary();
public static	 WebDriver driver;
  @BeforeSuite
  public void DataBaseConnection() {
	  Reporter.log("database connected",true);
	  
  }
  @BeforeClass
  public void lunchBroswer() throws IOException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String URL = f.readDataFromPropertyFile("url");
	  driver.get(URL);
	  Reporter.log("browser launched",true);
  }
	@BeforeMethod
	public void Login() throws IOException {
	LoginPage lp= new LoginPage(driver);
String un = f.readDataFromPropertyFile("username");
String pw = f.readDataFromPropertyFile("manager");
	lp.getUntbx().sendKeys(un);
	lp.getPwtbx().sendKeys(pw);
	lp.getLgbtn().click();
	
		Reporter.log("logged in successfully",true);
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout succesfully",true);
	}
	
	@AfterClass
	public void closeBrower() {
		driver.close();
		Reporter.log("Browser closed",true);
		
	}
	
	@AfterSuite
	public void DatabaseDisconnection() {
		Reporter.log("DB Disconect",true);
	}
	
	
	
}
