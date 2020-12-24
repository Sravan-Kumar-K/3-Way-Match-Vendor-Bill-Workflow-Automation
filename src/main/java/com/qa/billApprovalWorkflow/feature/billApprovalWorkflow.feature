Feature: Automation testing on 3 Way Match Vendor Bill Approval Workflow

Scenario: Verification of Bill Exceptions in the Vendor Bill
Then Verify Bill exception when the PO is billed before receiving the items with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Bill without IR"
Then Verify Bill exception when there is no match between the PO & Bill with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Bill without PO"
Then Verify Bill exception when there is difference in terms for the Bill & PO with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Terms Diff in Bill PO"
Then Verify Bill exception when there is difference in location for the Bill & PO with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Location Diff in Bill PO"
Then Verify Quantity validation, Quantity tolerance, Quantity Difference exceptions in PO & Bill with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Quantity Variance Bill PO"
Then Verify Amount validation, Amount tolerance exceptions in PO & Bill with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Amount Variance Bill PO"
Then Verify whether mail is sent to the Bill creator when Bill is Approved or Rejected with excel "C:\Users\Sravan Kumar\Desktop\Bill Approval Workflow Data.xlsx,Email on Bill approval"