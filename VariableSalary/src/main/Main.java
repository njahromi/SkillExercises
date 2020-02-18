package main;

/*
 * Create class Job which has a variable salary
 * 
Create class Person that uses Job as a composition

In Person class create a parameterised constructor which takes salary as parameter and stores in salary variable.

In main code, create an object of Person Class with salary 12000L and using getSalary show as output.
 */

public class Main {
	//main method
    public static void main(String[] args) {
    	//constructor for a new person with the parameter of 12000 (long)
        Person person = new Person(12000L);
        //Tells salary to call the get salary method of person
        long salary = person.getSalary();
        //Prints the salary out of onto the console
        System.out.println(salary);
    }
}
//Creating the job class
class Job {
	//delcaring a long for salary
    private long salary;
    //Getter method of job, getSalary
    public long getSalary() {
    	//returns the salary
        return salary;
    }
    //sets the salary as a long
    public void setSalary(long salary) {
    	//Salary is now the result of this method
        this.salary = salary;
    }
}
//
class Person {
    //composition has-a relationship
    private Job job;
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
    }
    public Person(long salary){
        this.job=new Job();
        job.setSalary(salary);
    }
    public long getSalary() {
        return job.getSalary();
    }
}
