package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public Account() {
	}
	
	public Account(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		depositValue(balance);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getHolder() {
		return this.holder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void depositValue(double value) {
		this.balance += value;
	}
	
	public void withdrawalValue(double value) {
		this.balance -= value + 5.00;
	}
	
	public String toString() {
		return "Account: " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
