import entities.Account;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {
		
		/*a palavra final */
		// em uma classe , evita que a classe seja herdada ex: public final class SavinsAccount
		// em um metodo , evita que o metodo seja sobreposto 
		
		/*POLIMORFISMO*/
		
		
		// o comportamento é diferente conforme cada tipo especifico, mesmo a variavel sendo do mesmo tipo.
		
		Account x = new Account(1001,"Alex",1000.0);
		Account y = new SavingsAccount(1023, "Mary",1000.0, 0.01);
		
		// polimorfismo esta aqui pois chamamos o withdraw porem cada objeto teve seu comportamento diferente, pois apontam para objetos diferentes
		
		y.withdraw(50);
		x.withdraw(50);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		

	}

}
