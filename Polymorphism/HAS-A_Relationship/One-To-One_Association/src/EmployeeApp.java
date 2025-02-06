
public class EmployeeApp {

	public static void main(String[] args) {
		Account account=new Account(40230254654L,"Adarsh Maurya","Saving");
		Employee emp=new Employee("Adarsh Maurya",101,"Prayagraj",account);
		
		emp.getDetails();
	}

}
