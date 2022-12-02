package oopsconcept;

class UserDetails
 {
	int id;
	String name;
	long phno;
	
	BankAccount bankAccount; //entity reference
	
 Company company; //entity reference
	
public UserDetails(int id, String name, long phno, BankAccount bankAccount) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.bankAccount = bankAccount;
		this.company =company;
	}


public int getId() {
	return id;
}


public String getName() {
	return name;
}


public long getPhno() {
	return phno;
}


public BankAccount getBankAccount() {
	return bankAccount;
}





@Override
public String toString() {
	return "UserDetails [id=" + id + ", name=" + name + ", phno=" + phno + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getPhno()=" + getPhno() + "]";
}

 }



public class AggregationDemo {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount("SBI",4550, "new market");
		BankAccount acc2=new BankAccount("UBI",4550, "airoli");
		
		UserDetails shobha=new UserDetails(1, "shobha", 987650, acc2 );
		UserDetails priya =new UserDetails(1, "priya", 987657, acc1 );
		
		System.out.println(priya);
		
		System.out.println("========================");
		
		
		System.out.println("Id: "+priya.getId());
		System.out.println("Name: "+priya.getName());
		System.out.println("Phone no: "+priya.getPhno());
		
		//bank details
		System.out.println("bank Name: "+priya.getBankAccount().getBankName());
		System.out.println("Account no: "+priya.getBankAccount().getAccountNo());
		System.out.println("Branch: "+priya.getBankAccount().getBranch());
		
	//	System.out.println();
		//company details
	//	System.out.println("bank Name: "+priya.getBankAccount().getBankName());
	//	System.out.println("bank Name: "+priya.getBankAccount().getBankName());
	//	System.out.println("bank Name: "+priya.getBankAccount().getBankName());
		
		
		
		


	}	
	}
