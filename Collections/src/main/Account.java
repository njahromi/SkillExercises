package main;

/*
 * Goal:
The purpose of this assignment is to provide you practice with writing classes that make use of Collections.
 */

/*
 * Write a class Account that declares an id (long) property and an accountType (String) property. Create
a method that has the following signature:
List<Account> createAccounts(int numAccounts).
The method should create a number of Accounts equal to the numAccounts parameter and return those
accounts in a List. For example, createAccounts(5) should create five instances of Account and return
those in a List.
In an Application class, call the createAccounts() and then loop through the returned List and print the
ids of each Account. 
 */

import java.util.ArrayList;
import java.util.List;

public class Account {

	private long id;
	private String accountType;
	
	
	
	public Account(long id, String accountType) {
		super();
		this.id = id;
		this.accountType = accountType;
	}



	public static List<Account> createAccounts(int numAccounts){
		List<Account> accounts = new ArrayList<>();
		
		while (numAccounts > 0){
			Account a = new Account(1000 + numAccounts, "savings");
			accounts.add(a);
			numAccounts--;
		}
		
		return accounts;
	}
	
	@Override
	public String toString() {
		return "Account [id: " + this.id + "]";
	}
}

