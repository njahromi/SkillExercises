package com.mycompany.main;

/*
 * Create a package com.mycompany.main to place your files in.
Create a class named StaticClass. Write a static method that computes the sum of two floating point
numbers. Use this method in an Application class, to compute the sum of two numbers that you pass to
your static method.
 */

/*
 * Create a class named FinalClass and define an instance variable, myConstant. Use the final keyword
to mark the instance variable as final. This makes it a constant. Add a statement to your Application
class to print the value of this constant.
 */

/*
 * Write a class named AbstractClass and declare it abstract. It should have an abstract method run().
Declare another class ConcreteClass and it should extend AbstractClass. Implement the run() method.
In the Application class, add a statement to create an instance of ConcreteClass and then call the run()
method.
 */

public class Application {

	public static void main(String[] args) {
		
		StaticClass.getSum();
		
		System.out.println(FinalClass.myConstant);
		
		ConcreteClass concreteFirst = new ConcreteClass(); {
			concreteFirst.run();
			
			
		}

	}

}
