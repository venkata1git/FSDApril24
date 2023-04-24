package acctdepartment;

public class InvoiceReport extends Report {

	public InvoiceReport() {
		super(Report.INVOICE);
		this.setMessage("We have paid your invoice to us");
	}

}
