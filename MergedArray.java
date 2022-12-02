package arrayexamples;

import java.util.Scanner;
public class MergedArray {

	
	public static void main(String[] args) {
		int first[],sec[],third[],size1,size2,i,k;
		Scanner sc =new Scanner(System.in);
		
		//intialize the first array
		System.out.println("Enter size of  first array:");
		size1=sc.nextInt();
		first=new int[size1];
		System.out.println("Enter "+ size1+"  elements in thefirst array:");
		for(i=0;i<size1;i++)
		{
			 first[i]=sc.nextInt();
		}
		
		
		//intialized the second array
		System.out.println("Enter size of second array:");
		size2=sc.nextInt();
		sec=new int[size2];
		System.out.println("Enter "+ size2+"  elements in the second array:");
		for(i=0;i<size2;i++)
		{
			 sec[i]=sc.nextInt();
		}
		
		
		third=new int[size1+size2];
		
		
		
		for(i=0;i<size1;i++)
		{
			third[i]=first[i];  //third[4]=first[4];
		}
		
		
		//assigning I value to k
		k=i;  //5
		
		//assign second array elements into the third array
		
		for(i=0;i<size2;i++)
		{
			third[k++]=sec[i];
					
		}
		
		//print the third array after merging
		System.out.println("And the result is after merging::");
		for(i=0;i<third.length;i++)
		{
			System.out.print(third[i]+"  ");
		}
		
	}	
}	
		
		

	


