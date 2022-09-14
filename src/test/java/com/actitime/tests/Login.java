package com.actitime.tests;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.base.BaseClass;
import com.actitime.utils.CommonUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class Login extends BaseClass {
	  
	@Test
	public static void login_001() throws IOException
		{							
			boolean result = CommonUtils.loginToActiTimeApplication();		
			Assert.assertTrue(result, "Could not loggin to actitime...");	
			
		}		 
	 
	 
	@Test
	public static void login_002() throws IOException
		{							
			boolean result = CommonUtils.loginToActiTimeApplication();		
			Assert.assertTrue(result, "Could not loggin to actitime...");				
		}	
	
	@Test
	public static void login_003() throws IOException
	{							
		boolean result = CommonUtils.loginToActiTimeApplication();		
		Assert.assertTrue(result, "Could not loggin to actitime...");				
	}	
	
	
}
