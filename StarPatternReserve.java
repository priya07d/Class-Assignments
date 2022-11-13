package basicprogram;

public class StarPatternReserve {

	public static void main(String[] args) {
		
				for( int i=5;i>=1;i--)  //row
				{
					
					for(int j=1;j<=i;j++)
					{
						System.out.print( "*"); //col
					}
					
					System.out.println();
					
				}
	}
}
