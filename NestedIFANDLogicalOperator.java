package basicprogram;

import java.util.Scanner;

public class NestedIFANDLogicalOperator {

    public static void main(String[] args) {
    	int num1,num2,num3,max=0;
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter three numbers");
    	num1=sc.nextInt();  //500
    	num2=sc.nextInt();   //200
    	num3=sc.nextInt();  //100
    	
    	if((num1>num2) && (num1>num3))
    	max=num1;
    	
    	else if((num2>num1) && (num2>num3))
    	  max=num2;
    	
    	else if((num3>num1) && (num3>num2))
      	  max=num3;
    	
    	System.out.println("maximum among all three: "+ max);
    	
    }
    
}