package com.ctli.it.webpage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.BaseClass;
import com.ctli.it.lib.DataTable;
import com.relevantcodes.extentreports.ExtentTest;

public class Ghost_Homepage extends BaseClass{

	public Ghost_Homepage(WebDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath=".//*[@class='gh-nav-body']/ul/li[1]/a")
	public WebElement lbl_newstories;
	
	
	@FindBy(xpath=".//*[@placeholder='Post Title']")
	public WebElement tbx_posttitle;
	
	
	//@FindBy(xpath=".//*[@placeholder='Post Title']/parent::div/div[1]/div[6]")
//	@FindBy(xpath=".//pre[@role='presentation']")
	@FindBy(css = "div[class *='CodeMirror-scroll'][draggable=\"true\"]")
	public WebElement tbx_bodytype;
	
	
	@FindBy(xpath=".//span[contains(text(),'Publish')]")
	public WebElement lbl_publish;
	
	
	@FindBy(xpath=".//*[text()='Set it live now']")
	public WebElement rbn_setitnw;
	
	
	//@FindBy(xpath="@FindBy(xpath=".//*[@class='gh-publishmenu-footer']/button[2]")")
	@FindBy(xpath=".//*[@class='gh-publishmenu-footer']/button[2]")
	public WebElement btn_publish;
	
	@FindBy(xpath=".//*[@class='gh-publishmenu-footer']/button[@class='gh-btn gh-btn-blue gh-publishmenu-button gh-btn-icon gh-btn-green ember-view']")
	public WebElement lbl_published;
	
	
	@FindBy(xpath=".//*[@class='gh-nav-menu-icon']")
	public WebElement btn_usericon;
	
	@FindBy(xpath=".//*[@id='ember-basic-dropdown-wormhole']//.[@role='presentation']//.[contains(text(),'Sign Out')]")
	public WebElement btn_signout;
	

	public void completescenario1() {		
		
		
		isVisible(lbl_newstories);
		System.out.println("Thread Id:- " + Thread.currentThread().getId());

		int i=1;
		int j=0;
		while(i<=2) {
			click(lbl_newstories);			
			DataTable dTable = new DataTable("./Resources/FeatureInput.xlsx");
			String userName = dTable.getCellData("TEST1", "username", 2+j);
			String userID = dTable.getCellData("TEST", "userID", 2+j);
			String fibNum = dTable.getCellData("TEST", "id", 2+j);
			String title = dTable.getCellData("TEST", "title", 2+j);
			String body = dTable.getCellData("TEST", "body", 2+j);
			j++;
			isVisible(tbx_posttitle);
			type(tbx_posttitle, userName+" ##"+userID+" ##"+Thread.currentThread().getId()+" ##"+fibNum+" ##"+title);

			Actions actions = new Actions(driver);
			actions.moveToElement(tbx_bodytype);
			actions.click();
			actions.sendKeys(body);
			actions.build().perform();			
			
			click(lbl_publish);
			
			isVisible(rbn_setitnw);
			
			rbn_setitnw.click();
			
			click(btn_publish);
			
			isVisible(lbl_published);
			i++;
		}		
		
		click(btn_usericon);
		
		isVisible(btn_signout);
		
		click(btn_signout);
	}
	
public void completescenario2() {		
		
		
		isVisible(lbl_newstories);
		System.out.println("Thread Id:- " + Thread.currentThread().getId());

		int i=1;
		int j=0;
		while(i<=2) {
			click(lbl_newstories);			
			DataTable dTable = new DataTable("./Resources/FeatureInput.xlsx");
			String userName = dTable.getCellData("TEST1", "username", 4+j);
			String userID = dTable.getCellData("TEST", "userID", 4+j);
			String fibNum = dTable.getCellData("TEST", "id", 4+j);
			String title = dTable.getCellData("TEST", "title", 4+j);
			String body = dTable.getCellData("TEST", "body", 4+j);
			j++;
			isVisible(tbx_posttitle);
			type(tbx_posttitle, userName+" ##"+userID+" ##"+Thread.currentThread().getId()+" ##"+fibNum+" ##"+title);

			Actions actions = new Actions(driver);
			actions.moveToElement(tbx_bodytype);
			actions.click();
			actions.sendKeys(body);
			actions.build().perform();			
			
			click(lbl_publish);
			
			isVisible(rbn_setitnw);
			
			rbn_setitnw.click();
			
			click(btn_publish);
			
			isVisible(lbl_published);
			i++;
		}		
		
		click(btn_usericon);
		
		isVisible(btn_signout);
		
		click(btn_signout);
	}

public void completescenario3() {		
	
	
	isVisible(lbl_newstories);
	System.out.println("Thread Id:- " + Thread.currentThread().getId());

	int i=1;
	int j=0;
	while(i<=2) {
		click(lbl_newstories);			
		DataTable dTable = new DataTable("./Resources/FeatureInput.xlsx");
		String userName = dTable.getCellData("TEST1", "username", 6+j);
		String userID = dTable.getCellData("TEST", "userID", 6+j);
		String fibNum = dTable.getCellData("TEST", "id", 6+j);
		String title = dTable.getCellData("TEST", "title", 6+j);
		String body = dTable.getCellData("TEST", "body", 6+j);
		j++;
		isVisible(tbx_posttitle);
		type(tbx_posttitle, userName+" ##"+userID+" ##"+Thread.currentThread().getId()+" ##"+fibNum+" ##"+title);

		Actions actions = new Actions(driver);
		actions.moveToElement(tbx_bodytype);
		actions.click();
		actions.sendKeys(body);
		actions.build().perform();			
		
		click(lbl_publish);
		
		isVisible(rbn_setitnw);
		
		rbn_setitnw.click();
		
		click(btn_publish);
		
		isVisible(lbl_published);
		i++;
	}		
	
	click(btn_usericon);
	
	isVisible(btn_signout);
	
	click(btn_signout);
}

public void completescenario4() {		
	
	
	isVisible(lbl_newstories);
	System.out.println("Thread Id:- " + Thread.currentThread().getId());

	int i=1;
	int j=0;
	while(i<=2) {
		click(lbl_newstories);			
		DataTable dTable = new DataTable("./Resources/FeatureInput.xlsx");
		String userName = dTable.getCellData("TEST1", "username", 8+j);
		String userID = dTable.getCellData("TEST", "userID", 8+j);
		String fibNum = dTable.getCellData("TEST", "id", 8+j);
		String title = dTable.getCellData("TEST", "title", 8+j);
		String body = dTable.getCellData("TEST", "body", 8+j);
		j++;
		isVisible(tbx_posttitle);
		type(tbx_posttitle, userName+" ##"+userID+" ##"+Thread.currentThread().getId()+" ##"+fibNum+" ##"+title);

		Actions actions = new Actions(driver);
		actions.moveToElement(tbx_bodytype);
		actions.click();
		actions.sendKeys(body);
		actions.build().perform();			
		
		click(lbl_publish);
		
		isVisible(rbn_setitnw);
		
		rbn_setitnw.click();
		
		click(btn_publish);
		
		isVisible(lbl_published);
		i++;
	}		
	
	click(btn_usericon);
	
	isVisible(btn_signout);
	
	click(btn_signout);
}


}
