package robustness;

import java.util.HashSet;
import java.util.Set;

public class Runner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// Assume that the invoice is sent in an JSon document
// 1. Define a data object called InvoiceData
// 2. Extract the data from the document into InvoiceData
// 3. Look for missing data or inconsistent data in the document
//		- Two different date fields with different dates
//      - Missing fields
//		- This is called a well formed check
//  4. Look for logical inconsistencies
//		- Invalid date (June 31, 2022)
//		- Invalid amounts (total balance is not correct)
//		- These checks depend on business rules
//	5. Duplicate - has this invoice already has been processed.

class Inv {
	
	// There would need to be some mechanism for storing this data and logging
	// how the invoice was ingested.
	static Set<Inv> invoices= new HashSet<Inv>();
	static Set<Inv> completed = new HashSet<Inv>();
	static Set<String> unprocessable = new HashSet<String>();
	
	static Inv ingestInvoice( String document) {
	     if (!wellFormedCheck(document)) return null;
	     Inv tmp = processJson(document);
	     if (!validateInvoice(tmp)) return null;
		// check to see that the invoice is not already in invoices then insert it
		return null;
	}
	static private boolean wellFormedCheck(String s) { return false;}
	static private Inv processJson(String document) { return null;}
	static private boolean validateInvoice(Inv i) { return false;}
}
