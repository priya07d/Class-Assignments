package oopsconcept;

public class FinalDemo {
	
	final int var =100;
	final static int num;
	static {
		num=23;
		
	}
  final	void display() 
	{
		System.out.println("final method!!");
	}
  public int cube(int n) {
  
  return n*n*n;
}

	public static void main(String[] args) {
		
		FinalDemo demo=new FinalDemo();
		//demo.var=455;
		demo.display();
		int cube= demo.cube(3);
		System.out.println("cube: "+ cube);
		//abc obj=new abc();
		//obj.display();
	}

	}

//class abc extends FinalDemo
//{
//	@Override
//	void display()
	//{
	//}
//}
	
