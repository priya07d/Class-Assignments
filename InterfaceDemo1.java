package oopsconcept;
//we can not instantiate interface but we can create reference variable of interface
interface MyInterfacee
{
	public void method1();
int x=23;


static int cube(int x)
{
	return x*x*x;
}
//this method is accessible only within this interface and can not be accessed or 
//inherited from an interface to another interface
private void add(int a,int b)
{
	System.out.println("add: "+ (a+b));
}

private static void sub(int a, int b)
{
	System.out.println("sub: "+ (a-b));
}
 default void fun()

 {
	 System.out.println("we can add method body in interface using default!!");
	 add(10,20);
	 sub(12,10);
 }
}

class test implements MyInterfacee
{
	
	/*int id;
	test(int id)
	{
		this.id=id;
	}*/
	
	void getValue() {
		
	}

	
	@Override
	public void method1() {
		System.out.println("overridden method of interface");
		//x=30;
		
	}


	public void draw() {
		System.out.println("drawing circle");
		
	}
}
class InterfaceDemo1 {

	public static void main(String[] args) {
		//MyInterface obj =new demoo();
		//demoo obj
		test obj = new test();
		obj.method1();
	    obj.draw();
	    System.out.println(Drawable.x);

	}

}

