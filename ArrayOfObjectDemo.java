package arrayexamples;

import java.util.Scanner;

class Account
{
	int accNo;
	String accHolderName;
	double amount;
	public Account(int accNo, String accHolderName, double amount) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.amount = amount;
	}
	
	
	
	public void Statement()
	{
		System.out.println("Account Number: "+accNo+"\n"+"Account Holder Name: "+accHolderName+"\n"+"Account Balance: "+amount);
	}
}






public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		int accId;
		String holderName;
		double amount;
		Scanner sc =new Scanner(System.in);
		
		Account bank[]=new Account[3];
		
		//
		System.out.println("Enter account details");
		for(int i=0;i<bank.length;i++)
		{
			System.out.println("Enter account no:");
			accId=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Holder Name:");
			holderName=sc.nextLine();
			
			System.out.println("Enter Account Balnace:");
			amount =sc.nextDouble();
			bank[i]=new Account(accId,holderName,amount);
			System.out.println("================");
			
			
		}
		//printdetails
		
		for(int i=0;i<bank.length;i++)
		{
			bank[i].Statement();
			System.out.println("=============");
		
		}
		}
		
		
		
		
		
		
	}


