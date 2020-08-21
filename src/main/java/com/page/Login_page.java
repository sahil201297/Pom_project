package com.page;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase_class;

public class Login_page extends TestBase_class {
	String path,username,pass;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
	
	@FindBy(id = "txtUsername")
	WebElement uname;
	@FindBy(id = "txtPassword")
	WebElement pswd;
	@FindBy(id = "btnLogin")
	WebElement btn;
	@FindBy(linkText = "Forgot your password?")
	WebElement forget;
	public  Login_page()
	{
		PageFactory.initElements(driver, this);
		
	}
	public String VerifyTitle()
	{
		return driver.getTitle();
	}
	public void login() throws IOException 
	{
		FileInputStream fil= new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\com.Orangelivepom\\src\\test\\resources\\login.xls");
		wb= new HSSFWorkbook(fil);
		HSSFSheet sheet=wb.getSheet("Sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++)
	    {
	        username=sheet.getRow(i).getCell(0).getStringCellValue();
	        System.out.println("Username is:"+username);
	        pass=sheet.getRow(i).getCell(1).getStringCellValue();
	        System.out.println("Passwords are:"+pass);
	    
		uname.sendKeys(username);
		pswd.sendKeys(pass);
		btn.click();
	    }
//		uname.sendKeys(props.getProperty("Username"));
//		pswd.sendKeys(props.getProperty("Password"));
//		btn.click();
		
	}
	
}

