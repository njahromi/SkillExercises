package compilationerror;

class SwitchImpl {

public static void main(String[] args) {
   float f =12;
     switch (f) { // Line 1
     case 10+1: System.out.println("Twelve"); // Line 2
     case 0: System.out.println("Zero"); //Line 3
     case (int)12.0: System.out.println("Decimal"); 
	   default: System.out.println("Default");
    }

}
}