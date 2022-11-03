package basicprogram;

import java.util.Scanner;

public class FindPositiveNegative {
public static void main(String[]args) {
    int num1,num2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    num1=sc.nextInt();
    num2=sc.nextInt();
    if(num1>0)
    	System.out.println("The number is positive: "+ num1);
    else if(num2<0)
        System.out.println("The number is negative: "+  num2);
    else
    	System.out.println("The number is positive nor negative");
}
}