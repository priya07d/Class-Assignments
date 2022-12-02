package oopsconcept;

class Bankk
{
	
int rateOfInterest()
{
	return 8;
}
}	
	class Hdfc extends Bankk
	{
		int rateOfInterest()
		{
			return 7;
		}
	}
	
	class Axis extends Bankk
	{
		int rateOfInterest()
		{
			return 5;
		}
	}
	
	
	
public class HierarchicalInheritanceDemo {

public static void main(String[]args)  {
	Hdfc hdfc= new Hdfc();
	System.out.println("rate of interest: "+ hdfc.rateOfInterest()+" %");
	Axis axis= new Axis();
	System.out.println("rate of interest: "+ axis.rateOfInterest()+" %");
}
}