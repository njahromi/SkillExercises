package main;

//Prints prime numbers from 3 to 100

public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i=3; i<=100; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                if(count == 10) {
                    break;
                }
                count = count + 1;
            }
        }
    }
    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}