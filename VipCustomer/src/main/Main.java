package main;

public class Main {
    public static void main(String[] args) {
    	//Creating a new instance of VipPerson with the data for Name: Tim, Limit: 100 & Email: tim@email.com
        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        //Print the person's name which is retreived using a getter method
        System.out.println(person3.getName());
        //Print the person's credit limit which is retreived using a getter method
        System.out.println(person3.getCreditLimit());
        //Print the person's email address which is retrieved using a getter method
        System.out.println(person3.getEmailAddress());
    }
}
//Class declaration for VIP Person
class VipPerson {
	//The VipPerson takes in a couple paramaters such as:
	//name parameter of VIP Person
    private String name;
    //Credit Limit parameter of VipPerson
    private double creditLimit;
    //Email address parameter of VipPerson
    private String emailAddress;
    //A Constructor with a few arguments
    public VipPerson() {
    	//This keyword refers to the ViPPErson currently being accessed and is passing these values as parameters
        this("Default name", 50000.00, "default@email.com");
    }
    //Constructor with arguements for name and credit limit
    public VipPerson(String name, double creditLimit) {
    	//passing in the parameters
        this(name, creditLimit, "unknown@email.com");
    }
    //A constructor for VIP person that takes in arguements for name, creditLimit & Email Address
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
    //Getter methods
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
}