package Q2;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Date d1 = new Date(17,1,2000);
		
		Owner owner = new Owner("Akshat",d1,"YM332");
		
		SavingAccount account = new SavingAccount();
		account.setBalance(30000);
		account.setNumber("12345");
		account.setOwner(owner);
		account.setInterestRate(4);
		account.print();
		account.deposit(400);
		account.withdraw(400.40f);
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(80000);
		account2.setOwner(owner);
		account2.setNumber("56789");
		account2.setMinimumBalance(70000);
		account2.print();
		account2.withdraw(8000);
		account2.withdraw(90000);
		account2.deposit(12000);
		
		
	}
}