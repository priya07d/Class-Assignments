package oopsconcept;

class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;
	
	public User(int userId,String firstName,String lastName)
	{
		
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public User(int userId,String firstName,String lastName,String address,long phno)
	{
		this(userId, firstName, lastName);
		this.address= address;
		this.phno =phno;
	}
	
	public User(int userId,String firstName,String lastName,String address,long phno, String userName,String password)

	{
		this(userId, firstName, lastName, address, phno);
		this.userName= userName;
		this.password =password;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getfirstName() {
		return firstName;
	}
		
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public long getPhno() {
		return phno;
	}
	}
















public class ConstructorOverloadingEx {

	public static void main(String[] args) {
		User user1= new User(1, "priya", "darshni", "odisha",
				9767899903L, "priya", "p123");
		
		
		System.out.println("ID:  "+user1.getUserId());
		System.out.println("first name:  "+user1.getfirstName());
		System.out.println("last name:  "+user1.getLastName());
		System.out.println("address:  "+user1.getAddress());
		System.out.println("contact no:  "+user1.getPhno());
		System.out.println("userName:  "+user1.getUserName());
		System.out.println("password:  "+user1.getPassword());
	

     System.out.println(" ===================================");
     
     User user2=new User(2," ravindra", "sharma", "up" , 87288789989L);
     
     System.out.println("ID:"+ user2.getUserId()+"\nFirstName: "+ user2.getfirstName()+"\nLastName: "
     		+ user2.getLastName()+"\nAddress:  "+user2.getAddress()+"\ncontact no: "+ user2.getPhno());
	}
}
     