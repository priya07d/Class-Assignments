package oopsconcept;

import java.util.Scanner;
class Students
{
	  int id,n;
	  String name, address, course;
	  float fees;
	   void setData(int id, String name,String address,String course, float fees)
	   {
		   this.id=id;
		   this.name=name;
		   this.address= address;
		   this.course= course;
		   this.fees=fees;
		   
		   this.displayData();
		   
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
public class Demo2 {
	 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Student dipsi = new Student();
	
		
	
	  int id,n;
	  String name, address,  course;
	  float fees;
	  
	  
	  
	  System.out.println("Enter number of Student you want to enter: ");
	 
	
	n= sc.nextInt();
	  for(int i=1;i<=n;i++);
	  {
	  
	  System.out.println("=================");
	  System.out.println("enter id");
	  id = sc.nextInt();
	  sc.nextLine();
	  System.out.println("enter name");
	  name= sc.nextLine(); 
	  System.out.println("enter address");
	  address = sc.nextLine();
	  System.out.println("enter course");
	  course = sc.nextLine();
	  System.out.println(" enter fees:");
	  fees = sc.nextFloat();
	  dipsi.setData(id, name, address,course, fees);
	  dipsi.displayData();
}
          sc.close();
}
}