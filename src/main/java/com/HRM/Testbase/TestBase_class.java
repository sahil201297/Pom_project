package com.HRM.Testbase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase_class {
public static WebDriver driver;
public static Properties props;
public TestBase_class ()
{
	try {
		FileInputStream ip=new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\com.Orangelivepom\\src\\main\\java\\com\\HRM\\configuration\\config.properties");
		props=new  Properties();
		props.load(ip);
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}	
}
public static void initialization ()
{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get(props.getProperty("Url"));
	driver.manage().window().maximize();
}
public static void close()
{
	driver.quit();
}
}
