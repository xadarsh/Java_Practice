//Target Object
public class Employee {
	String empName;
	Integer empId;
	String empAddress;
	Account account;
	
	public Employee(String empName,Integer empId,String empAddress,Account account)
	{
		this.empName=empName;
		this.empId=empId;
		this.empAddress=empAddress;
		this.account=account;
	}
	
	public void getDetails()
	{
		System.out.println("Employee Details ::");
		System.out.println("======================");
		System.out.println("Employee Name    ::"+empName);
		System.out.println("Employee Id      ::"+empId);
		System.out.println("Employee Address ::"+empAddress);
		System.out.println();
		System.out.println("Account Details ::");
		System.out.println("======================");
		System.out.println("Account HolderName   ::"+account.accHolderName);
		System.out.println("Account Number       ::"+account.accNo);
		System.out.println("Account Type         ::"+account.accType);
	}
}
