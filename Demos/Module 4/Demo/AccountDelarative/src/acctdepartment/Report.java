package acctdepartment;

// This is the base class for all reports
// It also scopes all possible reports
// Note the use of an error report to manage internal errors and exceptions
// The same notes as for the Transaction type apply here as well.

public abstract class Report {
	public static final int PAYMENT = 1;
	public static final int INVOICE = 2;
	public static final int ERROR = -1;

	private final int type;
	
	// Dummy report content,
	private String message;
	
	public Report(int type) {
		this.type = type;
		
	}

	public String getMessage() {
		return this.message;
	}

	protected void setMessage(String message) {
		this.message = message;
	}

	public int getType() {
		return this.type;
	}

}
