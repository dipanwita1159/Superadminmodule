package com.mohs10.reuse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;

import com.mohs10.ActionDriver.dataMasking;

import com.mohs10.or.HomePage;

public class CommonFuns extends Action {

	public static Action aDriver;
	public WebDriver driver;

	public CommonFuns() {
		aDriver = new Action();
		driver = StartBrowser.driver;
	}
	
	

	// *****************************************************Data Masking Script*******************************************************//

	public void login(String url, String Userid, String Pwd) throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("login for data Masking");
		aDriver.navigateToApplication(url);
		aDriver.type(HomePage.LoginId, Userid, "EmailId  entered");
		aDriver.type(HomePage.Password, Pwd, "Password Entered");
		aDriver.click(HomePage.Login, "button for login clicked");
	}

	public void DataEntry_masked(String name, String location, String email, String password,String role) throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Enter Masked Data");

		aDriver.click(HomePage.addAdmin, "Add Admin button clicked");

		dataMasking.masktext(HomePage.adminName, name, "Adminname entered");
		aDriver.selectDropDown(HomePage.Location,"value",location);

		dataMasking.masktext(HomePage.Email, email, "email enterd");
		dataMasking.masktext(HomePage.password, password, "password entered");
		aDriver.type(HomePage.Role, role, "enter role");
		//Thread.sleep(5000);
       // aDriver.scrollByVisibilityOfElement(driver, HomePage.Ssubmit);
        //aDriver.wait();
	WebElement ele=driver.findElement(By.xpath("//button[@type='submit']"));
        
		JavascriptExecutor ja = (JavascriptExecutor) driver;
		ja.executeScript("window.scrollBy(0,500)");
		ja.executeScript("arguments[0].click();", ele);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//aDriver.click(HomePage.submitINaddAdmin, "Click on Submit button");


	

		Thread.sleep(5000);

	}



	public void logout() throws Exception {
		StartBrowser.childTest = StartBrowser.parentTest.createNode("Log-Out");
		aDriver.click(HomePage.suplogout, "log out button clicked");
		aDriver.click(HomePage.singout, "sing out button clicked");
		Thread.sleep(5000);
	}

}
