/*
* write a program to calculate total marks of five subjects
*/
package basicprogram;
import java.util.Scanner;
public class totalMarks  {
public static void main(String[]args)   {
    float eng,bio,maths,geo,history,total,average,percentage;
    Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the marks of eng");
         eng=sc.nextFloat();
         System.out.println("Enter the marks of bio");
         bio=sc.nextFloat();
         System.out.println("Enter the marks of maths");
         maths=sc.nextFloat();
         System.out.println("Enter the marks of geo");
         geo=sc.nextFloat();
         System.out.println("Enter the marks of history");
         history=sc.nextFloat();
         System.out.println("Enter the marks");
         total=eng+bio+maths+geo+history;
         System.out.println("total of five subjects is:" +total);
         average= total/5;
         System.out.println("average marks is:" +average);
         percentage= (total/500)*100;
         System.out.println("percentage is:" +percentage);
         
         if(total>=300)
        	 
            System.out.println("Pass");
         
         else
        	 
        	 System.out.println("Fail");
        	 
}
}

         
         

