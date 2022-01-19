package Q2;

public class CurrentAccount extends Account {

	private float minimumBalance;

	public CurrentAccount() {
	}

	public CurrentAccount(CurrentAccount ca) {
		super(ca);
		this.minimumBalance = ca.minimumBalance;
	}
	public void setMinimumBalance(float minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	@Override
	public void withdraw(float amount) {
		float balance = getBalance() - amount;
		if (balance > minimumBalance) {
			setBalance(balance);
			System.out.println("Withdrawal has been done");
		} else {
			System.out.println("Unable to withdraw ");
		}
	}
	@Override
	public void print() {
		System.out.println("\nCurrent Account:");
		super.print();
		System.out.println("Minimum balance  : " + this.minimumBalance+"\n");
	}

	@Override
	public void deposit(float amount) {
		setBalance(getBalance()+amount);
		System.out.println("Deposit has been done");
	}
	
	public float getCharges() {
		return (float)(minimumBalance*0.1);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	sb.append("CurrentAccount [minimumBalance=").append(minimumBalance).append("]");
		return sb.toString();
	}
	

}