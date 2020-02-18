class Person{
	String name;
	Person(){
		name="John";
	}
}

class Employee extends Person{
	int age;
	Employee(){
		age=34;
	}
}

class Customer extends Person{
	int salary;
	Customer(int salary){
		this.salary=salary;
	    name="Maddy";
	}
	
	public void displayDetails(){
		System.out.println(name+age+salary);
	}
}

class Account {
     public static void main(String[] args) {
		Customer c=new Customer(20000);
		c.displayDetails();
	}
}