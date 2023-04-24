package imperative;

public interface Accounting {
	int pay(Invoice invoice);
	int deposit(Check check);
	boolean payment(String vendor, int amount);

}

class Check {}
class Invoice{}

