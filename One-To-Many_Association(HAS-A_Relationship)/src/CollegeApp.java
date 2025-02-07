/*
 * In One-To-Many association we can take a example of School and Students
 * here-A School Has-A Students [1:Many]
 * so here
 * Dependent Object is Students
 * Target object is School 
 */




public class CollegeApp {

	public static void main(String[] args) {
		//Dependent Object
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		Students s4=new Students();
		
		//Target Object
		College college=new College();
		
		
		s1.setdata("Adarsh Maurya", 23, "BTech", "CSE", 3, "A");
		s2.setdata("Abhishek Chauhan", 18, "BTech", "Civil", 2, "B");
		s3.setdata("Anurag Kushwaha", 53, "BTech", "Mechanical", 3, "C");
		s4.setdata("Aditya Srivastva", 32, "BTech", "CSE", 3, "A");
		
		Students[] student= {s1,s2,s3,s4};
		
		college.setdata("United Institute Of Technology", "Naini Prayagraj", "UIT1032", student);
		college.getData();
	}

}
