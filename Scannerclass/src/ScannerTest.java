
import java.util.Scanner;

class ScannerTest {
	public static void main(String args[]) {
		Scanner se = new Scanner(System.in);
		System.out.println("Enter your rollno");
		int rollno = se.nextInt();
		System.out.println("Enter your name");
		String name = se.next();
		System.out.println("Enter your fee");
		double name1 = se.nextDouble();
		String fee = null;
		System.out.println("Rollno: " + rollno + "name: " + name1 + "fee: " + fee);
		se.close();// release the resource
	}
}
