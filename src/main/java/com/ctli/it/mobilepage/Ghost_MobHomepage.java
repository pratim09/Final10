package com.ctli.it.mobilepage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.DataTable;
import com.ctli.it.lib.MobileBaseClass;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Ghost_MobHomepage extends MobileBaseClass{

	public Ghost_MobHomepage(AndroidDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

	@FindBy(xpath="//span[text()='New story']")
	public WebElement lbl_newstories;
	
	
	@FindBy(xpath=".//*[@placeholder='Post Title']")
	public WebElement tbx_posttitle;

	@FindBy(xpath = "//div[@class='CodeMirror-lines']")
	public WebElement tbx_bodytype;
	

	@FindBy(xpath="//span[text()='Publish']")
	public WebElement lbl_publish;
	
	
	@FindBy(xpath=".//*[text()='Set it live now']")
	public WebElement rbn_setitnw;
	
	@FindBy(xpath=".//*[@class='gh-publishmenu-footer']/button[2]")
	public WebElement btn_publish;
	
	@FindBy(xpath=".//*[@class='gh-publishmenu-footer']/button[@class='gh-btn gh-btn-blue gh-publishmenu-button gh-btn-icon gh-btn-green ember-view']")
	public WebElement lbl_published;
	
	@FindBy(xpath="//a[@href='#/editor/']")
	public WebElement btn_newstory2;
	
	
	@FindBy(xpath=".//*[@class='gh-nav-menu-icon']")
	public WebElement btn_usericon;
	
	@FindBy(xpath=".//*[@id='ember-basic-dropdown-wormhole']//.[@role='presentation']//.[contains(text(),'Sign Out')]")
	public WebElement btn_signout;
	

	public void completescenario() {
		try {
			
		isVisible(lbl_newstories);
		
		System.out.println("Logged in");
		int i=1;
		int j=0;
		while(i<=2) {
		
	
			jsClick(btn_newstory2);		
	
			
			isVisible(tbx_posttitle);
			
			
			DataTable dTable = new DataTable("./Resources/FeatureInput.xlsx");
			String userName = dTable.getCellData("TEST1", "username", 10+j);
			String userID = dTable.getCellData("TEST", "userID", 10+j);
			String fibNum = dTable.getCellData("TEST", "id", 10+j);
			String title = dTable.getCellData("TEST", "title", 10+j);
			String body = dTable.getCellData("TEST", "body", 10+j);
			j++;
			isVisible(tbx_posttitle);
			type(tbx_posttitle, userName+" ##"+userID+" ##"+Thread.currentThread().getId()+" ##"+fibNum+" ##"+title);

			
			Thread.sleep(2000);
			
			Actions action = new Actions(androiddriver);
			action.moveToElement(tbx_bodytype).click();
			action.sendKeys(body);
			action.build().perform();
				
			Thread.sleep(2000);
			
			isVisible(lbl_publish);
			try {
				click(lbl_publish);
			} catch (Exception e) {
				jsClick(lbl_publish);
				System.out.println("Jsclick");
			}
			
			
			isVisible(rbn_setitnw);
			jsClick(rbn_setitnw);
			jsClick(btn_publish);
			
			isVisible(lbl_published);
			
				Thread.sleep(3000);
			
			i++;
		}		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		

}
