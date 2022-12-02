package oopsconcept;
//we can not instantiate interface but we can create reference variable of interface
interface MyInterfaces
{
	public void method1();
int x=23;
default void fun()
{
	System.out.println("we can add method body in interface using default");
}
}

class testt
{
	
	int id;
	testt(int id)
	{
		this.id=id;
	}
	
	void getvalue()
	{
		System.out.println(id);
	}
}
interface bb
{
	
	
}
  class demooo extends testt implements MyInterfaces,bb
{
       demooo(int id) {
    	super(id);
       }
	
	@Override
	public void method1() {
		System.out.println("overridden method of interface");
		//x=30;
		
	}

	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		//MyInterface obj =new demoo();
		//demoo obj
		demooo obj = new demooo(12);
		obj.method1();
	    obj.getvalue();
	   obj.fun();
	   

	}

}

