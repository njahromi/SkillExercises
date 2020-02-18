/*
 * Problem Statement:
Objective: Given a real world problem, be able to understand
 the need for programming fundamentals such as type conversion
  and casting.

Problem Description: A retail store management
 wants to provide discount of 2% on the bill
  amount for its customers. The bill details of the customer
   are as follows: Bill id-1001 , customer id=101 and bill
    amount=199.99. Calculate the discounted bill amount.

Note: the data type of bill Id,customer Id are int and bill Amount,
 discounted bill amount are double.

Formula to calculate the discounted bill amount = 
bill Amount - bill Amount * (discount/100)
 */

public class Solution {
	
	public static void main(String[]args) {
		
		double Bill_ID = 1001;
		
		double Customer_ID = 101;
		
		double Bill_Amount = 199.99;
		
		double Discount = 2;
		
		System.out.println("Customer " + Customer_ID + " has recieved a discount of " + (Bill_Amount * (Discount/100)) + " on bill number " + Bill_ID);
		
	}

}
