package com.qa.billApprovalWorkflow.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.qa.billApprovalWorkflow.util.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//li[contains(@id,'ns-header-menu-userrole-item')]/a/span[@class='ns-role-menuitem-text']")
	List<WebElement> rolesList;
	
	@FindBy(xpath = "//div[@class='ns-role']/span[2]")
	WebElement role;
	
	@FindBy(xpath = "//div[@id='devpgloadtime']//following-sibling::div[@class='ns-logo']//img")
	List<WebElement> images;

	@FindBy(xpath = "//span[text()='Transactions']")
	WebElement transactionsLink;
	
	@FindBy(xpath = "//span[text()='Purchases']")
	WebElement PurchasesLink;
	
	@FindBy(xpath = "//span[text()='Enter Purchase Orders']")
	WebElement enterPurchaseOrderLink;
	
	@FindBy(xpath = "//span[text()='Lists']")
	WebElement listsLink;
	
	@FindBy(xpath = "//span[text()='Relationships']")
	WebElement relationshipsLink;
	
	@FindBy(xpath = "//span[text()='Vendors']")
	WebElement vendorsLink;
	
	@FindBy(xpath = "//span[text()='Payables']")
	WebElement payablesLink;
	
	@FindBy(xpath = "//span[text()='Enter Bills']")
	WebElement enterBillsLink;
	
	@FindBy(xpath = "//input[@id='inpt_customform1']")
	WebElement POform;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> dropdownList;
	
	@FindBy(xpath = "//input[@name='inpt_entity']")
	WebElement vendorDropdown;
	
	@FindBy(xpath = "//input[@name='inpt_approvalstatus']")
	WebElement approvalStatusDropdown;
	
	@FindBy(xpath = "//span[@id='location_fs']//input[@name='inpt_location']")
	WebElement locationDropdown;
		
	@FindBy(xpath = "//a[@id='itemtxt']")
	WebElement itemSubtab;
	
	@FindBy(xpath = "//span[@id='parent_actionbuttons_item_item_fs']//a[2]")
	WebElement itemArrowBtn;
	
	@FindBy(xpath = "//div[@id='item_item_fs_tooltipMenu']//a[@id='item_popup_list']")
	WebElement itemListBtn;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//input[@id='st']")
	WebElement itemSearchBox;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//input[@id='Search']")
	WebElement itemSearchBtn;
	
	@FindBy(xpath = "//div[@id='popup_outerdiv']//div[@id='inner_popup_div']//table//tr//td//following-sibling::td//a")
	List<WebElement> itemList;
	
	@FindBy(xpath = "//input[@id='quantity_formattedValue']")
	WebElement itemQuantityBox;
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@class,'uir-machine-row-focused')]//td[count(//tr[@id='item_headerrow']//div[text()='Amount']//parent::td//preceding-sibling::td)+1]")
	WebElement amountDiv;
	
	@FindBy(xpath = "//table[@id='item_splits']//input[@id='amount_formattedValue']")
	WebElement amountBox;
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@class,'uir-machine-row-focused')]//td[count(//tr[@id='item_headerrow']//div[text()='Location']//parent::td//preceding-sibling::td)+1]")
	WebElement locationDiv;
	
	@FindBy(xpath = "//span[@id='item_location_fs']//input[@name='inpt_location']")
	WebElement locationDropdownLineLevel;
	
	@FindBy(xpath = "//input[@id='item_addedit']")
	WebElement itemAddBtn;
	
	@FindBy(xpath = "//a[text()='illing']")
	WebElement billingSubtab;
	
	@FindBy(xpath = "//input[@name='inpt_terms']")
	WebElement termsDropdown;
		
	@FindBy(xpath = "//input[@id='btn_secondarymultibutton_submitter']")
	WebElement secondarySaveBtn;
	
	@FindBy(xpath = "//div[@class='descr']")
	WebElement confirmationMsg;
	
	@FindBy(xpath = "//div[@class='uir-record-id']")
	WebElement poNumber;
	
	@FindBy(xpath = "//div[@class='uir-record-name']")
	WebElement poVendor;
	
	@FindBy(xpath = "//input[@id='bill']")
	WebElement billBtn;
	
	@FindBy(xpath = "//input[@id='receive']")
	WebElement receiveBtn;
	
	@FindBy(xpath = "//input[contains(@id,'itemreceive')]//following-sibling::img")
	List<WebElement> receiveCheckboxList;
	
	@FindBy(xpath = "//div[@class='uir-record-id']")
	WebElement irNumber;
	
	@FindBy(xpath = "//div[@class='uir-record-name']")
	WebElement irVendorName;
	
	@FindBy(xpath = "//td[contains(@id,'tdbody_custpageworkflow')]//input[@value='Bill Exception']")
	WebElement billExceptionBtn;
	
	@FindBy(xpath = "//tr[contains(@id,'row')]//td")
	List<WebElement> exceptionsList;
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@id,'item_row')]//td[count(//tr[@id='item_headerrow']//div[text()='Quantity']//parent::td//preceding-sibling::td)+1]")
	List<WebElement> quantityListLineLevelInBill;
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@id,'item_row')]//td[count(//tr[@id='item_headerrow']//div[text()='Amount']//parent::td//preceding-sibling::td)+1]")
	List<WebElement> amountListLineLevelInBill;
	
	@FindBy(xpath = "//table[@id='item_splits']//tr[contains(@id,'item_row')]//td[count(//tr[@id='item_headerrow']//div[text()='Location']//parent::td//preceding-sibling::td)+1]")
	List<WebElement> locationsListLineLevelInBill;
	
	@FindBy(xpath = "//input[@id='item_addedit']")
	WebElement okBtn;
	
	@FindBy(xpath = "//tr[contains(@id,'row')]//td[3]//a")
	List<WebElement> vendorNamesList;
	
	@FindBy(xpath = "//input[@id='edit']")
	WebElement editBtn;
	
	@FindBy(xpath = "//a[text()='inancial']")
	WebElement financialTab;
	
	@FindBy(xpath = "//input[@id='purchaseorderquantity_formattedValue']")
	WebElement quantityToleranceVbPo;
	
	@FindBy(xpath = "//input[@id='purchaseorderamount_formattedValue']")
	WebElement amountToleranceVbPo;
	
	@FindBy(xpath = "//input[@id='purchaseorderquantitydiff_formattedValue']")
	WebElement quantityDifferenceVbPo;
	
	@FindBy(xpath = "//input[@id='3way_custombutton']")
	WebElement backBtn;
	
	@FindBy(xpath = "//span[@id='transactionnumber_fs_lbl_uir_label']//following-sibling::span")
	WebElement billTransactionNumber;
	
	@FindBy(xpath = "//span[@id='nextapprover_fs_lbl_uir_label']//following-sibling::span")
	WebElement nextApproverLink;
	
	@FindBy(xpath = "//a[@id='cmmnctntabtxt']")
	WebElement communicationTab;
	
	@FindBy(xpath = "//span[@id='email_fs_lbl_uir_label']//following-sibling::span//a")
	WebElement emailField;
	
	@FindBy(xpath = "//div[@id='messages_layer']//table[@id='messages__tab']//tbody//tr//td[6]")
	List<WebElement> subjectInCommunication;
	
	@FindBy(xpath = "//div[@id='messages_layer']//table[@id='messages__tab']//tbody//tr//td[5]")
	List<WebElement> recipientInCommunication;
	
	@FindBy(xpath = "//input[@name='inpt_nextapprover']")
	WebElement nextApproverDropdown;
	
	@FindBy(xpath = "//input[@value='Approve Bill'][not(contains(@id,'secondarycustpageworkflow'))]")
	WebElement approveBillBtn;
	
	@FindBy(xpath = "//input[@value='Reject Bill'][not(contains(@id,'secondarycustpageworkflow'))]")
	WebElement rejectBillBtn;
		
	public HomePage() {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}
	
	public void verifyEmailApproval(String approver, String approvalFlag, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		editBtn.click();
		
		// Change Next approver & save bill
		Thread.sleep(5000);
		eleClickable(driver, nextApproverDropdown, 10);
		je.executeScript("window.scrollTo(0,0)");
		action.moveToElement(nextApproverDropdown).build().perform();
		nextApproverDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(approver)) {
				dropdownList.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//input[@id='btn_multibutton_submitter']")).click();
		eleAvailability(driver, confirmationMsg, 20);
		
		// Approve or reject bill
		if(approvalFlag.equals("Approve")) 
			approveBillBtn.click();
		else if(approvalFlag.equals("Reject")) 
			rejectBillBtn.click();
		
		// Verify email in communication tab
		eleAvailability(driver, billTransactionNumber, 10);
		String tranNo = billTransactionNumber.getText().trim();
		String billCreator = driver.findElement(By.xpath("//div[@class='ns-role']//span[1][not(@class)]")).getText().trim();
		String subject = null;
		if(approvalFlag.equals("Approve")) 
			subject = "Your Vendor Bill "+tranNo+" is Approved";
		else if(approvalFlag.equals("Reject")) 
			subject = "Your Vendor Bill "+tranNo+" is Rejected";
		communicationTab.click();
	    Thread.sleep(3000);
	    je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    boolean emailFlag = false;
	    for (int i = 0; i < subjectInCommunication.size(); i++) {
	    	String currentSubject = subjectInCommunication.get(i).getText().trim();
	    	String currentrecipient = recipientInCommunication.get(i).getText().trim();
			if(currentSubject.equals(subject) && currentrecipient.contains(approver))
				emailFlag = true;
		}
	    if (emailFlag) {
	    	if(approvalFlag.equals("Approve")) {
	    		System.out.println("A mail with approved bill is sent to Bill creator: "+billCreator);
				logInfo.pass("A mail with approved bill is sent to Bill creator: "+billCreator);
	    	}
			else if(approvalFlag.equals("Reject")) {
	    		System.out.println("A mail with rejected bill is sent to Bill creator: "+billCreator);
				logInfo.pass("A mail with rejected bill is sent to Bill creator: "+billCreator);
	    	}
			
		}else {
	    	if(approvalFlag.equals("Approve")) {
	    		System.out.println("A mail with approved bill is not sent to Bill creator: "+billCreator);
				logInfo.fail("A mail with approved bill is not sent to Bill creator: "+billCreator);
	    	}
			else if(approvalFlag.equals("Reject")) {
	    		System.out.println("A mail with rejected bill is not sent to Bill creator: "+billCreator);
				logInfo.fail("A mail with rejected bill is not sent to Bill creator: "+billCreator);
	    	}
			
		}
		
	}
	
	public List<String> getAmountExceptions(String amountTolerance, String poAmount, String billAmount, String item) {
		List<String> exceptions = new ArrayList<>();
		Double aTolerance = null;
		if(!amountTolerance.equals("null"))
			aTolerance = Double.parseDouble(amountTolerance);
		
		if(poAmount.contains(",")) {
			String[] poAmountList = poAmount.split(",");
			String[] billAmountList = billAmount.split(",");
			String[] itemList = item.split(",");
			for (int i = 0; i < billAmountList.length; i++) {
				Double amountPo = Double.parseDouble(poAmountList[i]);
				Double amountBill = Double.parseDouble(billAmountList[i]);
				Double amountVariance = Math.abs(amountPo - amountBill);
				if (amountPo > amountBill) {
					exceptions.add("PO amount exceeds Bill amount/"+itemList[i]);
					System.out.println("PO amount exceeds Bill amount for item: "+itemList[i]);
				} else if (amountBill > amountPo) {
					exceptions.add("Bill amount exceeds PO amount/"+itemList[i]);
					System.out.println("Bill amount exceeds PO amount for item: "+itemList[i]);
				}
				if(!amountTolerance.equals("null")) {
					double amountToleranceLimit = aTolerance * amountPo;
					if(amountVariance > amountToleranceLimit) {
						exceptions.add("Discrepancy between the Amount on Bill and PO exceeds the Vendor Amount Tolerance limit/"+itemList[i]);
						System.out.println("Discrepancy between the Amount on Bill and PO exceeds the Vendor Amount Tolerance limit for item: "+itemList[i]);
					}
				}
			}
		}else {
			Double amountPo = Double.parseDouble(poAmount);
			Double amountBill = Double.parseDouble(billAmount);
			Double amountVariance = Math.abs(amountPo - amountBill);
			if (amountPo > amountBill) {
				exceptions.add("PO amount exceeds Bill amount/"+item);
				System.out.println("PO amount exceeds Bill amount for item: "+item);
			} else if (amountBill > amountPo) {
				exceptions.add("Bill amount exceeds PO amount/"+item);
				System.out.println("Bill amount exceeds PO amount for item: "+item);
			}
			if(!amountTolerance.equals("null")) {
				double amountToleranceLimit = aTolerance * amountPo;
				if(amountVariance > amountToleranceLimit) {
					exceptions.add("Discrepancy between the Amount on Bill and PO exceeds the Vendor Amount Tolerance limit/"+item);
					System.out.println("Discrepancy between the Amount on Bill and PO exceeds the Vendor Amount Tolerance limit for item: "+item);
				}
			}
		}
		
		return exceptions;
	}
	
	public List<String> getQuantityExceptions(String quantityTolerance, String quantityDifference, String poQuantity, String billQuantity, String item) {
		Double qTolerance = null, qDifference = null;
		if(!quantityTolerance.equals("null"))
			qTolerance = Double.parseDouble(quantityTolerance);
		if(!quantityDifference.equals("null"))
			qDifference = Double.parseDouble(quantityDifference);
		List<String> exceptions = new ArrayList<>();
		
		if(poQuantity.contains(",")) {
			String[] poQuantityList = poQuantity.split(",");
			String[] billQuantityList = billQuantity.split(",");
			String[] itemList = item.split(",");
			for (int i = 0; i < billQuantityList.length; i++) {
				Double quantityPo = Double.parseDouble(poQuantityList[i]);
				Double quantityBill = Double.parseDouble(billQuantityList[i]);
				Double quantityVariance = Math.abs(quantityPo - quantityBill);
				if (quantityPo > quantityBill) {
					exceptions.add("PO quantity exceeds Bill quantity/"+itemList[i]);
					System.out.println("PO quantity exceeds Bill quantity for item no: "+i);
				} else if (quantityBill > quantityPo) {
					exceptions.add("Bill quantity exceeds PO quantity/"+itemList[i]);
					System.out.println("Bill quantity exceeds PO quantity for item no: "+i);
				}
				if(!quantityTolerance.equals("null")) {
					double quantityToleranceLimit = qTolerance * quantityPo;
					if(quantityVariance > quantityToleranceLimit) {
						exceptions.add("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity Tolerance limit/"+itemList[i]);
						System.out.println("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity Tolerance limit for item no: "+i);
					}
				}
				if(!quantityDifference.equals("null")) {
					if(quantityVariance > qDifference) {
						exceptions.add("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity difference limit/"+itemList[i]);
						System.out.println("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity difference limit for item no: "+i);
					}
				}
			}
		}else {
			Double quantityPo = Double.parseDouble(poQuantity);
			Double quantityBill = Double.parseDouble(billQuantity);
			Double quantityVariance = Math.abs(quantityPo - quantityBill);
			if (quantityPo > quantityBill) {
				exceptions.add("PO quantity exceeds Bill quantity/"+item);
				System.out.println("PO quantity exceeds Bill quantity");
			} else if (quantityBill > quantityPo) {
				exceptions.add("Bill quantity exceeds PO quantity/"+item);
				System.out.println("Bill quantity exceeds PO quantity");
			}
			if(!quantityTolerance.equals("null")) {
				double quantityToleranceLimit = qTolerance * quantityPo;
				if(quantityVariance > quantityToleranceLimit) {
					exceptions.add("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity Tolerance limit/"+item);
					System.out.println("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity Tolerance limit");
				}
			}
			if(!quantityDifference.equals("null")) {
				if(quantityVariance > qDifference) {
					exceptions.add("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity difference limit/"+item);
					System.out.println("Discrepancy between the Quantity on Bill and PO exceeds the Vendor Quantity difference limit");
				}
			}
		}
		
		return exceptions;
	}
	
	public void updateBill(String location, String item, String quantity, String amount, String terms, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		eleClickable(driver, billBtn, 10);
		billBtn.click();
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(500);
		
		if(item.contains(",")) {
			String[] itemsList = item.split(",");
			String[] quantityList = quantity.split(",");
			String[] amountList = amount.split(",");
			for (int i = 0; i < itemsList.length; i++) {
				
				if(!quantityListLineLevelInBill.get(i).getText().trim().equals(quantityList[i])) {
					eleClickable(driver, quantityListLineLevelInBill.get(i), 10);
					je.executeScript("arguments[0].click();", quantityListLineLevelInBill.get(i));
					action.click(itemQuantityBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(itemQuantityBox, quantityList[i]).build().perform();
					okBtn.click();
					Thread.sleep(2000);
				}
				
				double actualAmount = Double.parseDouble(amountListLineLevelInBill.get(i).getText().trim());
				System.out.println(actualAmount+ " "+Double.parseDouble(amountList[i]));
				if(actualAmount != Double.parseDouble(amountList[i])) {
					eleClickable(driver, amountListLineLevelInBill.get(i), 10);
					je.executeScript("arguments[0].click();", amountListLineLevelInBill.get(i));
					action.click(amountBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(amountBox, amountList[i]).build().perform();
					okBtn.click();
					if(isAlertPresent()) {
						Thread.sleep(1000);
						Alert alert = driver.switchTo().alert();
						String alertMsg = alert.getText();
						System.out.println("Alert occured: "+alertMsg);
						alert.accept();
					}
					Thread.sleep(2000);
				}
				
			}
		}else {
			for (int i = 0; i < quantityListLineLevelInBill.size(); i++) {
				
				if(!quantityListLineLevelInBill.get(i).getText().trim().equals(quantity)) {
					eleClickable(driver, quantityListLineLevelInBill.get(i), 10);
					je.executeScript("arguments[0].click();", quantityListLineLevelInBill.get(i));
					action.click(itemQuantityBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(itemQuantityBox, quantity).build().perform();
					okBtn.click();
					Thread.sleep(2000);
				}
				
				double actualAmount = Double.parseDouble(amountListLineLevelInBill.get(i).getText().trim());
				if(actualAmount != Double.parseDouble(amount)) {
					eleClickable(driver, amountListLineLevelInBill.get(i), 10);
					je.executeScript("arguments[0].click();", amountListLineLevelInBill.get(i));
					action.click(amountBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(amountBox, amount).build().perform();
					okBtn.click();
					if(isAlertPresent()) {
						Thread.sleep(1000);
						Alert alert = driver.switchTo().alert();
						String alertMsg = alert.getText();
						System.out.println("Alert occured: "+alertMsg);
						alert.accept();
					}
					Thread.sleep(2000);
				}
				
			}
		}
		
		for (int i = 0; i < locationsListLineLevelInBill.size(); i++) {
			List<WebElement> list = driver.findElements(By.xpath("//table[@id='item_splits']//tr[contains(@id,'item_row')]//td[count(//tr[@id='item_headerrow']//div[text()='Location']//parent::td//preceding-sibling::td)+1]"));
			if(!list.get(i).getText().trim().equals(location)) {
				list.get(i).click();
				eleClickable(driver, locationDropdownLineLevel, 10);
				locationDropdownLineLevel.click();
				for(int j=0;j<dropdownList.size();j++) {
					String formValue = dropdownList.get(j).getText().trim();
					if(formValue.equals(location)) {
						dropdownList.get(j).click();
						break;
					}
				}
				okBtn.click();
				Thread.sleep(2000);
			}
		}
		
		billingSubtab.click();
		String termsText = termsDropdown.getAttribute("value").trim();
		if(!termsText.equals(terms)) {
			eleClickable(driver, termsDropdown, 10);
			termsDropdown.click();
			for(int i=0;i<dropdownList.size();i++) {
				String formValue = dropdownList.get(i).getText().trim();
				if(formValue.equals(terms)) {
					dropdownList.get(i).click();
					break;
				}
			}
		}
		
		// Save the Bill
		action.moveToElement(secondarySaveBtn).click(secondarySaveBtn).build().perform();
		
		eleAvailability(driver, By.xpath("//div[@class='descr']"), 20);
		String confirmationMessage = confirmationMsg.getText().trim();
	    if(confirmationMessage.equals("Transaction successfully Saved")) {
	    	System.out.println("Vendor Bill created successfully");
	    	logInfo.pass("Vendor Bill created successfully");
	    }else {
	    	System.out.println("Vendor Bill unable to create");
	    	logInfo.fail("Vendor Bill unable to create");
	    }
	    
	}
	
	public void createNewBill(String vendor, String item, String quantity, String amount, String location, String terms, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		// Select Vendor
		Thread.sleep(5000);
		eleClickable(driver, vendorDropdown, 10);
		vendorDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(vendor)) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Select line item, quantity & rate
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		je.executeScript("arguments[0].click();", itemSubtab);
		if(item.contains(",")) {
			String[] itemsList = item.split(",");
			String[] quantityList = quantity.split(",");
			String[] amountList = amount.split(",");
			String[] locationList = location.split(",");
			for (int i = 0; i < itemsList.length; i++) {
				addItems(itemsList[i], quantityList[i], amountList[i], locationList[i]);
			}
		}else {
			addItems(item, quantity, amount, location);
		}
		
		// Select terms
		billingSubtab.click();
		eleClickable(driver, termsDropdown, 10);
		termsDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(terms)) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Save the Bill
		action.moveToElement(secondarySaveBtn).click(secondarySaveBtn).build().perform();
		
		eleAvailability(driver, By.xpath("//div[@class='descr']"), 20);
		String confirmationMessage = confirmationMsg.getText().trim();
	    if(confirmationMessage.equals("Transaction successfully Saved")) {
	    	System.out.println("Vendor Bill created successfully");
	    	logInfo.pass("Vendor Bill created successfully");
	    }else {
	    	System.out.println("Vendor Bill unable to create");
	    	logInfo.fail("Vendor Bill unable to create");
	    }
	}
	
	public void createNewPO(String vendorData, String locationData, String itemData, String quantity, String amount, String terms, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		// Change the Form to "Standard Purchase Order"
		Thread.sleep(5000);
		eleClickable(driver, By.xpath("//input[@id='inpt_customform1']"), 10);
		POform.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals("Standard Purchase Order")) {
				dropdownList.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		
		// Select Vendor
		eleClickable(driver, vendorDropdown, 10);
		vendorDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(vendorData)) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Select Approval status
		eleClickable(driver, approvalStatusDropdown, 10);
		approvalStatusDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals("Approved")) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Select the location
		eleClickable(driver, locationDropdown, 10);
		locationDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(locationData)) {
				dropdownList.get(i).click();
				break;
			}
		}
		
		// Select line item, quantity & rate
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(500);
		action.click(itemSubtab).build().perform();
		if(itemData.contains(",")) {
			String[] itemsList = itemData.split(",");
			String[] quantityList = quantity.split(",");
			String[] amountList = amount.split(",");
			for (int i = 0; i < itemsList.length; i++) {
				addItems(itemsList[i], quantityList[i], amountList[i]);
			}
		}else {
			addItems(itemData, quantity, amount);
		}
		
		// Select terms
		billingSubtab.click();
		eleClickable(driver, termsDropdown, 10);
		termsDropdown.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(terms)) {
				dropdownList.get(i).click();
				break;
			}
		}
		// Save the PO
		action.moveToElement(secondarySaveBtn).click(secondarySaveBtn).build().perform();
		
		eleAvailability(driver, By.xpath("//div[@class='descr']"), 20);
	    String confirmationMessage = confirmationMsg.getText().trim();
	    String poNumberText = poNumber.getText().trim();
	    String poVendorText = poVendor.getText().trim();
	    if(confirmationMessage.equals("Transaction successfully Saved")) {
	    	System.out.println("Purchase Order '"+poNumberText+" "+poVendorText+"' created successfully");
	    	logInfo.pass("Purchase Order '"+poNumberText+" "+poVendorText+"' created successfully");
	    }else {
	    	System.out.println("PO not created");
	    	logInfo.fail("Purchase Order not created");
	    }
		
	}
	
	public void generateIR(ExtentTest logInfo) throws InterruptedException {
		eleClickable(driver, receiveBtn, 10);
		receiveBtn.click();
		Thread.sleep(1500);
		for (int i = 0; i < receiveCheckboxList.size(); i++) {
			action.moveToElement(receiveCheckboxList.get(i)).click(receiveCheckboxList.get(i)).build().perform();
		}
		action.moveToElement(secondarySaveBtn).click(secondarySaveBtn).build().perform();
		eleAvailability(driver, confirmationMsg, 20);
		String confirmationMessage = confirmationMsg.getText().trim();
		String irNumberText = irNumber.getText().trim();
	    String irVendorText = irVendorName.getText().trim();
	    if(confirmationMessage.equals("Transaction successfully Saved")) {
	    	System.out.println("Item Receipt '"+irNumberText+" "+irVendorText+"' created successfully");
	    	logInfo.pass("Item Receipt '"+irNumberText+" "+irVendorText+"' created successfully");
	    }else {
	    	System.out.println("Item Receipt unable to create");
	    	logInfo.fail("Item Receipt unable to create");
	    }
	    
	    driver.findElement(By.xpath("//span[@id='createdfrom_lbl_uir_label']//following-sibling::span//a")).click();
	    
	}
	
	public void generateVendorBillWithoutIR(ExtentTest logInfo) throws InterruptedException {
		billBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btn_multibutton_submitter']")).click();
		eleAvailability(driver, confirmationMsg, 20);
		String confirmationMessage = confirmationMsg.getText().trim();
	    if(confirmationMessage.equals("Transaction successfully Saved")) {
	    	System.out.println("Vendor Bill created successfully");
	    	logInfo.pass("Vendor Bill created successfully");
	    }else {
	    	System.out.println("Vendor Bill unable to create");
	    	logInfo.fail("Vendor Bill unable to create");
	    }
	}
	
	public void verifyEmail(boolean exceptionFlag, ExtentTest logInfo) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		if(exceptionFlag) {
			eleAvailability(driver, billTransactionNumber, 10);
			String tranNo = billTransactionNumber.getText().trim();
			action.keyDown(Keys.CONTROL).click(nextApproverLink).keyUp(Keys.CONTROL).build().perform();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    String entityName = driver.findElement(By.xpath("//div[@class='uir-record-name']")).getText().trim();
		    String email = emailField.getText().trim();
		    driver.close();
		    driver.switchTo().window(tabs.get(0));
		    communicationTab.click();
		    Thread.sleep(3000);
		    je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		    boolean emailFlag1 = false;
		    boolean emailFlag2 = false;
		    for (int i = 0; i < subjectInCommunication.size(); i++) {
		    	String currentSubject = subjectInCommunication.get(i).getText().trim();
		    	String currentrecipient = recipientInCommunication.get(i).getText().trim();
				if(currentSubject.contains(tranNo) && currentrecipient.contains(entityName))
					emailFlag1 = true;
				else if(currentSubject.equals("Approve records") && currentrecipient.equals(email))
					emailFlag2 = true;
			}
		    if (emailFlag1 && emailFlag2) {
				System.out.println("A mail to approve the vendor bill is sent to the Approver: "+entityName);
				logInfo.pass("A mail to approve the vendor bill is sent to the Approver: "+entityName);
			}else {
				System.out.println("A mail to approve the vendor bill is not sent to the Approver: "+entityName);
				logInfo.fail("A mail to approve the vendor bill is not sent to the Approver: "+entityName);
			}
		    
		}else {
			System.out.println("No exceptions occured & email not sent to the approver");
			logInfo.pass("No exceptions occured & email not sent to the approver");
		}
	}

	public boolean verifyBillException(String exception, ExtentTest logInfo) {
		eleClickable(driver, billExceptionBtn, 10);
	    billExceptionBtn.click();
	    eleAvailability(driver, By.xpath("//h1"), 10);
	    boolean tcFlag = false;
	    boolean exceptionFlag = false;
	    for (int i = 0; i < exceptionsList.size(); i++) {
			if(exceptionsList.get(i).getText().trim().equals(exception))
				tcFlag = true;
		}
	    
	    if (tcFlag) {
	    	exceptionFlag = true;
			System.out.println("'"+exception+"' exception occured");
			logInfo.pass("'"+exception+"' exception occured");
		} else {
			System.out.println("'"+exception+"' exception not occured");
			logInfo.pass("'"+exception+"' exception not occured");
		}
	    backBtn.click();
	    eleClickable(driver, editBtn, 10);
	    return exceptionFlag;
	}
	
	public boolean verifyBillException(List<String> exceptions, ExtentTest logInfo) {
		eleClickable(driver, billExceptionBtn, 10);
	    billExceptionBtn.click();
	    eleAvailability(driver, By.xpath("//h1"), 10);
	    boolean exceptionFlag = false;
	    for (int j = 0; j < exceptions.size(); j++) {
	    	boolean tcFlag = false;
	    	String currentException = exceptions.get(j).split("/")[0];
	    	String exceptionForItem = exceptions.get(j).split("/")[1];
		    for (int i = 0; i < exceptionsList.size(); i++) {
				if(exceptionsList.get(i).getText().trim().equals(currentException))
					tcFlag = true;
			}
		    
		    if (tcFlag) {
		    	exceptionFlag = true;
				System.out.println("'"+currentException+"' exception occured for the item: "+exceptionForItem);
				logInfo.pass("'"+currentException+"' exception occured for the item: "+exceptionForItem);
			} else {
				System.out.println("'"+currentException+"' exception not occured for the item: "+exceptionForItem);
				logInfo.fail("'"+currentException+"' exception not occured for the item: "+exceptionForItem);
			}
		}
	    backBtn.click();
	    eleClickable(driver, editBtn, 10);
	    return exceptionFlag;
	}
	
	public void addItems(String itemData, String quantity, String amount) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		itemArrowBtn.click();
		itemListBtn.click();
		eleClickable(driver, itemSearchBox, 10);
		itemSearchBox.sendKeys(itemData);
		itemSearchBtn.click();
		Thread.sleep(3000);
		for(int j=0;j<itemList.size();j++) {
			String parentCustomer = itemList.get(j).getText().trim();
			if(parentCustomer.equals(itemData)) {
				itemList.get(j).click();
				break;
			}
		}
		Thread.sleep(2000);
		action.click(itemQuantityBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(itemQuantityBox, quantity).build().perform();
		eleClickable(driver, amountDiv, 10);
		je.executeScript("arguments[0].click();", amountDiv);
		action.click(amountBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(amountBox, amount).build().perform();
		itemAddBtn.click();
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			alert.accept();
		}
	}
	
	public void addItems(String itemData, String quantity, String amount, String location) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		itemArrowBtn.click();
		itemListBtn.click();
		eleClickable(driver, itemSearchBox, 10);
		itemSearchBox.sendKeys(itemData);
		itemSearchBtn.click();
		Thread.sleep(3000);
		for(int j=0;j<itemList.size();j++) {
			String parentCustomer = itemList.get(j).getText().trim();
			if(parentCustomer.equals(itemData)) {
				itemList.get(j).click();
				break;
			}
		}
		Thread.sleep(2000);
		action.click(itemQuantityBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(itemQuantityBox, quantity).build().perform();
		eleClickable(driver, amountDiv, 10);
		je.executeScript("arguments[0].click();", amountDiv);
		action.click(amountBox).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).sendKeys(amountBox, amount).build().perform();
		eleClickable(driver, locationDiv, 10);
		je.executeScript("arguments[0].click();", locationDiv);
		eleClickable(driver, locationDropdownLineLevel, 10);
		locationDropdownLineLevel.click();
		for(int i=0;i<dropdownList.size();i++) {
			String formValue = dropdownList.get(i).getText().trim();
			if(formValue.equals(location)) {
				dropdownList.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		eleClickable(driver, itemAddBtn, 10);
		je.executeScript("arguments[0].click();", itemAddBtn);
		if(isAlertPresent()) {
			Thread.sleep(1000);
			Alert alert = driver.switchTo().alert();
			String alertMsg = alert.getText();
			System.out.println("Alert occured: "+alertMsg);
			alert.accept();
		}
	}
	
	public void configureVendor(String vendor, String quantityTolerance, String quantityDifference, String amountTolerance) throws InterruptedException {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		clickOnVendorListLink();
		for(int i=0;i<vendorNamesList.size();i++) {
			WebElement currentVendor = vendorNamesList.get(i);
			String text = currentVendor.getText().trim();
			if(text.equals(vendor)) {
				action.moveToElement(currentVendor).build().perform();
				WebElement parentTr = (WebElement)je.executeScript("return arguments[0].parentNode.parentNode;", currentVendor);
				String rowId = parentTr.getAttribute("id");
				if(rowId.isBlank()) {
					WebElement customerRow = (WebElement)je.executeScript("return arguments[0].parentNode;", parentTr);
					rowId = customerRow.getAttribute("id");
				}
				driver.findElement(By.xpath("//table[@id='div__bodytab']//tr[@id='"+rowId+"']//a[text()='View']")).click();
				break;
			}
		}
		editBtn.click();
		financialTab.click();
		Thread.sleep(4000);
		
		// Enter Quantity Tolerance, Quantity Difference values
		action.moveToElement(quantityToleranceVbPo).build().perform();
		if(quantityTolerance.equals("null")) {
			if(!quantityToleranceVbPo.getAttribute("value").isEmpty())
				action.click(quantityToleranceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		}else {
			if(!quantityDifference.isBlank()) {
				if(!quantityToleranceVbPo.getAttribute("value").isEmpty())
					action.click(quantityToleranceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
				quantityToleranceVbPo.sendKeys(quantityTolerance);
			}
		}
		driver.findElement(By.xpath("//div[text()='Vendor Bill Matching']")).click();
		
		action.moveToElement(quantityDifferenceVbPo).build().perform();
		if(quantityDifference.equals("null")) {
			if(!quantityDifferenceVbPo.getAttribute("value").isEmpty())
				action.click(quantityDifferenceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		}else {
			if(!quantityDifference.isBlank()) {
				if(!quantityDifferenceVbPo.getAttribute("value").isEmpty())
					action.click(quantityDifferenceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
				quantityDifferenceVbPo.sendKeys(quantityDifference);
			}
		}
		driver.findElement(By.xpath("//div[text()='Vendor Bill Matching']")).click();
		
		action.moveToElement(amountToleranceVbPo).build().perform();
		if(amountTolerance.equals("null")) {
			if(!amountToleranceVbPo.getAttribute("value").isEmpty())
				action.click(amountToleranceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		}else {
			if(!amountTolerance.isBlank()) {
				if(!amountToleranceVbPo.getAttribute("value").isEmpty())
					action.click(amountToleranceVbPo).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
				amountToleranceVbPo.sendKeys(amountTolerance);
			}
		}
		driver.findElement(By.xpath("//div[text()='Vendor Bill Matching']")).click();
		
		Thread.sleep(3000);
		je.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		eleClickable(driver, secondarySaveBtn, 10);
		je.executeScript("arguments[0].click();", secondarySaveBtn);
		eleAvailability(driver, confirmationMsg, 20);
	}
	
	public void clickOnNewPOLink() throws InterruptedException {
		Thread.sleep(2000);
		eleAvailability(driver, transactionsLink, 10);
		action.moveToElement(transactionsLink).build().perform();
		eleAvailability(driver, PurchasesLink, 10);
		action.moveToElement(PurchasesLink).build().perform();
		eleAvailability(driver, enterPurchaseOrderLink, 10);
		enterPurchaseOrderLink.click();
	}
	
	public void clickOnNewBillLink() throws InterruptedException {
		Thread.sleep(2000);
		eleAvailability(driver, transactionsLink, 10);
		action.moveToElement(transactionsLink).build().perform();
		eleAvailability(driver, payablesLink, 10);
		action.moveToElement(payablesLink).build().perform();
		eleAvailability(driver, enterBillsLink, 10);
		enterBillsLink.click();
	}
	
	public void clickOnVendorListLink() throws InterruptedException {
		Thread.sleep(2000);
		eleAvailability(driver, listsLink, 10);
		action.moveToElement(listsLink).build().perform();
		eleAvailability(driver, relationshipsLink, 10);
		action.moveToElement(relationshipsLink).build().perform();
		eleAvailability(driver, vendorsLink, 10);
		vendorsLink.click();
	}
	
	public void changeRole(String roleTextData, String roleTypeData) throws InterruptedException {
		String currentRole = role.getText().trim();
		if(currentRole.equals(roleTextData)) {
			System.out.println("Role already selected");
		} else {
			Thread.sleep(1000);
			action.moveToElement(driver.findElement(By.xpath("//div[@id='spn_cRR_d1']/a"))).build().perform();
			
			for(int i=0;i<rolesList.size();i++) {
				WebElement roleElement = rolesList.get(i);
				String roleValue = roleElement.getText().trim();
				if(roleValue.equals(roleTextData)) {
					if(roleTypeData.equals("Production")) {
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						WebElement liTagElement = (WebElement)executor.executeScript("return arguments[0].parentNode.parentNode;", roleElement);
						String id = liTagElement.getAttribute("id");
						try {
							WebElement roleType = driver.findElement(By.xpath("//li[@id='"+id+"']/a/span[@class='ns-role-accounttype']"));
							if(roleType.isDisplayed())
								continue;
						}
						catch(NoSuchElementException e) {
							driver.findElement(By.xpath("//li[@id='"+id+"']/a/span[@class='ns-role-menuitem-text']")).click();
							break;
						}
					}
				}
			}
		}
	}
}
