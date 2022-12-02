package oopsconcept;

public class Company {
int companyId;
String companyName;
String address;

	public Company(int companyId, String companyName, String address) {
	super();
	this.companyId = companyId;
	this.companyName = companyName;
	this.address = address;
}

	public int getCompanyId() {
		return companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", address=" + address + "]";
	}

	

	}


