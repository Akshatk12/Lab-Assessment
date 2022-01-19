package Q2;

import java.util.Scanner;

public class Account {
	
	private Owner owner;
	private float balance;
	private String number;
	
	public Account() {
	}
	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}
	
	public void print() {
		owner.print();
		System.out.println("Account No: " + number+" Balance: " + balance );
	}
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [owner=").append(owner).append(", balance=").append(balance).append(", number=")
		.append(number).append("]");
		return builder.toString();
	}
	
public void deposit(float amount) {}
	
	public void withdraw(float amount){}

	public float getBalance() {
		return balance;
	}	
}