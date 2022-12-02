package arrayexamples;

import java.util.Scanner;

public class BuubleSort {

	public static void main(String[] args) {
      int arr[]=new int[10],i,j,temp;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter 10 elements in an array");
      for(i=0;i<10;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      System.out.println("Before swaapping , values are:");
      for(i=0;i<10;i++)
      {
    	  System.out.println(arr[i]+ " ");
      }
      
      //sorting
      for(i=0;i<10;i++)
      {
    	  
    	  for(j=i+1;j<10;j++)
    	  {
    		  
    		  
    		  if(arr[i]>arr[j]) 
    		  {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	  }
      }
      
      System.out.println("\nafter sorting in ascending order , values are:");
      for(i=0;i<10;i++)
      {
    	  System.out.print(arr[i]+" " );
    	  }
      }

	}


