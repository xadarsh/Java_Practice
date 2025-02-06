//Here I've used Constructor Dependency Injection to set the data 
//we can use setter and getter dependency injection also


//Dependent Object
public class Account {
	Long accNo;
	String accHolderName;
	String accType;
	
	public Account(Long accNo,String accHolderName,String accType)
	{
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.accType=accType;
	}
}
