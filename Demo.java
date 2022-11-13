package oopsconcept;

class Student
{
	int id;
	String name,address, course;
	float fees;
	  
	void setData( int i, String n, String add, String c , float f)
	{
		id=i;
		name = n;
		address=add;
		course=c;
		fees =f;
	}
	
	void displayData()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Course:"+course);
		System.out.println("Fees:"+fees);
	}
}
public class Demo {
 
public static void main(String[] args) {
	Student nikhil = new Student();
	  nikhil.setData(101,"nikhil", "mumbai",
			  "java full stack" , 2000.0f);
	  
	  nikhil.displayData();
	  System.out.println("=================");
	   
	    Student akansha= new Student();
	    akansha.setData(102,"akansha", "pune", "aws", 1000.0f);
	     akansha.displayData();
}
}
	


