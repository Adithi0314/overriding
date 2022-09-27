package overriding;

public class Main {

	public static void main(String[] args) {
		SavingsAccount a1=new SavingsAccount();
		a1.withdraw(4000);
		
		LoanAccount a2=new LoanAccount();
		a2.withdraw(4000);
		
	}

}
