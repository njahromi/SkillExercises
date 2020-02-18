class ArmstrongExample{  
	
  public static void main(String[] args)  {  
	  
    int c=0,a,temp;  
    
    //This is the number we're checking to see if it's an Armstrong.
    
    int n=153;
    
    temp=n;  
    
    while(n>0)  
    	
    {  
    	
    a=n%10;  
    
    n=n/10;  
    
    c=c+(a*a*a);  
    
    }  
    
    if(temp==c)  
    	
    System.out.println("Yup! " + n + " is an Armstrong Number!");   
    
    else  
    	
        System.out.println("OMG " + n + " isn't an Armstrong Number!!! T_T");   
   }  
} 