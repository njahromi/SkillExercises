package main;

class ABC{
	public static void main(String[]args) {
        int x=100;
		int y=x;
		x++; 
		int z=y;
		z++;
		System.out.println(y);
	}  
}