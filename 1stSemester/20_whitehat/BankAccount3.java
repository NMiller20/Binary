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


public class BankAccount3 {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
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
    if (newPin >= 1000 && newPin <= 9998){
        pin = newPin;
    }
    else {
        pin = 9999;
        System.out.println("Try Again");
    }
     return pin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum; //must be outside of the if statement
    if (newAcctNum >= 100000000 && newAcctNum <= 999999998){
	acctNum = newAcctNum;
    }
    else {
    acctNum = 999999999;
    System.out.println("Try Again");
    }
    return acctNum;
  }


  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
     balance = balance + depositAmount;
  }

  public Boolean withdraw( double withdrawAmount ) {
    if(balance - withdrawAmount < 0) {
	System.out.println("you're broke, you can't withdraw");
	return false;
    } else{
	balance = balance - withdrawAmount;
  	return true;
    }
  }

  public Boolean authenticate(int inputAcctNum, String inputPass) {
	return(acctNum == inputAcctNum && inputPass == passwd);
  } //will return true if true and false if false
  
  //overwritten toString()
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

  public static void main( String[] args ) {
    //should produce a list of all the information
    BankAccount3 ba = new BankAccount3();
    ba.setName("John");
    ba.setPasswd("password");
    ba.setPin((short) 1234);
    ba.setAcctNum(123456789);
    ba.setBalance(0.00);
    ba.deposit(50.00);
    ba.withdraw(10.00);
        //balance should be 40
    System.out.println(ba.toString());
    
    //Should produce errors when setPin, setAcctNum, authenticate, and withdraw are invoked
    BankAccount3 error = new BankAccount3();
    error.setName("Error");
    error.setPasswd("pass");
    System.out.println(error.setPin((short) 12));
    System.out.println(error.setAcctNum(123));
    error.setBalance(0);
    System.out.println(error.withdraw(10));
    System.out.println(error.toString());
    System.out.println(error.authenticate(123, "pass"));
  }//end main()
}