package acctdepartment;

// The class and constructor are only visible in the acctdepartment package
class PaymentProcessor {
     
	 PaymentProcessor() {}
		
	 Report process(Transaction transaction) throws AccountingException  {
		 if (transaction.getType() != Transaction.PAYMENT) {
			 throw new AccountingException();
		 }
		return new PaymentReport(); 
	 }
	 

}
