package arrayexamples;

import java.util.Scanner;

public class AddiitionMatrixArray {

	

	public static void main(String[] args) {

		int a[][]=new  int [2][2];
		int b[][]=new int [2][2];
		int c[][]=new int [2][2];
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first matrix ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			 a[i][j]=sc.nextInt();
		}
	
		System.out.print("Enter second matrix ");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			b[i][j]=sc.nextInt();
		}
	}
		System.out.print("First matrix\n");
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<2;j++)
		{
			System.out.print( a[i][j]+" ");
		}
		System.out.print("\n ");
		}
	
	System.out.print("second matrix\n");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print( b[i][j]+" ");
		}
		System.out.print("\n ");
	}
	System.out.print(" sum of two matrix\n ");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
		c[i][j]=a[i][j]+b[i][j];
		System.out.print(c[i][j]+" ");
		}
		System.out.print("\n ");
}
}
}