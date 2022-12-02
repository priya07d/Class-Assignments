package oopsconcept;
class a
{
	void a()
	{
		System.out.println("class a method");
	}
}

class b extends a
{
	void b()
	{
		System.out.println("class b method");
	}
}

interface c
{
	void c();
}

class d extends b implements c
{
	
	@Override
	public void c() {
		System.out.println("interface c method");
	}

	
	}

	

public class HybridInheritance1 {

	public static void main(String[] args) {
		d obj=new d();
		obj.a();
		obj.b();
		obj.c();
		

	}

}
