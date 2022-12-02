package oopsconcept;

abstract class AbstractDemo
{
	void fun()
	{
		System.out.println("we are learning with fun");
	}
	
	abstract void display();
}

//implementation class
class impl extends AbstractDemo
{
	
	 @Override
	 void display()  {
		 System.out.println("displaying impl  class");
		 
	 }
	 
}

class impl2 extends AbstractDemo
{
	 @Override
	 void display() {
		 System.out.println("displaying impl 2 class");
		 
	 }
}



public class AbstractractionEx {

	public static void main(String[] args) {
		AbstractDemo demo;
		
		demo=new impl();
		demo.fun();
		demo.display();
		
		demo=new impl2();
		demo.fun();
		demo.display();
	}
	


	}


