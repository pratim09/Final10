package com.ctli.it.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.BaseClass;
import com.ctli.it.lib.DataTable;
import com.relevantcodes.extentreports.ExtentTest;

public class Ghost_Loginpage extends BaseClass{

	public Ghost_Loginpage(WebDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@name='identification']")
	public WebElement tbx_userid;
	
	@FindBy(xpath=".//*[@name='password']")
	public WebElement tbx_passwd;
	
	@FindBy(xpath=".//*[@type='submit']")
	public WebElement btn_submit;
	
	@FindBy(xpath=".//*[@class='gh-nav-body']/ul/li[1]/a")
	public WebElement lbl_newstories;
	
	public void Login_page1() {
		
		isVisible(btn_submit);
		
DataTable excelread=new DataTable(System.getProperty("user.dir")+"\\Resources\\FeatureInput.xlsx");
		
		type(tbx_userid,excelread.getCellData("Test1", "Username", 2));
		
		type(tbx_passwd,excelread.getCellData("Test1", "Password", 2));		
		
		click(btn_submit);	
		
		isVisible(lbl_newstories);
	}
	
public void Login_page2() {
		
		isVisible(btn_submit);
		
DataTable excelread=new DataTable(System.getProperty("user.dir")+"\\Resources\\FeatureInput.xlsx");
		
		type(tbx_userid,excelread.getCellData("Test1", "Username", 3));
		
		type(tbx_passwd,excelread.getCellData("Test1", "Password", 3));		
		
		click(btn_submit);	
		
		isVisible(lbl_newstories);
	}

public void Login_page3() {
	
	isVisible(btn_submit);
	
DataTable excelread=new DataTable(System.getProperty("user.dir")+"\\Resources\\FeatureInput.xlsx");
	
	type(tbx_userid,excelread.getCellData("Test1", "Username", 4));
	
	type(tbx_passwd,excelread.getCellData("Test1", "Password", 4));		
	
	click(btn_submit);	
	
	isVisible(lbl_newstories);
}

public void Login_page4() {
	
	isVisible(btn_submit);
	
DataTable excelread=new DataTable(System.getProperty("user.dir")+"\\Resources\\FeatureInput.xlsx");
	
	type(tbx_userid,excelread.getCellData("Test1", "Username", 5));
	
	type(tbx_passwd,excelread.getCellData("Test1", "Password", 5));		
	
	click(btn_submit);	
	
	isVisible(lbl_newstories);
}


}
