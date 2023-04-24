package acctdepartment;

public class ErrorReport extends Report {

	public ErrorReport() {
		super(Report.ERROR);
		this.setMessage("We are unable to complete your request at this time");
	}

}
