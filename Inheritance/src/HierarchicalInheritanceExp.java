//Hierarchical Inheritance means One parent class can have multiple child class or I can say one parent
//class can have any number of child class or sub-class

class Parent
{
	String name="Parent class";
	void display() {
		System.out.println("Parent method");
	}
}

class Child1 extends Parent
{
	
}
class Child2 extends Parent
{
	
}

public class HierarchicalInheritanceExp {

	public static void main(String[] args) {
		
		Child1 ch1=new Child1();
		Child2 ch2=new Child2();
		
		System.out.println(ch1.name);
		ch1.display();
		System.out.println(ch2.name);
		ch2.display();
	
	}

}
