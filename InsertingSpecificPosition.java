package arrayexamples;

import java.util.Scanner;

public class InsertingSpecificPosition {

	public static void main(String[] args) {
		int size,pos,i,num;
		Scanner sc=new Scanner(System.in);
				int arr[]=new int[10];
				System.out.println("Enter how many elements you want in an array");
				size=sc.nextInt();
				
				System.out.println("Enter "+size+"  elements in an array");
				for(i=0;i<size;i++)
				{
					arr[i]=sc.nextInt();
				}

				System.out.println("Enter position:");
				pos=sc.nextInt();
				
				//checking position for insertion are correct or not 
				
				if(pos>size || pos<0 || pos==size)
				{
					System.out.println("array size is : "+size+ "  ,please choose position " + "according to size ");
				}
				else
				{
					System.out.println("Enter value to insert");
					num=sc.nextInt();
					
					//shifting elements
					
					for(i=size;i>=pos;i--)
					{
						arr[i]=arr[i-1];
					}
					
					    arr[pos-1]=num;
						size++;
						
						System.out.println("After adding new value,new array will be:");
						for(i=0;i<size;i++)
						{
							System.out.printf("%3d", arr[i]);
							//System.out.print(arr[i]+" ");
							
						}
					
				}
	}
}
					
					
			
