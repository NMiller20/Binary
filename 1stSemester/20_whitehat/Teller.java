/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 20 -- testing a class externally
2021-10-17

DISCOVERIES: 
 

UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?




*/

public class Teller { 

	public static void main(String[] args) {
		//One issue with Clueless Cats' code: You can deposit negative values and end up with a negative balance. 
		// However, after that, you can't withdraw, and you get no error message for trying. 
		BankAccount3 ba = new BankAccount3();
		ba.setName("John");
		ba.setPasswd("p");
		ba.setPin((short) 1234);
		ba.setAcctNum(123456789);
		ba.setBalance(50.00);
		ba.deposit(-500.00);
		ba.withdraw(10.00);
		
		System.out.println(ba.toString());
		
		ba.setBalance(52); // more of a conceptual thing, but do you intend for it to be possible to set the balance of an account
						   // other than by depositing and withdrawing money?
		System.out.println(ba.toString());
		
		ba.authenticate(123456789, "p");
		ba.authenticate(123456789, "pass"); // (successful)
		
		
		//Testing negative balance
		BankAccount3 acc = new BankAccount3();
		acc.setName("bob");
		acc.setPasswd("p");
		acc.setPin((short) 12345);
		acc.setAcctNum(123456780);
		acc.setBalance(-50.00);
		acc.deposit(40.00);
		acc.withdraw(10.00); // (successful)
					
		System.out.println(acc.toString());
		
					
		}
	
}


