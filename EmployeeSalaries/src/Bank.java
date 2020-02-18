class Bank {
	public static void main(String[] args) {
		Employee employee[] = new Employee[5]; // Reference type Array
		Employee employee1 = new Employee("Anil", 57000.0);
		Employee employee2 = new Employee("Ajay", 63000.0);
		Employee employee3 = new Employee("Nathan", 9999999.99);
		Employee employee4 = new Employee("Bum", 0.0);
		Employee employee5 = new Employee("Unloved Intern", 12000.0);
		employee[0] = employee1; // storing in the array
		employee[1] = employee2;
		employee[2] = employee3;
		employee[3] = employee4;
		employee[4] = employee5;
		double k = 0.0;

		for (int i = 0; i < employee.length; i++) { // traversing the array
			for (int j = 0; j < employee.length; j++) { // traversing the array again
				Employee employeeObject = employee[i]; // retrieving customer Object
				Employee employeeObjectAgain = employee[j]; // retrieving the employee object again
				String name = employeeObject.displayEmployeeName();
				double salary = employeeObject.displayEmployeeSalary();
				double salaryAgain = employeeObjectAgain.displayEmployeeSalary();
				double allSalaries = k + salaryAgain;
				System.out.println("All of the combined salaories is: " + allSalaries);
				System.out.println("Employee " + name + "'s Salary is: " + salary);

			}

		}
	}

	class Employee {
		private String name;
		private double salary;

		Employee(String uname, double usalary) {
			name = uname;
			salary = usalary;
		}

		public String displayEmployeeName() {
			return name;
		}

		public double displayEmployeeSalary() {
			return salary;
		}

		public double displayEmployeeSalaryAgain() {
			return salary;
		}
	}
}