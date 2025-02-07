//This is the example of Many-To-One association in which many instance of an entity is mapped with one instance of another entity
//Example- Students and Branch
//Many Students HAS-A One Branch
//Students= Target Object
//Branch = Dependent Object
public class StudentApp {

	public static void main(String[] args) {
		//Dependent Object
		Branch branch=new Branch();
		branch.setBname("Computer Science and Engineering");
		branch.setBid(1001);
		
		//Target Object
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		Students s4=new Students();
		Students[] student= {s1,s2,s3,s4};
		
		//Setting data of student 1
		student[0].setSname("Adarsh Maurya");
		student[0].setRollno(24);
		student[0].setCourse("BTech");
		student[0].setYear(3);
		student[0].setSection("A");
		student[0].setBranch(branch);
		//Setting data of student 2
		student[1].setSname("Suraj Shukla");
		student[1].setRollno(35);
		student[1].setCourse("BTech");
		student[1].setYear(3);
		student[1].setSection("D");
		student[1].setBranch(branch);
		//Setting data of student 3
		student[2].setSname("Shivam Tiwari");
		student[2].setRollno(56);
		student[2].setCourse("BTech");
		student[2].setYear(3);
		student[2].setSection("C");
		student[2].setBranch(branch);
		//Setting data of student 4
		student[3].setSname("Utkarsh Pandey");
		student[3].setRollno(57);
		student[3].setCourse("BTech");
		student[3].setYear(3);
		student[3].setSection("D");
		student[3].setBranch(branch);
		
		
		//Printing Details::
		System.out.println("Students Detials   ::");
		for(Students s:student)
		{
			System.out.println("==============================");
			System.out.println("Name         ::"+s.getSname());
			System.out.println("Roll Number  ::"+s.getRollno());
			System.out.println("Course       ::"+s.getCourse());
			System.out.println("Year         ::"+s.getYear());
			System.out.println("Section      ::"+s.getSection());
			System.out.println("Branch Name  ::"+s.getBranchName());
			System.out.println("Branch Id    ::"+s.getBranchId());
			System.out.println();
		}
	}
}