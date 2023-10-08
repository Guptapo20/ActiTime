package com.ActitimeTestscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ActimeGenericLebary.BaseClass;
import com.ActimeGenericLebary.FileLibrary;
import com.ActitimePOM.HomePage;
import com.ActitimePOM.TasksPage;

public class CreateCustomer extends BaseClass{
	@Test
	public void create() throws EncryptedDocumentException, IOException {
		HomePage hp= new HomePage(driver);
		hp.getTaskstab().click();
		TasksPage tp =new TasksPage(driver);
		tp.getAddnew().click();
		tp.getNewcustomer().click();
		FileLibrary f=new FileLibrary();
	String custname = f.readDataFromExcel("Sheet1", 1, 3);
	tp.getCustname().sendKeys(custname);
	String Createdesp = f.readDataFromExcel("Sheet1", 2, 2);
	tp.getCreatedesp().sendKeys(Createdesp);
	tp.getCreatecust().click();   
	}
	

}
