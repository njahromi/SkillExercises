package Tester;

class Employee {
   public void display() {
          System.out.print(" display ");
   }

   public void print(int age) {
          System.out.print(" Employee ");
   }
}

public class Trainee extends Employee {
   public void display(String name) { // line 2
          System.out.print(name);
   }
   public int print(int age) { // line 5
          System.out.print(" Trainee ");
          return age;
   }
   public static void main(String[] args) {
          Trainee trainee = new Trainee();
          trainee.display(); // line 10
          trainee.display("Bob"); // line 11
          trainee.print(10); // line 12
   }
}