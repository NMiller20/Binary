/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 18 -- writing a whole class
2021-10-17

DISCOVERIES: 
 

UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?

Q2: Given the definitions of what constructors and instances are, 
the fact that you could create an new instance of a class by invoking a method which you have not yourself defined 
indicates the existence of a default constructor. 

Q3: 
0. Create a variable representing your object
1. Print your object to the terminal. 
2. If what you see in the terminal is the same as what your object contains 
(ex. your object is an integer, and you see an integer, or your object is a string array and you see a string array)
then your object has a string representation. 


*/

public class BankAccount2 {
	private String name;
    private String passwd;
    private short pin;
    private int acctNum;
    private double balance;
	//private static int numAccounts = 0;
	
	
	public String setName( String newName ) {
		String oldName = name;
		name = newName;
		return oldName;
  }

    public String setPasswd( String newPasswd ) {
		String oldPasswd = passwd;
		passwd = newPasswd;
		return oldPasswd;
  }

    public short setPin( short newPin ) {
		short oldPin = pin;
		if ((short)1000 <= newPin && newPin <= (short)9998) {
			pin = newPin;
		} else {
			pin = 9999;
			System.out.println("Error: pin (" + pin + ") not a valid 4-digit number. It is set to 9999.");
        }
	return oldPin;
    }

	public int setAcctNum( int newAcctNum ) {
		int oldAcctNum = acctNum;
		if (100000000 <= newAcctNum && newAcctNum <= 999999998) {
			acctNum = newAcctNum;
		} else {
			acctNum = 999999999;
			System.out.println("Error: acctNum (" + acctNum + ") not a valid 9-digit number. It is set to 999999999.");
        }
		return oldAcctNum;
    }

	public double setBalance( double newBalance ) {
		double oldBalance = balance;
		balance = newBalance;
		return oldBalance;
    }
    public void deposit( double depositAmount ) {
		balance = balance + depositAmount;
    }

    public boolean withdraw( double withdrawAmount ) {
		if (balance >= withdrawAmount) {
			balance -= withdrawAmount;
			return true;
		} else {
			System.out.printf("Your account does not have enough money to withdraw from.");
			return false;
		}
    }
	
	public String toString() {
		String retStr = "\nAccount info:\n=======================";
		retStr = retStr + "\nName: " + name;
		retStr = retStr + "\nPassword: " + passwd;
		retStr = retStr + "\nPIN: " + pin;
		retStr = retStr + "\nAccount Number: " + acctNum;
		retStr = retStr + "\nBalance: " + balance;
		retStr = retStr + "\n=======================";
		return retStr;
    }

	public boolean authenticate(int accNum, String pass) {
		return (acctNum == accNum) && (passwd == pass);
	}


	
	
	/* public void changePswd(String newPass) {
		password = newPass;
	}
	
	public void changePin(int newPin) {
		pin = newPin;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	} 
	
	public void atmReceipt() {
		System.out.print("\n\nAccount " + accountNum + ": " + holderName + "\nPassword: " + password + "\nPin: " + pin + "\nBalance: " + balance);
	} */
	
	public static void main( String[] args ) {
    BankAccount2 ba = new BankAccount2();
		ba.setName("Ocho");
		ba.setPasswd("pass");
		ba.setPin((short) 1234);
		ba.setAcctNum(987654321);
		ba.setBalance(1500);
		ba.deposit(300);
		ba.withdraw(200);
		String acc = ba.toString();
		System.out.println(acc);
		System.out.println("Authentication: " + ba.authenticate(987654321, "pass") + " (true?)");
		System.out.println("Authentication: " + ba.authenticate(123124214, "Ocho?!") + " (false?)");
		System.out.println(ba.withdraw(10000) + " (error?)");
		System.out.println(ba.withdraw(20) + " (no error?)");
	}
	
}

