package main;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;

/*
 * Create an abstract class Animal with name variable and abstract methods eat and sleep,
 *  also make getter for name and constructor that sets name.
 *  
 *  
Create a Raccoon that extends Animal class, create a constructor that calls base class
 constructor and define override methods eat - print Racoon is eating and breath
  - print Breathe in, breathe out, repeat
  
Create an object of this class raccoon and call eat and breathe methods
 */

//Defining the test class as public
public class test {
	//The main method
    public static void main(String[] args) {
    	//Constructor builds a new rocoon named rocoon
        Racoon racoon = new Racoon("Racoon");
        //Invoking the eat method
        racoon.eat();
        //Invoking the breathe method
        racoon.breathe();
    }
}
//Creating the abstract class animal
abstract class Animal {
	//Creating a string for name and marking it as private
    private String name;
    //Creating animal taking in a parameter for the animal's name
    public Animal(String name) {
    	//Defining the name
        this.name = name;
    }
    //Creating an eat method
    public abstract void eat();
    //Creating a breathe method
    public abstract void breathe();
    //This is the getName method
    public String getName() {
    	//Comes back with teh name
        return name;
    }
}
//Saying that the Racoom class is a child of Animak
class Racoon extends Animal {
	//Raccoon class takes in a paramter for the string name
    public Racoon(String name) {
    	// super name 
        super(name);
    }
    @Override
    //The eat method
    public void eat() {
    	//Eat method body
        System.out.println(getName() + " is eating");
    }
    @Override
    //Breathe method
    public void breathe() {
    	//Breathe method body
        System.out.println("Breathe in, breathe out, repeat");
    }
}