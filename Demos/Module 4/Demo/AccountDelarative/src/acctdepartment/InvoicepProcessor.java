package acctdepartment;

class InvoiceProcessor {

	InvoiceProcessor() {
		// TODO Auto-generated constructor stub
	}
	
	Report process(Transaction transaction) throws AccountingException {
		if (transaction.getType() != Transaction.INVOICE) {
			throw new AccountingException();
		}
		return new InvoiceReport();
	}

}
