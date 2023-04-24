package acctdepartment;

public class AccountingDepartment implements Accounting {

	private PaymentProcessor pay = null;
	private InvoiceProcessor inv = null;
	public AccountingDepartment() {
		this.pay = new PaymentProcessor();
		this.inv = new InvoiceProcessor();
		System.out.println("Accounting department on-line");
		System.out.println("-----------------------------");
	}

	@Override
	public Report process(Transaction transaction) {
		// If any sort of exception is thrown, we want to handle it inside
		// the system so that we do not go into an unstable state or propagate
		// the exception outside our application.
		// We just forward each transaction that comes in to the component that manages
		// that type of transaction.
		// We also ensure that any invalid transaction types are handled gracefully.
		try {
			switch(transaction.getType()) {
			case Transaction.PAYMENT:
				return this.pay.process(transaction);
			case Transaction.INVOICE:
				return this.inv.process(transaction);
			default:
				Report r = new ErrorReport();
				r.setMessage("This transaction is currently not supported");
				return r;
			}		
	} catch (AccountingException e) {
		Report r = new ErrorReport();
		r.setMessage("An internal error has occured");
		return r;
	}

}
}

// This exception is internal to the accounting department
// It is never seen by the client ever.
@SuppressWarnings("serial")
class AccountingException extends Exception{}