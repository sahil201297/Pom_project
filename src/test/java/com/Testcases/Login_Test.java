package com.Testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.HRM.Testbase.TestBase_class;
import com.page.Login_page;
public class Login_Test extends TestBase_class {
Login_page oo;
String title;
public Login_Test()
{
	super();	
}
@BeforeSuite
public void Launch()
{
	initialization();
	oo=new Login_page();
}
@AfterSuite
public void end() {
	close();
}
@Test
public void checktitle()
{
	title=oo.VerifyTitle();
	Assert.assertEquals(title, "OrangeHRM");
}
@Test
public void login_detail() throws IOException
{
	oo.login();
}
}