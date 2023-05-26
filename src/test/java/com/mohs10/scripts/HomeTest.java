package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.ActionDriver.XLUtils;

import com.mohs10.base.StartBrowser;

import com.mohs10.reuse.CommonFuns;

public class HomeTest extends StartBrowser {

	String excelFilePath = "C:\\Users\\DELL\\eclipse-workspace\\Superadmin\\TestData\\Data.xlsx";
	String excelsheet = "Login";

	@Test
	public void LoginTestCase3() throws Exception {

		CommonFuns hm2 = new CommonFuns();

		int rowcount = XLUtils.getRowCount(excelFilePath, excelsheet);

		for (int i = 1; i < rowcount; i++) {

			String Email = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 0);
			String Pwd = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 1);
			String adminname = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 2);
			String location = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 3);
			String Emailid = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 4);
			String password = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 5);
			String role=XLUtils.getStringCellData(excelFilePath, excelsheet, i, 20);
		
			
			String url = XLUtils.getStringCellData(excelFilePath, excelsheet, i, 17);
			

			// data Encryption script
			//dataEncryption.encryptData(excelFilePath, excelsheet);

			// data decryption script
			hm2.login(url, Email, Pwd);

			// data Masked script
			hm2.DataEntry_masked(adminname,location,Emailid,password,role );
			//SSreuseclass.SSReusablemethod(driver, "login");// take screenshot

			
			
			SSreuseclass.SSReusablemethod(driver, "enter credtential");// take the screenshort
			
			//logout
			hm2.logout();

			Thread.sleep(5000);

		}
	}

}
