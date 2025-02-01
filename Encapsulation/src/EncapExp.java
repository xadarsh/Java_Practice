/*
 In java encapsulation is acheived by making the members private and using getter and setter method.
 */

class Student
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class EncapExp {

	public static void main(String[] args) {

		Student s=new Student();
		//setting data
		s.setName("Adarsh");
		s.setAge(23);
		
		//gettign data
		System.out.println("Name:"+s.getName());
		System.out.println("Age:"+s.getAge());
		

	}

}
