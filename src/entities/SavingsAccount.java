package entities;

public class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void upDateBalance() {
		balance += balance * interestRate;
	}
	/*estamos sobrescrevendo o metodo e por isso usamos a anota��o @Override*/
	@Override
	
	public void withdraw(double amount) {
		balance-=amount;
	}
}
