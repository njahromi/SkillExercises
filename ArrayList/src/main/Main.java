package main;

// 1) You will want to create a separate class for Contacts (name and phone number).

// 2) Contacts class has variables name and phone number

// 3) Create getter and setters for above.

// 4) Inside main create an ArrayList of type Contacts and store these 2 contacts - 

// 4A) tim 181888424

// 4B) john 181888425

// 5) Display both the contacts name using getName function each in new line


//Importing the ArrayList Collection
import java.util.ArrayList;

//The main entry into our code
public class Main {
    public static void main(String[] args) {
    	
    	//Creating a new Array List to store our contacts
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        //Adding a new contact named tim to the arrayList.
        Contact firstContact = new Contact("tim","181888424");
        //Adding contact John to the ArrayList
        Contact secondContact = new Contact("john","181888425");
        //Adding First Contact to the contacts array list.
        contacts.add(firstContact);
        //Adding Second Contact to the contacts array list.
        contacts.add(secondContact);
        for(int i=0; i< contacts.size(); i++) {
            System.out.println(contacts.get(i).getName());
        }
    }
}
class Contact {
    private String name;
    private String phoneNumber;
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

