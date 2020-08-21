package com.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.page.Home_page;


public class Home_test  {
Home_page obj;
@BeforeClass
public void demo()
{
	obj=new Home_page();
	
}
@Test
public void log_out()
{

	obj.logout();
}
@Test
public void Admin()
{
	obj.admin();
}
}
