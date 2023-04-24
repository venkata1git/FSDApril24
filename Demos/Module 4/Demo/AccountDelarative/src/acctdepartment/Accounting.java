package acctdepartment;

// This interface satisfies the open close principle because we can add 
// new transaction types or change how transactions are managed
// internally by redesigning the application without changing
// the interface.

public interface Accounting {
 public Report process(Transaction transaction);
}
