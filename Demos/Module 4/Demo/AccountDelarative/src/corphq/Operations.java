package corphq;

import acctdepartment.Accounting;
import acctdepartment.AccountingDepartment;
import acctdepartment.ErrorReport;
import acctdepartment.InvalidTrans;
import acctdepartment.Invoice;
import acctdepartment.InvoiceReport;
import acctdepartment.Payment;
import acctdepartment.PaymentReport;
import acctdepartment.Report;

public class Operations {

	public static void main(String[] args) {
		Accounting dept = new AccountingDepartment();
		System.out.println(dept.process(new Payment()).getMessage());
		System.out.println(dept.process(new Invoice()).getMessage());
		System.out.println(dept.process(new InvalidTrans()).getMessage());
	}

}
