
public abstract class Account implements Balancable, Withdrawable, Depositable {
	
	protected double balance;
	
	
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	@Override
	public void setBalance(double amount) {
		balance = amount;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
		
	}

	@Override
	public void withdraw(double amount) {
		if (amount>balance) {
			System.out.println("Amount exceeds balance.");
		} else
		balance-=amount;
	}


}
