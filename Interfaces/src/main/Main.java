package main;

/*
 * Create an interface ITelephone with methods:
 * 
 * dial that takes number as parameter and prints Now ringing phone number
 * 
 * callPhone that takes number as parameter and sets the isRinging flag as 
 * true and prints Ring Ring  if number matches self number 
 * 
 * answer if the phone is ringing prints Answering the desk phone and set isRinging flag to false
 * 
 * Create a class DeskPhone that implements this interface and in the main function call dial, callPhone and answer.
 * 
 * Note : give number as 123456
 * 
 */

//Declaring the class name
public class Main {
	//Main method
    public static void main(String[] args) {
    	//Tim's phone implements the ITTelephone Interface
        ITelephone timsPhone;
        //Creating a new instance of DeskPhone
        timsPhone = new DeskPhone(123456);
        //Calling dial method on Tim's phone
        timsPhone.dial(123456);
        //Calling the call phone method on Tim's phone
        timsPhone.callPhone(123456);
        //Calling the answer method on Tim's phone
        timsPhone.answer();
    }
}
interface ITelephone {
	//Void shows that no data is returned as you call a phone Number
    void dial(int phoneNumber);
    //No data is returned when the caller answers the phone call
    void answer();
    //You're either calling or not calling a phone number
    boolean callPhone(int phoneNumber);
}
class DeskPhone implements ITelephone {
	//Declaring myNumber as a privately accessible integer
    private int myNumber;
    //Declaring isRinging as a privately accessible true/false statemenet
    private boolean isRinging;
    // Creating the DeskPhone method which accepts parameters myNumber
    public DeskPhone(int myNumber) {
    	//referencing the instance variable of the current class
        this.myNumber = myNumber;
    }
    //Using @Override annotation while overriding a method is considered
    //as a best practice for coding in java because of the following two
    //advantages: 1) If programmer makes any mistake
    //such as wrong method name, wrong parameter types while overriding, you would get a compile time error.
    @Override
    //The dial method passes in the parameter for phone number
    public void dial(int phoneNumber) {
    	//Printing out the phone number that is currently ringing
        System.out.println("Now ringing " + phoneNumber);
    }
    @Override
    //Answer method returns void
    public void answer() {
    	//If the phone is ringing (true/false)
        if(isRinging) {
        	//The console prints "Answering the desk phone"
            System.out.println("Answering the desk phone");
            //And then the phone is no longer ringing
            isRinging = false;
        }
    }
    @Override
    //Declaring the public boolean callPhone method that takes in a phoneNumber as a paramter
    public boolean callPhone(int phoneNumber) {
    	//If the phone number that is set to my number...
        if(phoneNumber == myNumber) {
        	//Is ringing...
            isRinging = true;
            //Then print out "Ring Ring"
            System.out.println("Ring ring");
            //or else
        } else {
        	//The phone isn't ringing
            isRinging = false;
        }
        //The phone is ringing
        return isRinging;
    }
}