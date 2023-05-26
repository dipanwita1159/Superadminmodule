package com.mohs10.or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	WebDriver driver;
     //Login In OrangeHrm//
	  public static By loginemail=By.xpath("//input[@placeholder='Username']");
	  public static By loginpwd=By.xpath("//input[@placeholder='Password']");
	  public static By clickLoginButton=By.xpath("//button[normalize-space()='Login']");
	  //Admin//
	  public static By adminbuttonClick=By.xpath("//li[1]//a[1]//span[1]");
	  public static By ckeckbox=By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@role='table']/div[1]/div[1]/div[1]/div[1]");
	  public static By deletbutton= By.xpath("//div[45]//div[1]//div[6]//div[1]//button[1]//i[1]");
	  public static By userRole=By.xpath("//div[4]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]");
	  public static By deletrole=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");
	public static By popup=By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");

//jyotsa application(receptionist)//
	public static  By loginid=By.xpath("//input[@id='email']");
	public static By pwd=By.xpath("//input[@id='password']");
	public static By LoginButton=By.xpath("//input[@value='LOGIN']");
	public static By phcName=By.xpath("//input[@name='PHCName']");
	public static By Name=By.xpath("//input[@name='name']");
	public static By dob=By.xpath("//input[@name='date']");
	public static By Occupation=By.xpath("//input[@name='occupation']");
	public static By Relegion=By.xpath("//input[@name='Religion']");
	public static By age=By.xpath("//input[@name='age']");
	public static By contactnumber=By.xpath("//input[@name='contact']");
	public static By gyno=By.xpath("//a[normalize-space()='+Gynaecology Patient']");
	public static By education =By.xpath("//input[@name='education']");
	public static By P_Education=By.xpath("//input[@name='partnersEducation']");
	public static By p_name=By.xpath("//input[@name='partnersName']");
	public static By distict=By.xpath("//input[@name='district']");
	public static By city=By.xpath("//input[@name='cityTownVillage']");
	public static By country=By.xpath("//input[@name='country']");
	public static By state=By.xpath("//input[@name='state']");
	public static By fmem=By.xpath("//input[@name='TotalNoOfFamilyMember']");
	public static By e_mem=By.xpath("//input[@name='NoOfEarningMembers']");
	public static By submit=By.xpath("//button[normalize-space()='Submit']");
	public static By logout=By.xpath("//p[@class='mb-1 text-white']");
	public static By songout=By.xpath("//a[normalize-space()='Signout']");
	//super admin//
	public static By LoginId=By.xpath("//input[@id='email']");
	public static By Password=By.xpath("//input[@id='password']");
	public static By Login=By.xpath("//input[@value='LOGIN']");
	public static By addAdmin=By.xpath("//a[@href='/superadmin/Addadmin']");
	public static By adminName=By.xpath("//input[@id='exampleInputUsername1']");
	public static By Location=By.xpath("//select[@id='locationSelect']");
	public static By Email=By.xpath("//input[@id='exampleInputUsername3']");
	public static By password=By.xpath("//input[@id='exampleInputPassword1']");
	public static By Ssubmit=By.xpath("//button[@type='submit']");
	public static By Role=By.xpath("//input[@id='exampleInputConfirmPassword1']");
	public static By suplogout=By.xpath("//p[@class='mb-1 text-white']");
	public static By singout=By.xpath("//a[normalize-space()='Signout']");
	
	





}
	 