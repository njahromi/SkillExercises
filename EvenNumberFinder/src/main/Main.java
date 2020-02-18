package main;

//The name of the class is main
public class Main {
	//This is the main method
    public static void main(String[] args) {
    	// Starting the number at 5
        int number = 5;
        // Ending the number at 15
        int finishNumber = 15;
        // Starting the even numbers found at 0
        int evenNumbersFound = 0;
        // While our number starting at 5 is less than our number finishing at 15
        while(number <= finishNumber) {
        	//And if the number is not even
            if(!isEvenNumber(number)) {
            	//increment by one
                number++;
                //Jump to the next iteration of the loop
                continue;
            }
            //Print the number to the console
            System.out.println(number);
            //Increment the number
            number++;
            //Increment the number keeping track of how many even mumbers that were found
            evenNumbersFound++;
            //If the program has found 5 or more even numbers
            if(evenNumbersFound >=5) {
            	//Stop the loop
                break;
            }
        }
    }
    //if the number integer is even
    public static boolean isEvenNumber(int number) {
    	//If the number can be divided by two with a remainder of 0
    	//(Basically asking if its even)
        if((number % 2)  == 0) {
        	//Acknowledge the number is in fact even
            return true;
            //otherwise...
        } else {
        	//The number is false and therefore the condition has not been met.
            return false;
        }
    }
}