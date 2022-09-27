package overriding;

public class LoanAccount extends Account{
	

	double acc_bal=50000.0;
	 void withdraw(double amount)
	 {
		 if(amount<=acc_bal)
		 {
			 acc_bal=acc_bal+amount;
	System.out.println("The Loan account balance is :" +acc_bal);
	System.out.println("Withdraw Successfull !!!!!!");
		 }
	 }
	}
