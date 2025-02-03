//Basic program of Inheritance

class Person1
{
	String name="Person 1st";
	
	void display() {
		System.out.println("Method of Person1 class");
	}
}

class Person2 extends Person1
{
	
}

//Here Person2 class is child class of Person1 class (Person1 is parent of Person2)

public class Demo {

	public static void main(String[] args) {
		
		Person2 p2=new Person2();
			System.out.println(p2.name);
			p2.display();

	}

}
