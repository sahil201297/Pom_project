package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase_class;

public class Home_page extends TestBase_class
{
@FindBy(linkText = "Welcome Admin")
WebElement welcome;
@FindBy(linkText = "Logout")
WebElement logout;
@FindBy(linkText = "Admin")
WebElement admin;
@FindBy(id = "searchSystemUser_userName")
WebElement search;
@FindBy(id = "searchBtn")
WebElement searchbttn;

public Home_page()
{
	PageFactory.initElements(driver,this);
	
}
public void logout()
{
	welcome.click();
	logout.click();
}
public void admin()
{
	admin.click();
	search.sendKeys("Admin");
	searchbttn.click();
}
}
