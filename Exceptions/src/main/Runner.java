package main;

/*
 * Write a class CustomException that extends the Exception class. In another class Runner, write a
method, run() that throws this CustomException. Use a try/catch/block to manage exception handling in
an Application class that instantiates a Runner and calls its run method. 
 */

/*
 * The purpose of this assignment is to provide you practice with writing classes that makes use of a custom exception.
You will utilize the main() method of your classes to execute a particular goal of the assignment. This main() method
should be implemented in a Application.java file. 
 */


public class Runner 
{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        try
        { 
            // Throw an object of user defined exception 
            throw new CustomException(); 
        } 
        catch (CustomException ex) 
        { 
            System.out.println("Caught the Exception!"); 
 
        } 
    } 
}