package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		// heranca a classe herda tudo da classe principal
		/**UPCASTING OCORRE QUANDO QUEREMOS FAZER UM CASTING DA SUBCLASSE PARA A  SUPERCLASSE POR ISSO É UP CASTING **/
		/**DOWNCASTING OCORRE QUANDO QUEREMOS FAZER UM CASTING DA SUPERCLASSE PARA A  SUBCLASSE POR ISSO É DOWN CASTING **/
		
		BusinessAccount conta= new BusinessAccount();
		System.out.println(conta);
		
		Account acc = new Account(1001, "Alex", 0.0);
		System.out.println(acc);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
		//upcasting
		
		Account acc1 = bacc; 
		acc1.getBalance(); // não deu erro pois a superclasse aceita essa instanciação por ser um heranca que "é um". Ela deixa atribuir um objeto da subclasse para a super.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200);
		Account acc3= new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// BusinessAccount acc4 = acc2; // assim ele não aceita pois ele mostra imcompatibilidade então temos que usar o casting
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100);
		
		// BusinessAccount acc5 = (BusinessAccount) acc3; // esse caso o compilador não da erro pois so achara durante a compilação
		// o motivo é que a acc3 recebe um SavingsAccount que não é um BusinessAccount, não ha relação entre eles. 
		
		//instanceof é para sabermos se o objeto acc3 realmente é do tipo BusinessAccount e ai se ele for fazemos a conversão do acc5 para BusinessAccount
		if(acc3 instanceof BusinessAccount) {
			// accc3 não é instancia de BusinessAccount por isso esse if falhará
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.00);
			System.out.println("Loan !");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.getBalance();
			System.out.println("Update");
		}
		
		
		
		Account acc6 = new Account(1007, "Kaleu", 1000.0);
		
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1008, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc10 = new BusinessAccount(1009, "Sara", 1000.00, 500.0);
		acc10.withdraw(200);
		System.out.println(acc10.getBalance());
		
		
	}

}
