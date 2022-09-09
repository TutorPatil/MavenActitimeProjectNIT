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
	
	@Test
	public static void login_004() throws IOException
	{							
		boolean result = CommonUtils.loginToActiTimeApplication();		
		Assert.assertTrue(result, "Could not loggin to actitime...");				
	}	
	
		/*
		 * public static void main(String[] args) {
		 * 
		 * // Create the object of Extent Report class ExtentReports extent = new
		 * ExtentReports();
		 * 
		 * // Creating the object of the file class where we want to write the extent
		 * report File f = new File("./src/test/results/eresults.html");
		 * 
		 * // Create the object of Extent Spark Reporter to write the results to the
		 * report file... ExtentSparkReporter reporter = new ExtentSparkReporter(f);
		 * 
		 * // attaching the reporter to write the data extent.attachReporter(reporter);
		 * 
		 * ExtentTest elogger = extent.createTest("Sample Extent Report Test");
		 * 
		 * elogger.log(Status.INFO, " Starting the Sample test case");
		 * elogger.log(Status.INFO, " Trying to launch the browser...");
		 * elogger.log(Status.INFO, " The first test case is completed..");
		 * elogger.log(Status.FAIL, "The first test case Sample Test has Passed");
		 * 
		 * extent.flush();
		 * 
		 * 
		 * 
		 * }
		 */
		
	
	 
	
}
