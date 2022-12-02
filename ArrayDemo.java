package arrayexamples;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc= new Scanner(System.in);
		//intialization
		//compile time
		arr[0]=2;
		arr[1]=3;
		//runtime
		System.out.println("Enter 5 elements");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}

		//to print the values:
		System.out.println("5 elements are: ");
		for(int i=0;i<5;i++) //
		{
			System.out.println(arr[i]);
		}
		
		
		
		System.out.println("printing elements using foreach loop:");
		for(int var: arr) //34 56
		{
			System.out.println(var); //34 56
		}
	}

}
