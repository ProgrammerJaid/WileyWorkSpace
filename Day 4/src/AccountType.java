
public enum AccountType {

	SAVINGS(500.0), CURRENT(1000.0);

	private final double minimumBalance;

	AccountType(double data) {
		this.minimumBalance = data;
	}

	public double getMinimumBalance() {
		return this.minimumBalance;
	}
}
