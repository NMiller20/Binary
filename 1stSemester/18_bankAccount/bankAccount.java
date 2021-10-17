/** public String holderName
private String password
private int pin
private int accountNum
private double balance */

public class bankAccount {
	public String holderName;
	private String password;
	private int pin;
	private int accountNum;
	private double balance;
	
	public bankAccount(String name, String pass, int pinn, int num) {
		holderName = name;
		password = pass;
		pin = pinn;
		accountNum = num;
		balance = 0;
	}
	
	public void changePassword(String newPass) {
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
		System.out.print(holderName + ": " + balance);
	}
	
}
