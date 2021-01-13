package entities;

public class BusinessAccount extends Account {

	// extends pois a subclasse BusinessAccount é uma classe Account  porem ela extende a outra, ela tem todos os atributos mas tem mais um metodo.
	
	private double loanLimit;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
		super(number, holder, balance);// aqui ficará os atributos da classe herdada
		this.loanLimit = loanLimit;
	}

	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount + 10;
		}
	}
	
	/*reutilizamos o metodo da superclasse
	 * è possivel chamar a implementação da superclasse usando a palavra super*/
	@Override
	
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance-= 2.00;
	}

}
