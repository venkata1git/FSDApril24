package acctdepartment;

// This is a base class that has all of the shared functionality
// of all transaction types
// As well it provides a list of all available transactions

// The subclasses of Transaction will provide a bundle of type
// specific data, perhaps in XML or JSon documents
// If we are expecting external clients to send us transactions
// then we would publish the spec on what those documents would look like
// For example, VISA publishes a schema for submitting payments.

// The specific data spec would be determined from looking at the data that is
// actually in use in the business process

public abstract class Transaction {
	public static final int PAYMENT = 1;
	public static final int INVOICE = 2;
 
	// The type is assigned at creation and is immutable
	private final int type; 
	public Transaction(int type) {
		this.type = type;
	}

	public int getType() {
		return this.type;
	}

}
