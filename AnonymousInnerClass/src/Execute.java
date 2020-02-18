interface Grade {
	char grades = 'A';

	public char calculateGrade(String employeeID, int point);
}

class Manager {
	Grade grade1 = new Grade() { // Represents anonymous inner class
		private char grade;

		public char calculateGrade(String employeeID, int point) {
			// calculate grade
			if (point < 100 && point >= 90) {
				grade = 'A';
			} else if (point < 90 && point >= 80) {
				grade = 'B';
			} else {
				grade = 'C';
			}
			return grade;
		}
	};

	public char checkEmployeeID(String employeeId, int point) {
		return grade1.calculateGrade(employeeId, point);

	}

}

class Execute {
	public static void main(String[] args) {
		Manager manager = new Manager();
		String employeeId = "I1001";
		char gradePoint = manager.checkEmployeeID(employeeId, 80);
		System.out.println("The grade for " + employeeId + " is " + gradePoint);
	}
}