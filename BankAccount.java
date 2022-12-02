package oopsconcept;

public class BankAccount {
String bankName;
float accountNo; 
String branch;



	public BankAccount(String bankName, float accountNo, String branch) {
	super();
	this.bankName = bankName;
	this.accountNo = accountNo;
	this.branch = branch;
}



	public String getBankName() {
		return bankName;
	}



	public float getAccountNo() {
		return accountNo;
	}



	public String getBranch() {
		return branch;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
