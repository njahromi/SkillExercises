package com.infosys;
@Aspect
public class MyAspect {
     @Before("execution( * com.infosys.AdderService.add(..))")
      public void logBeforeExecutionAdvice(){
           System.out.print(" within Before Advice ");
     } 
 }
     

package com.infosys;
public class AdderService {
      private int a;
      private  int b;
      public int add(int a,int b){
           System.out.print(" In add method ");
           return (a+b);
      }
      //getter and setter methods
}
           

package com.infosys;
public class Main {
     public static void main(String[] args) {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
         AdderService adder=(AdderService)ctx.getBean("adderService");
         System.out.print("Result=" + adder.add(2,3));
     }
}