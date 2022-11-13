package basicprogram;
import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int   i,j;
		
		
		System.out.println("Enter row:");
	 int n = sc.nextInt();
		for(  i=1; i<n; i++)  
		{
		
			for( j=1;j<=i;j++)
			{
				System.out.print(    " * "); 
			}
			
			System.out.println();
			
		}
	}
	
}		
