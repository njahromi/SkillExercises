import java.util.ArrayList;
import java.util.Scanner;

public class LuckyArmstrong {

	public static void main(String[] args) {
		
		int choice = 0;
		// Select 1 for Lucky Number
		// Select 2 for Armstrong Number
		choice = 2;
		
		switch(choice) {
		
		case 1:
			Scanner scan = new Scanner(System.in);
			
		    System.out.println("Please enter your age so we can calculate your lucky numbers: ");

		    int i, n;
		    
		    n = scan.nextInt();     
		    
		    ArrayList <Integer> ele = new ArrayList <Integer> (n);
		    
		    //storing in a list
		    
		    for(i = 1;i<=n;i++)
		    	
		    {
		    	
		        ele.add(i);
		        
		    }
		    
		    System.out.println(ele);
		    
		    int count = 2;
		    
		    System.out.println("Size: "+ele.size());
		    
		    while(count<ele.size())
		    	
		    {
		    	
		        for(i = 0;i<ele.size();i++)
		        	
		        {
		        	
		            int chk = ele.get(i);
		            
		            if(chk%count == 0)
		            	
		            {
		            	
		                ele.remove(i);
		                
		            }                
		            
		        }
		        
		        count++;           
		    }
		    System.out.print(ele); 
		    break;
			
		case 2:
			
			Scanner sc = new Scanner(System.in);
			
		    int c=0,a,temp;  
		    
		    //This is the number we're checking to see if it's an Armstrong.
		    
		    int m=sc.nextInt();
		    
		    temp=m;  
		    
		    while(m>0)  
		    	
		    {  
		    	
		    a=m%10;  
		    
		    m=m/10;  
		    
		    c=c+(a*a*a);  
		    
		    }  
		    
		    if(temp==c)  
		    	
		    System.out.println("Yup! " + m + " is an Armstrong Number!");   
		    
		    else  
		    	
		        System.out.println("OMG " + m + " isn't an Armstrong Number!!! T_T");
		}
		

	}
}
