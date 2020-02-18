
public class Example {

	public static void main(String[] args) {
		// Multi-dimensional arrays are arrays of arrays. The two dimensional
		//array can be termed as a physical table with rows and columns.
		int marks[][] = new int [2][3];   // Declares a 2-D array with 2 rows and 3 columns
		Bank bank[][] = new Bank[2][3];
		int marks1[][] = new int[2][];   // While instantiating a 2-D array, specifying the size of the 2nd dimension is not mandatory.
		Bank bank1[][] = new Bank[2][];
		marks1[0] = new int[2];  // First row of the multidimensional array will have 2 columns.
		bank1[0] = new Bank[2];


	}

}
