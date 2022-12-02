package oopsconcept;

class Employee
{
	int id;
	String name,designation;
	double basicSalary;
	static String organisation ="Anudip";
	
	//parametrized constructor//it will not return any value explicitly,implicitl
	//it will return
	public Employee( int id, String name, String designnation,double basicsalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary= basicsalary;
	}
	public void display()
	{
		System.out.println("Id: "+this.id+" "+"Name:"+this.name + "designation: "+ 
				this.designation+"Basic salary:"+this.basicSalary+" OrganiZation: "+organisation);
	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"priya","Manager",20000);
		Employee emp2= new Employee(102,"shobha","developer",30000);
  emp1.display();
  emp2.display();
	}

}
   /*
    * 1.default constructor -which will assign default value
    * 2.parameterized constructor-which will assign different value according to wish
    * */
