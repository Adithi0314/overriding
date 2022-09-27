package overriding;

public class SavingsAccount  extends Account{
 double acc_bal=80000.0;
 void withdraw(double amount)
 {
	 if(amount<=acc_bal)
	 {
		 acc_bal=acc_bal-amount;
System.out.println("The savings account balance is :" +acc_bal);
System.out.println("Withdraw Successfull !!!!!!");
	 }
 }
}
