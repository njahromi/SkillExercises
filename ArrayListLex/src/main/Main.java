package main;

import java.util.ArrayList;

/*
 * -  The Customer class should have an arraylist of Doubles (transactions)
      Customer Name, and the ArrayList of doubles(transactions).

   - Also needs to add additional transactions for that customer
   
   - getName method to get name of customer and getTransactions to display list of transaction.
   
   - constructor that adds initial amount to the transactions.


   - Create an arrayList of Customer Class and save two customers with details,
				name: John, Transactions: 20000,30000,50000

				name: Tim, Transactions: 15000,20000

    - Display transaction of both customers and print every transaction in a new line.
 * 
 */

public class Main {
    public static void main(String[] args) {
        //adding customers
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer("John",20000D);
        customer1.addTransaction(30000D);
        customer1.addTransaction(50000D);
        customers.add(customer1);
        Customer customer2 = new Customer("Tim",15000D);
        customer2.addTransaction(20000D);
        customers.add(customer2);
        //printing transactions
        for(int i=0; i<customers.size(); i++) {
            Customer customer = customers.get(i);
            for(int j=0; j<customer.getTransactions().size(); j++) {
                Double transaction = customer.getTransactions().get(j);
                System.out.println(transaction);
            }
        }
    }
}
class Customer {
    private String name;
    private ArrayList<Double> transactions;
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}