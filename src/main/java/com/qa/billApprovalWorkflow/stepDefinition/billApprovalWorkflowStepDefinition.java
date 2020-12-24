package com.qa.billApprovalWorkflow.stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentTest;
import com.qa.billApprovalWorkflow.pages.AuthenticationPage;
import com.qa.billApprovalWorkflow.pages.HomePage;
import com.qa.billApprovalWorkflow.pages.LoginPage;
import com.qa.billApprovalWorkflow.util.ExcelDataToDataTable;
import com.qa.billApprovalWorkflow.util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Then;

public class billApprovalWorkflowStepDefinition extends TestBase{
	
	LoginPage loginPage;
	AuthenticationPage authPage;
	HomePage homePage;
	
	@Then("^Verify Bill exception when the PO is billed before receiving the items with excel \"([^\"]*)\"$")
	public void verify_Bill_exceptions_when_the_Purchase_Order_is_billed_before_receiving_the_items_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Bill exception when the PO is billed before receiving the items");
			loginfo = test.createNode("login");
			// User login to Netsuite with Tvarana Dev Test role
			TestBase.init();
			loginPage = new LoginPage();
			authPage = loginPage.login();
			homePage = authPage.Authentication();
			homePage.changeRole(prop.getProperty("roleText"), prop.getProperty("roleType"));
			loginfo.pass("Login Successful in Netsuite");
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "login");
		}
		
		ExtentTest loginfo2 = null;
		try {
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String location = data.get("Location");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String amount = data.get("Amount");
				String terms = data.get("Terms");
				loginfo2 = test.createNode("Verify Bill exception after creating bill for the data>> Vendor: "+vendor+" Location: "+location+" Item(s): "+item+" Terms: "+terms);
				boolean exceptionFlag;
				homePage.clickOnNewPOLink();
				homePage.createNewPO(vendor, location, item, quantity, amount, terms, loginfo2);
				homePage.generateVendorBillWithoutIR(loginfo2);
				exceptionFlag = homePage.verifyBillException("Items are not yet received", loginfo2);
				homePage.verifyEmail(exceptionFlag, loginfo2);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo2, e, "Verification of Bill exception when the PO is billed before receiving the items");
		}
		
	}

	@Then("^Verify Bill exception when there is no match between the PO & Bill with excel \"([^\"]*)\"$")
	public void verify_Bill_exceptions_when_there_is_no_match_between_the_Purchase_Order_bill_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Bill exception when there is no match between the PO & Bill");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String amount = data.get("Amount");
				String location = data.get("Location");
				String terms = data.get("Terms");
				loginfo = test.createNode("Verify Bill exception after creating bill for the data>> Vendor: "+vendor+" Location: "+location+" Item(s): "+item+" Terms: "+terms);
				boolean exceptionFlag;
				homePage.clickOnNewBillLink();
				homePage.createNewBill(vendor, item, quantity, amount, location, terms, loginfo);
				exceptionFlag = homePage.verifyBillException("No matching PO can be found for the Vendor Bill", loginfo);
				homePage.verifyEmail(exceptionFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Bill exception when there is no match between the PO & Bill");
		}
	}
	
	@Then("^Verify Bill exception when there is difference in terms for the Bill & PO with excel \"([^\"]*)\"$")
	public void verify_Bill_exception_when_there_is_difference_in_terms_for_the_Bill_PO_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Bill exception when there is difference in terms for the Bill & PO");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String location = data.get("Location");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String amount = data.get("Amount");
				String poTerms = data.get("PO Terms");
				String billTerms = data.get("Bill Terms");
				loginfo = test.createNode("Verify Bill exception for the data>> PO Terms: "+poTerms+" Bill Terms: "+billTerms);
				boolean exceptionFlag;
				homePage.clickOnNewPOLink();
				homePage.createNewPO(vendor, location, item, quantity, amount, poTerms, loginfo);
				homePage.generateIR(loginfo);
				homePage.updateBill(location, item, quantity, amount, billTerms, loginfo);
				exceptionFlag = homePage.verifyBillException("Discrepancy between Terms on Bill and PO", loginfo);
				homePage.verifyEmail(exceptionFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Bill exception when there is difference in terms for the Bill & PO");
		}
	}

	@Then("^Verify Bill exception when there is difference in location for the Bill & PO with excel \"([^\"]*)\"$")
	public void verify_Bill_exception_when_there_is_difference_in_location_for_the_Bill_PO_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Bill exception when there is difference in location for the Bill & PO");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String amount = data.get("Amount");
				String terms = data.get("Terms");
				String poLocation = data.get("PO Location");
				String billLocation = data.get("Bill Location");
				loginfo = test.createNode("Verify Bill exception for the data>> PO Location: "+poLocation+" Bill Location: "+billLocation);
				boolean exceptionFlag;
				homePage.clickOnNewPOLink();
				homePage.createNewPO(vendor, poLocation, item, quantity, amount, terms, loginfo);
				homePage.generateIR(loginfo);
				homePage.updateBill(billLocation, item, quantity, amount, terms, loginfo);
				exceptionFlag = homePage.verifyBillException("Discrepancy between Location on Bill and PO", loginfo);
				homePage.verifyEmail(exceptionFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Bill exception when there is difference in location for the Bill & PO");
		}
	}
	
	@Then("^Verify Quantity validation, Quantity tolerance, Quantity Difference exceptions in PO & Bill with excel \"([^\"]*)\"$")
	public void verify_Quantity_validation_Quantity_tolerance_Quantity_Difference_exceptions_in_PO_Bill_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Quantity, Quantity tolerance, Quantity Difference exceptions in PO & Bill");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String location = data.get("Location");
				String item = data.get("Item");
				String amount = data.get("Amount");
				String terms = data.get("Terms");
				String quantityTolerance = data.get("Quantity Tolerance");
				String quantityDifference = data.get("Quantity Difference");
				String poQuantity = data.get("PO Quantity");
				String billQuantity = data.get("Bill Quantity");
				loginfo = test.createNode("Verify all quantity exception(s) on the bill for the data>> Item(s): "+item+" PO Quantity: "+poQuantity+" Bill Quantity: "+billQuantity+" Quantity Tolerance: "+quantityTolerance+" Quantity Difference: "+quantityDifference);
				boolean exceptionFlag;
				List<String> exceptions = new ArrayList<>();
				homePage.configureVendor(vendor, quantityTolerance, quantityDifference, "");
				homePage.clickOnNewPOLink();
				homePage.createNewPO(vendor, location, item, poQuantity, amount, terms, loginfo);
				homePage.generateIR(loginfo);
				homePage.updateBill(location, item, billQuantity, amount, terms, loginfo);
				exceptions = homePage.getQuantityExceptions(quantityTolerance, quantityDifference, poQuantity, billQuantity, item);
				exceptionFlag = homePage.verifyBillException(exceptions, loginfo);
				homePage.verifyEmail(exceptionFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Quantity, Quantity tolerance, Quantity Difference exceptions in PO & Bill");
		}
	}

	@Then("^Verify Amount validation, Amount tolerance exceptions in PO & Bill with excel \"([^\"]*)\"$")
	public void verify_Amount_validation_Amount_tolerance_exceptions_in_PO_Bill_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verification of Amount, Amount tolerance exceptions in PO & Bill");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String location = data.get("Location");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String terms = data.get("Terms");
				String poAmount = data.get("PO Amount");
				String billAmount = data.get("Bill Amount");
				String amountTolerance = data.get("Amount Tolerance");
				loginfo = test.createNode("Verify all amount exception(s) on the bill for the data>> Item(s): "+item+" PO Amount: "+poAmount+" Bill Amount: "+billAmount+" Amount Tolerance: "+amountTolerance);
				boolean exceptionFlag;
				List<String> exceptions = new ArrayList<>();
				homePage.configureVendor(vendor, "", "", amountTolerance);
				homePage.clickOnNewPOLink();
				homePage.createNewPO(vendor, location, item, quantity, poAmount, terms, loginfo);
				homePage.generateIR(loginfo);
				homePage.updateBill(location, item, quantity, billAmount, terms, loginfo);
				exceptions = homePage.getAmountExceptions(amountTolerance, poAmount, billAmount, item);
				exceptionFlag = homePage.verifyBillException(exceptions, loginfo);
				homePage.verifyEmail(exceptionFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verification of Amount, Amount tolerance exceptions in PO & Bill");
		}
	}
	
	@Then("^Verify whether mail is sent to the Bill creator when Bill is Approved or Rejected with excel \"([^\"]*)\"$")
	public void verify_whether_mail_is_sent_to_the_Bill_creator_when_Bill_is_Approved_or_Rejected_with_excel(@Transform(ExcelDataToDataTable.class) DataTable billApprovalData) throws InterruptedException {
		ExtentTest loginfo = null;
		try {
			test = extent.createTest("Verify whether mail is sent to the Bill creator when Bill is Approved or Rejected");
			for(Map<String,String> data: billApprovalData.asMaps(String.class, String.class)) {
				String vendor = data.get("Vendor");
				String item = data.get("Item");
				String quantity = data.get("Quantity");
				String amount = data.get("Amount");
				String location = data.get("Location");
				String terms = data.get("Terms");
				String approver = data.get("Approver");
				String approvalFlag = data.get("Approval Flag");
				loginfo = test.createNode("Verify email after bill creation for the data>> Item(s): "+item+" Terms: "+terms+" Approver: "+approver+" Approval Flag: "+approvalFlag);
				homePage.clickOnNewBillLink();
				homePage.createNewBill(vendor, item, quantity, amount, location, terms, loginfo);
				homePage.verifyEmailApproval(approver, approvalFlag, loginfo);
			}
		} catch (Exception e) {
			testStepHandle("FAIL", driver, loginfo, e, "Verify whether mail is sent to the Bill creator when Bill is Approved or Rejected");
		}
	}
}