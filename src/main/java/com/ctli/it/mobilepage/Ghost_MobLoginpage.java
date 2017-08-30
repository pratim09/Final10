package com.ctli.it.mobilepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.DataTable;
import com.ctli.it.lib.MobileBaseClass;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Ghost_MobLoginpage extends MobileBaseClass{

	public Ghost_MobLoginpage(AndroidDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath=".//*[@name='identification']")
	public WebElement tbx_userid;
	
	@FindBy(xpath=".//*[@name='password']")
	public WebElement tbx_passwd;
	
	@FindBy(xpath=".//*[@type='submit']")
	public WebElement btn_submit;
	
	
	@FindBy(xpath="//span[text()='New story']")
	public WebElement lbl_newstories;
	
	public void Login_page() {
		
	isVisible(btn_submit);
		
DataTable excelread=new DataTable(System.getProperty("user.dir")+"\\Resources\\FeatureInput.xlsx");
		
		type(tbx_userid,excelread.getCellData("Test1", "Username", 6));
		
		type(tbx_passwd,excelread.getCellData("Test1", "Password", 6));		
		
		click(btn_submit);				
		
		isVisible(lbl_newstories);
		
	}
}
