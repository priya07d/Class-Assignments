package basicprogram;

import java.util.Scanner;

public class FindMaximum {
public static void main(String []args) {
	   int num1,num2;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter two numbers");
	   num1=sc.nextInt();
	   num2=sc.nextInt();
	   if(num1>num2)
		   System.out.println("Maximum: "+ num1);
	   else
		   System.out.println("Maximum: "+ num2);
}
}

