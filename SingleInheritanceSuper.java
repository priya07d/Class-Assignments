package oopsconcept;

class Person
{
	int id;
	String name, address;
	
	
	
	public  Person(int id,String name, String address)
	{
		 this.id = id;
		   this.name= name;
		   this.address= address;
	}
	
	
	public Person() {
		super();
		
	}
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	
		
	}
}

class StudentDetails extends Person
{
	
	 float marks;
	 public StudentDetails(int id,String name, String address,float marks)
	 {
		 super(id,name,address);
		 this.marks=marks;
	 }

    void display()
    {
    	float marks=56.7f;
    	super.display();
    	
    	System.out.println("marks:"+this.marks);
    	
    }
    }

class child1 extends StudentDetails
{
	long phno;
	public  child1(int id,String name, String address, float marks,long phno) {
		super(id,name,address,marks);
		this.phno=phno;
	}

	void display()
	{
		super.display();
		System.out.println("phone number:"+phno);
	}
}
public class SingleInheritanceSuper{
	
	public static void main(String[] args) {
		
	child1 obj=new child1(1,"priya", "odisha", 80.0f, 9764678899l);
		
		obj.display();
	}
}
